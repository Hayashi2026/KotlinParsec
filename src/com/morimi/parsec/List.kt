package com.morimi.parsec

class List(private val parser: Parser, private val separator: Parser): Parser {

    override fun parse(target: String): Result {
        val separatorThenParser = And(separator, parser)
        val listParser = And(parser, Many(separatorThenParser))
        return listParser.parse(target)
    }
}