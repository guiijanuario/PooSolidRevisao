package org.example.l8ListaDeExercicioRevisao.Exercicio2;

import java.util.Scanner;

public class FrontEnd {
    Scanner scanner = new Scanner(System.in);

    public int menu(){
        System.out.println("\n\n[--------- Sistema de Vestibular --------]");
        System.out.println(" ------------------ Menu -----------------");
        System.out.println("1. Adicionar candidato");
        System.out.println("2. Exibir todos os candidatos cadastrados");
        System.out.println("3. Remover candidato");
        System.out.println("4. Sair");
        System.out.println("[----------------------------------------]");
        System.out.print("Escolha uma opção -> ");
        return scanner.nextInt();
    }

    public String navNomeCandidato(){
        System.out.print("Digite o nome do candidato: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String navNroMatriculaCandidato(){
        System.out.print("Digite o número de matricula: ");
        return scanner.nextLine();
    }

    public double navNotaCandidato(){
        System.out.print("Digite a nota do candidato: ");
        return scanner.nextDouble();
    }

    public void msgCandidatosCadastrados(){
        System.out.println("Candidatos cadastrados:");
    }

    public String navNomeCandidatoDel(){
        System.out.print("Digite o número de matricula do candidato a ser removido: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void msgOpcaoInvalida(){
        System.out.println("[----------------------------------------]");
        System.out.println("      Opção inválida!");
        System.out.println("[----------------------------------------]");
    }

}
