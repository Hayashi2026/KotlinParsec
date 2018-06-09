package com.morimi.parsec.json

import com.morimi.parsec.Item
import com.morimi.parsec.Parser
import com.morimi.parsec.ParserException
import com.morimi.parsec.Result

class Unicode: Parser {

    override fun parse(target: String): Result {
        val item = Item()
        val result = item.parse(target)
        if (result.recognized.matches(Regex("\\p{L}"))){
            return result
        }
        throw ParserException("Expect ${result.recognized} is an unicode character")
    }
}