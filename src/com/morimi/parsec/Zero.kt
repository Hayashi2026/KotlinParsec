package com.morimi.parsec

class Zero: Parser {

    override fun parse(target: String): Result {
        return Result.success("", target)
    }

}