package com.example.projectnatacao;

public class Atleta {
    private String nome;
    private String dataNascimento;
    private String bairro;

    public Atleta(String nome, String dataNascimento, String bairro) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.bairro = bairro;
    }

    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Bairro: " + bairro;
    }
}
