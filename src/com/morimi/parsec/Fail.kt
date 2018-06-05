package com.morimi.parsec

class Fail(val msg: String): Parser {

    override fun parse(target: String): Result {
        throw ParserException(msg)
    }
}