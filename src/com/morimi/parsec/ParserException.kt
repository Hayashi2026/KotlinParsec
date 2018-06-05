package com.morimi.parsec

class ParserException(val msg: String): RuntimeException() {

    override fun toString(): String {
        return super.toString() + " " + msg
    }
}