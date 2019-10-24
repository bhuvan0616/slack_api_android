package dev.bhuvan.slackapi.model

data class Field(
    var text: String? = null,
    var value: String? = null,
    var short: Boolean? = null
)

data class ButtonAction(
    var name: String? = null,
    var text: String? = null,
    var type: String? = null,
    var value: String? = null
) : SlackAction

data class DropDownAction(
    var name: String? = null,
    var text: String? = null,
    var type: String? = null,
    var options: List<DropdownOption>? = null
) : SlackAction

data class DropdownOption(
    var text: String? = null,
    var value: String? = null
)

interface SlackAction