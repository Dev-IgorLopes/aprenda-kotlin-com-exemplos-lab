package br.com.igor.model

import br.com.igor.enum.Nivel

data class Formacao(val nome: String, var conteudos: List<Conteudo>, val nivel: Nivel) {



}