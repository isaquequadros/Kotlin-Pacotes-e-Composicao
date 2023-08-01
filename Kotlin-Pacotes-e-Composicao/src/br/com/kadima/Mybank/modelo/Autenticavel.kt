package br.com.kadima.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}