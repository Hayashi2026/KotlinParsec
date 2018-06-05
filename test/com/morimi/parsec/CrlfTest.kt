package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class CrlfTest {

    @Test
    fun parse() {
        val ctrl = Crlf()
        val result = ctrl.parse("\r\n")
        assertEquals(result, Result.success("\r\n", ""))
    }

}