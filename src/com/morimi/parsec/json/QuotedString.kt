package com.morimi.parsec.json

import com.morimi.parsec.*

class QuotedString : Parser {

//    private val character = SAT(IsAlpha(), Item())
//    private val digit = SAT(IsDigit(), Item())
//    private val one = OneOf(character, digit, Space())
//    private val sentence = Many(one)
    private val unicode = SAT(IsUnicode(), Item())
    private val exceptCharacter = NoneOf(Ch('\u0022'), Ch('\u005C'))
    private val escapeCharacter = EscapeCharacter()
    private val jsonString = Many(And(unicode, exceptCharacter))

    override fun parse(target: String): Result {
        return Between(Ch('\"'), jsonString, Ch('\"')).parse(target)
    }
}