package com.morimi.parsec.json

import com.morimi.parsec.*

class QuotedString : Parser {

    private val reverseSolidus = Ch('\\')
    private val solidus = Ch('\u002f')
    private val backspace = Ch('\b')
    private var formfeed = Ch('\u000C')
    private val newLine = Ch('\n')
    private val carriageReturn = Ch('\r')
    private val horizontalTab = Ch('\t')

    private val unicode = SAT(IsUnicode(), Item())

    private val isExceptCharacter = object : Predicate {
        override fun satisfy(value: String): Boolean {
            return value[0] != '\"' && value[0] != '\\'
        }
    }
    private val jsonString = Many(SAT(isExceptCharacter, unicode))


    override fun parse(target: String): Result {
        return Between(Ch('\"'), jsonString, Ch('\"')).parse(target)
    }
}