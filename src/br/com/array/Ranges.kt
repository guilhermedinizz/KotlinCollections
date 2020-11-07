package br.com.array

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print("$s ")
    }

    println()

    val numerosPares = 0..100 step 2

    for (numeros in numerosPares){
        print("$numeros ")
    }
}
