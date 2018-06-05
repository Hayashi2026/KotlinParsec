package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class ChTest {

    @Test
    fun parse() {
        val character = Ch('c')
        val result = character.parse("chat")
        assertEquals(result, Result.success("c", "hat"))
    }

    @Test
    fun parseFail() {
        try {
            val character = Ch('c')
            character.parse("test")
        } catch (exception: Exception) {
            assert(exception is ParserException)
        }
    }
}