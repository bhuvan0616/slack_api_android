package dev.bhuvan.slackapi.model

import okhttp3.OkHttpClient

data class Config(
    val webHookUrl: String,
    val client: OkHttpClient
)