package com.morimi.parsec

data class Result(var recognized: String, var remain: String) {

    companion object {

        fun success(recognized: String, remain: String): Result {
            return Result(recognized, remain)
        }

        fun concat(result1: Result, result2: Result): Result {
            return Result(result1.recognized + result2.recognized, result2.remain)
        }
    }
}