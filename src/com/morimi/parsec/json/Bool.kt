package com.morimi.parsec.json

import com.morimi.parsec.OR
import com.morimi.parsec.Parser
import com.morimi.parsec.Result

class Bool : Parser {

    val parser = OR(True(), False())

    override fun parse(target: String): Result {
        return parser.parse(target)
    }
}