package com.morimi.parsec.json

import com.morimi.parsec.*

class QuotedString : Parser {

    val character = SAT(IsAlpha(), Item())
    val digit = SAT(IsDigit(), Item())
    val one = OneOf(character, digit, Space())
    val sentence = Many(one)

    override fun parse(target: String): Result {
        return Between(Ch('\"'), sentence, Ch('\"')).parse(target)
    }
}