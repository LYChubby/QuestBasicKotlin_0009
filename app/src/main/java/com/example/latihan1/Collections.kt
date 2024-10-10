package com.example.latihan1

fun ContohList() {
    println("==== LIST ====")
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableList<string> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Circle")
    println(shape)

    shape.remove("Triangle")
    println(shape)

    shape[0] = "Oval"
    println(shape)
}

fun ContohSet() {
    println()
    println("==== SET ====")

    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)
}

