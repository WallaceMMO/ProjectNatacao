package com.example.projectnatacao;

public class AtletaOutro extends Atleta {
    private String academia;
    private double recorde;

    public AtletaOutro(String nome, String dataNascimento, String bairro, String academia, double recorde) {
        super(nome, dataNascimento, bairro);
        this.academia = academia;
        this.recorde = recorde;
    }

    public String toString() {
        return super.toString() + ", Academia: " + academia + ", Recorde: " + recorde + " segundos";
    }
}
