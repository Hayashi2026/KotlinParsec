package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class ChoiceTest {

    @Test
    fun parse() {
        val choiceParser = Choice(Ch('a'), Ch('b'), Ch('c'))
        val result = choiceParser.parse("bcd")
        assertEquals(result, Result.success("b", "cd"))
    }

    @Test
    fun parseFail() {
        try {
            val choiceParser = Choice(Ch('a'), Ch('b'), Ch('c'))
            choiceParser.parse("def")
        } catch (exception: Exception) {
            assert(exception is ParserException)
        }
    }

}