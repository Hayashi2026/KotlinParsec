package com.morimi.parsec.json

import org.junit.Test

import org.junit.Assert.*

class ArrayTest {

    @Test
    fun parse() {
        val array = Array()
        array.parse("[\"Swift on iOS\",\"C on Linux\"]")
    }
}