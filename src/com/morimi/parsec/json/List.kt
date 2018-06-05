package com.morimi.parsec.json

import com.morimi.parsec.And
import com.morimi.parsec.Many
import com.morimi.parsec.Parser
import com.morimi.parsec.Result

class List(private val parser: Parser, private val separator: Parser): Parser {

    override fun parse(target: String): Result {
        val separatorThenParser = And(separator, parser)
        val listParser = And(parser, Many(separatorThenParser))
        return listParser.parse(target)
    }
}