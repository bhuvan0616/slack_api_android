package dev.bhuvan.slackapi.model

data class SlackMessage(
    var channel: String? = null,
    var username: String? = null,
    var text: String? = null,
    var attachments: List<Attachment>? = null
)