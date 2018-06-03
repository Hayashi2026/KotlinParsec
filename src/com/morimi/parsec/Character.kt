package com.morimi.parsec

class Character(private val character: Char): Parser {

    override fun parse(target: String): Result {
        val itemParser = Item()
        val result = itemParser.parse(target)
        if (result.succeeded && result.recognized == character.toString()) {
            return result
        }
        return Result.fail()
    }
}