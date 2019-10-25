package dev.bhuvan.slackapi.model

data class Field(
    var text: String? = null,
    var value: String? = null,
    var short: Boolean? = null
)

data class ButtonAction(
    var name: String? = null,
    var text: String? = null,
    var value: String? = null,
    var type: String? = "button"
) : SlackAction

data class DropDownAction(
    var name: String? = null,
    var text: String? = null,
    var options: List<DropdownOption>? = null,
    var type: String? = "select"
) : SlackAction

data class DropdownOption(
    var text: String? = null,
    var value: String? = null
)

interface SlackAction