package br.com.list

fun main(){
    val prateleira = Prateleira(genero = "literatura", livros = listaLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()


}