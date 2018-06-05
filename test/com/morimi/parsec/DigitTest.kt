package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class DigitTest {

    @Test
    fun parse() {
        val digit = Digit()
        val result = digit.parse("456")
        assertEquals(result, Result.success("4", "56"))
    }

}