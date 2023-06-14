package br.com.igor

import br.com.igor.enum.Nivel
import br.com.igor.exception.ListaUsuariosVaziaException
import br.com.igor.exception.UsuarioMatriculadoException
import br.com.igor.model.Conteudo
import br.com.igor.model.Formacao
import br.com.igor.model.Matricula
import br.com.igor.model.Usuario

fun main() {

    //Cadastro de Usuário
    val user = Usuario("Igor");
    val user2 = Usuario("Simone");

    //Cadastro de conteúdo
    val conteudo = Conteudo("Backend - Kotlin");

    //Cadastro de Formação
    val form = Formacao("Kotlin", listOf(conteudo), Nivel.AVANCADO);

    //Cadastro de matrícula
    val mat = Matricula();
    mat.matricular(user, form)


    //Tentativa de matricular o mesmo usuário novamente
    try {
        mat.matricular(user2, form)
        mat.getAllUsuariosMatriculados();
    } catch (e: UsuarioMatriculadoException) {
        println(e.message)
    } catch (e: ListaUsuariosVaziaException) {
        println(e.message)
    }
}