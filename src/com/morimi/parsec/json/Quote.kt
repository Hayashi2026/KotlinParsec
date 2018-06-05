package com.morimi.parsec.json

import com.morimi.parsec.Ch
import com.morimi.parsec.Parser
import com.morimi.parsec.Result

class Quote : Parser {

    val parser = Ch('\"')

    override fun parse(target: String): Result {
        return parser.parse(target)
    }
}