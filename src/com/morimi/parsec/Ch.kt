package com.morimi.parsec

class Ch(private val character: Char): Parser {

    override fun parse(target: String): Result {
        val itemParser = Item()
        val result = itemParser.parse(target)
        if (result.recognized == character.toString()) {
            return result
        }
        throw ParserException("Expect ${result.recognized} == $character while parsing \"$target\"")
    }

    override fun toString(): String {
        return "Character \"$character\" parser"
    }
}