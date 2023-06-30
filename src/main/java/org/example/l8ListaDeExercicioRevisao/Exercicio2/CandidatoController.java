package org.example.l8ListaDeExercicioRevisao.Exercicio2;

import java.util.List;

public class CandidatoController {

    private BancoDeDados bancoDeDados;

    public CandidatoController(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void addCandidato(String nome, String nroMatricula, double nota) {
        Candidato candidato = new Candidato(nome, nroMatricula, nota);
        bancoDeDados.addCandidato(candidato);
    }

    public List<Candidato> listarTodosCandidatos() {
        return bancoDeDados.listarTodosCandidatos();
    }

    public void deletaCandidato(String nomeCandidato) {
        bancoDeDados.deletaCandidato(nomeCandidato);
    }
}
