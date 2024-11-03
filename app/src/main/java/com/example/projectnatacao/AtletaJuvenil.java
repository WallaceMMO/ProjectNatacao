package com.example.projectnatacao;

public class AtletaJuvenil extends Atleta {
    private int anosPratica;

    public AtletaJuvenil(String nome, String dataNascimento, String bairro, int anosPratica) {
        super(nome, dataNascimento, bairro);
        this.anosPratica = anosPratica;
    }

    public String toString() {
        return super.toString() + ", Anos de Prática: " + anosPratica;
    }
}
