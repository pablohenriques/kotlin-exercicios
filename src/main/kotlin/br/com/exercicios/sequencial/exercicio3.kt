package br.com.exercicios.sequencial

// Faça um Programa que peça dois números e imprima a soma.

fun main() {
    println("Digite dois (2) números: ")

    println("Digite o primeiro número")
    val num1 = readLine()?.toInt()
    println("Digite o segundo número")
    val num2 = readLine()?.toInt()

    val soma = num1!! + num2!!
    println("Resultado da soma: $soma")

}