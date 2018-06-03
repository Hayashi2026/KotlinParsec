package com.morimi.parsec

class Integer: Parser {
    private val parser = OneOrMany(32, Digit())

    override fun parse(target: String): Result {
        return parser.parse(target)
    }
}