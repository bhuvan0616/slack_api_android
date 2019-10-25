package dev.bhuvan.slackapi

import com.google.gson.Gson
import dev.bhuvan.slackapi.model.Config
import dev.bhuvan.slackapi.model.SlackMessage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

class SlackWebhook private constructor(private val config: Config) {

    fun post(slackMessage: SlackMessage) {
        GlobalScope.launch(Dispatchers.IO) {
            config.client.newCall(createRequest(slackMessage)).execute()
        }
    }

    private fun createRequest(slackMessage: SlackMessage): Request {
        val requestBody = Gson().toJson(slackMessage)
            .toRequestBody("application/json; charset=utf-8".toMediaType())
        return Request.Builder().url(config.webHookUrl).post(requestBody).build()
    }

    companion object {
        fun create(config: Config) = SlackWebhook(config)
    }
}