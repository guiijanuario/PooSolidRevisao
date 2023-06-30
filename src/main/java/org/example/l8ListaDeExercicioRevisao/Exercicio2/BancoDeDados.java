package org.example.l8ListaDeExercicioRevisao.Exercicio2;

import java.util.List;

public interface BancoDeDados {

    void addCandidato(Candidato candidato);
    List<Candidato> listarTodosCandidatos();
    void deletaCandidato(String nomeCandidato);

}
