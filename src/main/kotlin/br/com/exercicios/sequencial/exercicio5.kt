package br.com.exercicios.sequencial

// Faça um Programa que peça dois números e imprima a soma.
// 100cm == 1m

fun main() {
    print("Informe o valor em metros: ")
    val valorMetros = readLine()!!

    val valorCentimetros = valorMetros.toFloat() * 100
    println("$valorMetros metro (s) é equivalente a $valorCentimetros centímetro (s)")
}