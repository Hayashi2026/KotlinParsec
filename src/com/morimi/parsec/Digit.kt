package com.morimi.parsec

class Digit: Parser {

    private val parser = SAT(IsDigit(), Item())

    override fun parse(target: String): Result {
        return parser.parse(target)
    }
}