package com.example.projectnatacao;

public class AtletaSenior extends Atleta {
    private boolean problemasCardiacos;

    public AtletaSenior(String nome, String dataNascimento, String bairro, boolean problemasCardiacos) {
        super(nome, dataNascimento, bairro);
        this.problemasCardiacos = problemasCardiacos;
    }

    public String toString() {
        return super.toString() + ", Problemas Cardíacos: " + (problemasCardiacos ? "Sim" : "Não");
    }
}
