package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class ChoiceTest {

    @Test
    fun parse() {
        val choiceParser = Choice(Character('a'), Character('b'), Character('c'))
        val result = choiceParser.parse("bcd")
        assertEquals(result, Result.success("b", "cd"))
    }

    @Test
    fun parseFail() {
        val choiceParser = Choice(Character('a'), Character('b'), Character('c'))
        val result = choiceParser.parse("def")
        assertEquals(result, Result.fail())
    }

    @Test
    fun parseEmpty() {
        val choiceParser = Choice(Character('a'), Character('b'), Character('c'))
        val result = choiceParser.parse("")
        assertEquals(result, Result.fail())
    }
}