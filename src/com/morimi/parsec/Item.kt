package com.morimi.parsec

class Item: Parser {
    override fun parse(target: String): Result {
        if (target.isNotEmpty()) {
            return Result.success(target.substring(0, 1), target.substring(1))
        }
        throw ParserException("Expect $target is not empty")
    }
}