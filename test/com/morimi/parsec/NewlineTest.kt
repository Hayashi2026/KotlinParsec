package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class NewlineTest {

    @Test
    fun parse() {
        val newline = Newline()
        val result = newline.parse("\r\n")
        assertEquals(result, Result.success("\r\n", ""))
    }

    @Test
    fun parse1() {
        val newline = Newline()
        val result = newline.parse("\naaa")
        assertEquals(result, Result.success("\r\n", "aaa"))
    }
}