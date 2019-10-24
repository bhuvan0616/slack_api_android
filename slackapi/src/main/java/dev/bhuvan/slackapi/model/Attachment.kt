package dev.bhuvan.slackapi.model

data class Attachment(
    var fallback: String? = null,
    var color: String? = null,
    var pretext: String? = null,
    var author_name: String? = null,
    var author_link: String? = null,
    var author_icon: String? = null,
    var title: String? = null,
    var title_link: String? = null,
    var text: String? = null,
    var image_url: String? = null,
    var thumb_url: String? = null,
    var footer: String? = null,
    var footer_icon: String? = null,
    var ts: Long? = null,
    var fields: List<Field>? = null,
    var actions: List<SlackAction>? =  null
)