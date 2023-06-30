package org.example.l8ListaDeExercicioRevisao.Exercicio2;

public class Candidato {

    private String nome;
    private String nroMatricula;
    private double nota;

    public Candidato(String nome, String nroMatricula, double nota) {
        this.nome = nome;
        this.nroMatricula = nroMatricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getNroMatricula() {
        return nroMatricula;
    }

    public double getNota() {
        return nota;
    }

}
