package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class NoneOfTest {

    @Test
    fun parse() {
        val noneOf = NoneOf(Ch('a'), Ch('b'))
        val result = noneOf.parse("cde")
        assertEquals(result, Result.success("", "cde"))
    }

    @Test
    fun parseFail() {
        val noneOf = NoneOf(Ch('a'), Ch('b'))
        try {
            val result = noneOf.parse("abc")
            assert(false)
        } catch (e: ParserException) {
            assert(true)
        }
    }
}