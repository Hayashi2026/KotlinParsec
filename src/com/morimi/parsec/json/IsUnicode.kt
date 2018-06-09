package com.morimi.parsec.json

import com.morimi.parsec.Predicate

class IsUnicode : Predicate {

    override fun satisfy(value: String): Boolean {
        if (value.matches(Regex("\\p{all}"))) {
            return true
        }
        return false
    }
}