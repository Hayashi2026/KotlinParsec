package com.morimi.parsec.json

import com.morimi.parsec.*

class QuotedString : Parser {

    val character = SAT(IsAlpha(), Item())
    val charaterOrBlank = OR(character, Space())
    val sentence = Many(charaterOrBlank)

    override fun parse(target: String): Result {
        return Between(Ch('\"'), sentence, Ch('\"')).parse(target)
    }
}