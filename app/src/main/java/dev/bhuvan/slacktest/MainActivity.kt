package dev.bhuvan.slacktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.bhuvan.slackapi.*
import dev.bhuvan.slackapi.model.SlackMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val slackMessage: SlackMessage = slackMessage {
            attachments {
                attachment {
                    fields {
                        field {

                        }
                        field {

                        }
                    }
                    actions {
                        button {

                        }
                        dropDown {
                            options {
                                option {

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
