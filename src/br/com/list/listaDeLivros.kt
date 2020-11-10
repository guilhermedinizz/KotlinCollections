package br.com.list

fun main() {
    val livro1 = Livro(
            titulo = "Grande Sertão Veredas",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1956
    )

    val licro2 = Livro(
            titulo = "Minha vida de menina",
            autor = "Hela Morley",
            anoPublicacao = 1942,
            editora = "Editora A"
    )

    val livro3 = Livro(
            titulo = "Memórias Póstumas de Brás Cubas",
            autor = "Machado de Assis",
            anoPublicacao = 1881
    )

    val livro4 = Livro(
            titulo = "Iracema",
            autor = "José de Alencar",
            anoPublicacao = 1865,
            editora = "Editora B"
    )

    val livros = mutableListOf(livro1, licro2, livro3, livro4)

    livros.add(
            Livro(
                    titulo = "Sagarana",
                    autor = "João Guimarães Rosa",
                    anoPublicacao = 1946
            )
    )

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.filter { it.autor.startsWith("João") }
            .sortedBy { it.anoPublicacao }
            .imprimeComMarcadores()

}


