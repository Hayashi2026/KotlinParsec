package com.morimi.parsec.json

import com.morimi.parsec.*

class EscapeCharacter: Parser {

    val reverseSolidus = Ch('\\')
    val solidus = Ch('\u002f')
    val backspace = Ch('\b')
    var formfeed = Ch('\u000C')
    val newLine = Ch('\n')
    val carriageReturn = Ch('\r')
    val horizontalTab = Ch('\t')
    val oneOf = OneOf(Quote(), solidus, reverseSolidus, formfeed, backspace, carriageReturn, newLine, horizontalTab)

    override fun parse(target: String): Result {
        return oneOf.parse(target)
    }
}