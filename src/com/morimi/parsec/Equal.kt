package com.morimi.parsec

class Equal(private val text: String): Parser {

    override fun parse(target: String): Result {
        if(text == target) {
            return Result.success(target, "")
        }
        throw ParserException("Expect $target equals $text")
    }
}