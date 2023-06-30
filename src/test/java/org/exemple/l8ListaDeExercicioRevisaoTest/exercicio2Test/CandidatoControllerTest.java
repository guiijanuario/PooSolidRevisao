package org.exemple.l8ListaDeExercicioRevisaoTest.exercicio2Test;

import org.example.l8ListaDeExercicioRevisao.Exercicio2.BancoDeDados;
import org.example.l8ListaDeExercicioRevisao.Exercicio2.Candidato;
import org.example.l8ListaDeExercicioRevisao.Exercicio2.CandidatoController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class CandidatoControllerTest {

    private BancoDeDados bancoDeDados;
    private CandidatoController candidatoController;

    @BeforeEach
    void config(){
        bancoDeDados = Mockito.mock(BancoDeDados.class);
        candidatoController = new CandidatoController(bancoDeDados);
    }

    @Test
    public void testaSeAdicionaCandidato(){
        String nome = "Guilherme Januário";
        String nroMatricula = "1234-5";
        double nota = 90.5;
        Candidato candidato = new Candidato(nome, nroMatricula, nota);
        candidatoController.addCandidato(candidato.getNome(), candidato.getNroMatricula(), candidato.getNota());
        Mockito.verify(bancoDeDados, Mockito.times(1))
                .addCandidato(Mockito.argThat(new CandidatoMatcherTest(candidato)));
    }

    @Test
    public void testaSeListaTodosOsCandidatos(){
        String nomeCandidato1 = "Candidato Teste 1";
        String nroMatriculaCandidato1 = "1234-5";
        double notaCandidato1 = 90.5;
        String nomeCandidato2 = "Candidato Teste 2";
        String nroMatriculaCandidato2 = "5432-1";
        double notaCandidato2 = 95.8;

        Candidato candidato1 = new Candidato(nomeCandidato1, nroMatriculaCandidato1, notaCandidato1);
        Candidato candidato2 = new Candidato(nomeCandidato2, nroMatriculaCandidato2, notaCandidato2);
        List<Candidato> candidatosEsperados = Arrays.asList(candidato1, candidato2);
        Mockito.when(bancoDeDados.listarTodosCandidatos()).thenReturn(candidatosEsperados);

        List<Candidato> candidatosAtuais = candidatoController.listarTodosCandidatos();
        Assertions.assertEquals(candidatosEsperados, candidatosAtuais);
    }

    @Test
    public void testRemoverCandidato() {
        String nroMatriculaCandidato = "1234-5";
        candidatoController.deletaCandidato(nroMatriculaCandidato);
        Mockito.verify(bancoDeDados, Mockito.times(1)).deletaCandidato(nroMatriculaCandidato);
    }


}
