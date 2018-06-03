package com.morimi.parsec

class IsAlpha: Predicate {

    override fun satisfy(value: String): Boolean {
        return value[0] in 'A'..'Z' || value[0] in 'a'..'z'
    }
}