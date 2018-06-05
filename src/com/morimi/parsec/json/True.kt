package com.morimi.parsec.json

import com.morimi.parsec.Parser
import com.morimi.parsec.Result
import com.morimi.parsec.Text

class True : Parser {

    override fun parse(target: String): Result {
        val parser = Text("true")
        return parser.parse(target)
    }
}