package com.morimi.parsec.json

import com.morimi.parsec.*

class List(private val parser: Parser, private val separator: Parser): Parser {

    override fun parse(target: String): Result {
        val separatorThenParser = SEQ(separator, parser)
        val listParser = SEQ(parser, Many(separatorThenParser))
        return listParser.parse(target)
    }
}