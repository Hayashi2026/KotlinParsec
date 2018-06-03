package com.morimi.parsec

class IsDigit:Predicate {

    override fun satisfy(value: String): Boolean {
        return value[0] in '0'..'9'
    }
}