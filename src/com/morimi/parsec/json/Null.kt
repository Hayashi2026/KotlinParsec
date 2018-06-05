package com.morimi.parsec.json

import com.morimi.parsec.Result
import com.morimi.parsec.Text
import com.morimi.parsec.Parser

class Null : Parser {

    override fun parse(target: String): Result {
        val parser = Text("null")
        return parser.parse(target)
    }
}