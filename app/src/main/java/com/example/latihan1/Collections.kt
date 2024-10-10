package com.example.latihan1

fun ContohList() {
    println("==== LIST ====")
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
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

    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Rectangle")
    println(shape)

    shape.remove("Circle")
    println(shape)

    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

