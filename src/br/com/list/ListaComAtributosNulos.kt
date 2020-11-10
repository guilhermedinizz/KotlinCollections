package br.com.list

fun main(){
    listaLivros.groupBy { it.editora ?: "Editora desconhecida" }
            .forEach{ (editora, livros ) ->
                println("$editora: ${livros.joinToString { it.titulo }}")
            }
}