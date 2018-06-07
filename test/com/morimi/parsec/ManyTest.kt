package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class ManyTest {

    @Test
    fun parseMany() {
        val parser = Many(Ch('j'))
        val result = parser.parse("jjjjjjjjjhhhhhhhh")
        assertEquals(result, Result.success("jjjjjjjjj", "hhhhhhhh"))
    }

    @Test
    fun parseZero() {
        val parser = Many(Ch('j'))
        val result = parser.parse("hhhhhhhhhhh")
        assertEquals(result, Result.success("", "hhhhhhhhhhh"))
    }
}