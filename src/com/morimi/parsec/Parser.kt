package com.morimi.parsec

interface Parser {

    fun parse(target: String): Result
}