package dev.bhuvan.slackapi

import dev.bhuvan.slackapi.model.*

fun slackMessage(block: SlackMessage.() -> Unit) = SlackMessage().apply(block)

fun SlackMessage.attachments(block: MutableList<Attachment>.() -> Unit) {
    attachments = arrayListOf<Attachment>().apply(block)
}

fun MutableList<Attachment>.attachment(block: Attachment.() -> Unit) {
    add(Attachment().apply(block))
}

fun Attachment.fields(block: MutableList<Field>.() -> Unit) {
    fields = arrayListOf<Field>().apply(block)

}

fun MutableList<Field>.field(block: Field.() -> Unit) {
    add(Field().apply(block))
}

fun Attachment.actions(block: MutableList<SlackAction>.() -> Unit) {
    actions = arrayListOf<SlackAction>().apply(block)
}

fun MutableList<SlackAction>.button(block: ButtonAction.() -> Unit) {
    add(ButtonAction().apply(block))
}

fun MutableList<SlackAction>.dropDown(block: DropDownAction.() -> Unit) {
    add(DropDownAction().apply(block))
}

fun DropDownAction.options(block: MutableList<DropdownOption>.() -> Unit) {
    options = arrayListOf<DropdownOption>().apply(block)
}

fun MutableList<DropdownOption>.option(block: DropdownOption.() -> Unit) {
    add(DropdownOption().apply(block))
}
