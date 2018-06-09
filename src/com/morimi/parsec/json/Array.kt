package com.morimi.parsec.json

import com.morimi.parsec.*

class Array: Parser {

    override fun parse(target: String): Result {
        val beginArray = Ch('[')
        val endArray = Ch(']')
        val comma = Ch(',')
        val values = List(Json(), comma)
        val emptyArray = Between(beginArray, Text(""), endArray)
        return Between(beginArray, OR(values, Text("")), endArray).parse(target)
    }
}