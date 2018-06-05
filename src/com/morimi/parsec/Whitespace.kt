package com.morimi.parsec

class Whitespace: Parser {

    override fun parse(target: String): Result {
        val char = target[0]
        if (Character.isWhitespace(char)) {
            return Result.success(char.toString(), target.substring(1, target.length))
        }
        throw ParserException("Expect $target start with a Whitespace")
    }
}