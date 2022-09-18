package br.com.exercicios.sequencial

// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

fun main() {
    println("Digite as notas bimestrais (4 notas) do aluno (a)")

    print("Bimestre: 1: ")
    val b1 = readLine()?.toFloat()

    print("Bimestre: 2: ")
    val b2 = readLine()?.toFloat()

    print("Bimestre: 3: ")
    val b3 = readLine()?.toFloat()

    print("Bimestre: 4: ")
    val b4 = readLine()?.toFloat()

    val media = (b1!!+b2!!+b3!!+b4!!) / 4
    println("Média final do aluno: $media")

}