package com.example.latihan1

fun nullSafety() {
    var neverNull: String = "This Can't Be Null"

    var nullable: String?= "You Can Keep a Null Here"
    nullable = null

    if (neverNull == null) {
        println("InferredNonNull is Null")
    } else {
        println("InferredNonNull is Not Null")
    }

    println(neverNull.length)
    println(nullable?.length)

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
}

fun main() {
    nullSafety()
}