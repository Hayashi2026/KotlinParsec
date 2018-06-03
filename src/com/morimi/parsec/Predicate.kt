package com.morimi.parsec

interface Predicate {

    fun satisfy(value: String): Boolean
}