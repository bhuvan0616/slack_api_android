package dev.bhuvan.slacktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.bhuvan.slackapi.*
import dev.bhuvan.slackapi.model.Config
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val slackWebhook = SlackWebhook.create(
            Config(
                "https://hooks.slack.com/services/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",
                OkHttpClient()
            )
        )

        uiBtnSend.setOnClickListener {
            slackWebhook.post(createMessage())
        }
    }

    private fun createMessage() = slackMessage {
        text = "hey"
            attachments {
                attachment {
                    title = "Title One"
                    text = "Some text"
                    actions {
                        button {
                            name = "Click"
                            text = "Click Me"
                            value = "Hello"
                        }
                    }
                }
            }
    }
}
