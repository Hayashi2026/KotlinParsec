package com.morimi.parsec

class Fail: Parser {

    override fun parse(target: String): Result {
        return Result.fail()
    }
}