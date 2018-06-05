package com.morimi.parsec

class Lf: Parser {

    private val parser = Ch('\n')

    override fun parse(target: String): Result {
        return parser.parse(target)
    }
}