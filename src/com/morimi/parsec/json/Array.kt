package com.morimi.parsec.json

import com.morimi.parsec.Between
import com.morimi.parsec.Ch
import com.morimi.parsec.Parser
import com.morimi.parsec.Result

class Array: Parser {

    override fun parse(target: String): Result {
        val beginArray = Ch('[')
        val endArray = Ch(']')
        val comma = Ch(',')
        val values = List(Json(), comma)
        return Between(beginArray, values, endArray).parse(target)
    }
}