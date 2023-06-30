package org.example.l8ListaDeExercicioRevisao.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosEmMemoria implements BancoDeDados {

    private List<Candidato> candidatos;

    public BancoDeDadosEmMemoria() {
        candidatos = new ArrayList<>();
    }

    @Override
    public void addCandidato(Candidato candidato) {
        candidatos.add(candidato);
        System.out.print("\n[----------------------------------------]");
        System.out.print("\nSucess: Candidato Cadastrado com Sucesso!");
        System.out.print("\n[----------------------------------------]");

    }

    @Override
    public List<Candidato> listarTodosCandidatos() {
        return new ArrayList<>(candidatos);
    }

    @Override
    public void deletaCandidato(String nroMatricula) {
        candidatos.removeIf(candidato -> candidato.getNroMatricula().equals(nroMatricula));
        System.out.print("\n[----------------------------------------]");
        System.out.print("\nSucess: Candidato Deletado com Sucesso!");
        System.out.print("\n[----------------------------------------]");
    }
}
