package com.morimi.parsec.json

import org.junit.Test

import org.junit.Assert.*

class ObjectTest {

    @Test
    fun parse() {
        val parser = Object()
        val result = parser.parse("{\"skills\":[\"Swift on iOS\",\"C on Linux\"],\"projects\":[{\"name\":\"coolie\",\"intro\":\"Generate models from a JSON file\"},{\"name\":\"parser\",\"intro\":null}]}")
    }
}