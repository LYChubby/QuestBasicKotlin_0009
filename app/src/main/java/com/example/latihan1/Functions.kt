package com.example.latihan1

fun withoutParameter() {
    println("=== WithoutParameter ===")
    println("Hello, World")
}

fun withParameter(name: String) {
    println()
    println("=== WithParameter ===")
    println("Hello, $name")
}

fun withNamedArgument(name: String, age: Int) {
    println()
    println("=== WithNamedArgument ===")
    println("Hello, $name You Are $age Years Old")
}

fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("=== WithDefaultParameter ===")
    println("Hello, $name You Are $age Years Old")
}

fun withReturn(panjang: Int, lebar: Int) {
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument("John", 30)
    withDefaultParameter(age= 30)
    withReturn(20, 30)
}