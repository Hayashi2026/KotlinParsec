package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class EndOfLineTest {

    @Test
    fun parse() {
        val eof = EndOfLine()
        val result = eof.parse("\n\r")
        assertEquals(result, Result.success("\n\r", ""))
    }
}