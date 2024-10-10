package com.example.latihan1

class Motor() {

    class Contact(val id: Int, var email: String)
}

fun main() {
    val contact = Motor.Contact(1, "mary@gmail.com")
    println(contact.email)

    contact.email = "john@gmail.com"
    println(contact.email)

}