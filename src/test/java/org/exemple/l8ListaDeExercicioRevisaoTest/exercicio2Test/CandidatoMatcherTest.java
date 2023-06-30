package org.exemple.l8ListaDeExercicioRevisaoTest.exercicio2Test;

import org.example.l8ListaDeExercicioRevisao.Exercicio1.Produto;
import org.example.l8ListaDeExercicioRevisao.Exercicio2.Candidato;
import org.mockito.ArgumentMatcher;

public class CandidatoMatcherTest implements ArgumentMatcher<Candidato> {

    private final Candidato candidatosEsperado;

    public CandidatoMatcherTest(Candidato candidatosEsperado) {
        this.candidatosEsperado = candidatosEsperado;
    }

    @Override
    public boolean matches(Candidato candidatosAtual) {
        return candidatosAtual.getNome().equals(candidatosEsperado.getNome()) &&
                candidatosAtual.getNroMatricula().equals(candidatosEsperado.getNroMatricula()) &&
                candidatosAtual.getNota() == candidatosEsperado.getNota();
    }
}
