package br.com.kadima.bytebank

import br.com.kadima.bytebank.modelo.Cliente
import br.com.kadima.bytebank.modelo.Endereco
import br.com.kadima.bytebank.teste.testaFuncionarios

fun main() {
    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "kadima",
        cep = "00000-0700"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "kadima",
        cep = "00000-0700"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${
    Integer.toHexString(endereco.hashCode())}")
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}