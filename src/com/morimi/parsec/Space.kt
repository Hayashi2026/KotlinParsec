package com.morimi.parsec

class Space: Parser {

    override fun parse(target: String): Result {
        val char = target[0]
        if (Character.isSpaceChar(char)) {
            return Result.success(char.toString(), target.substring(1, target.length))
        }
        throw ParserException("Expect $target start with a Space")
    }
}