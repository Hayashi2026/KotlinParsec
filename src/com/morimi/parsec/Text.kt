package com.morimi.parsec

class Text(private val text: String): Parser {

    override fun parse(target: String): Result {
        if (target.startsWith(text)) {
            return Result.success(text, target.substring(text.length, target.length))
        }
        return Result.fail()
    }
}