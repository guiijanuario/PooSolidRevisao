package org.example.l8ListaDeExercicioRevisao.Exercicio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BancoDeDados bancoDeDados = new BancoDeDadosEmMemoria();
        CandidatoController candidatoController = new CandidatoController(bancoDeDados);

        FrontEnd front = new FrontEnd();

        boolean continuarExecucao = true;
        while (continuarExecucao) {

            int opcao = 0;
            opcao = front.menu();

            switch (opcao) {
                case 1:
                    String nomeCandidato = front.navNomeCandidato();
                    String nroMatricula = front.navNroMatriculaCandidato();
                    double notaCandidato = front.navNotaCandidato();
                    candidatoController.addCandidato(nomeCandidato, nroMatricula, notaCandidato);
                    break;
                case 2:
                    List<Candidato> candidatoes = candidatoController.listarTodosCandidatos();
                    front.msgCandidatosCadastrados();
                    for (Candidato candidato : candidatoes) {
                        System.out.println("\n----------------------------------------");
                        System.out.println("    Nome Candidato: " + candidato.getNome() + "\n    Número de Matricula: " + candidato.getNroMatricula()
                                + "\n    Nota: " + candidato.getNota());
                        System.out.println("----------------------------------------");
                    }
                    break;
                case 3:
                    String nomeProdutoRemover = front.navNomeCandidatoDel();
                    candidatoController.deletaCandidato(nomeProdutoRemover);
                    break;
                case 4:
                    continuarExecucao = false;
                    break;
                default:
                    front.msgOpcaoInvalida();
                    break;
            }
        }
    }
}