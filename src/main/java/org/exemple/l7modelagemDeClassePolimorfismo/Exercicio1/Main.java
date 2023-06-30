package org.exemple.l7modelagemDeClassePolimorfismo.Exercicio1;

import org.example.l8ListaDeExercicioRevisao.Exercicio3.CardapioRestaurante;
import org.example.l8ListaDeExercicioRevisao.Exercicio3.FrontEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoDeDadosEmMemoria bancoDeDados = new BancoDeDadosEmMemoria();

        FrontEnd front = new FrontEnd();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n[----------------------------------------]");
            System.out.println("----------- Menu de Países ----------");
            System.out.println("1. Adicionar um Pais");
            System.out.println("2. Exibir pais cadastrados");
            System.out.println("3. Excluir pais");
            System.out.println("4. Sair");
            System.out.println("[----------------------------------------]");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("Digite o nome do pais: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o Código ISO do Pais: ");
                    String isoPais = scanner.nextLine();

                    System.out.print("Digite a população: ");
                    long populacao = scanner.nextLong();

                    System.out.print("Digite a área: ");
                    double area = scanner.nextDouble();

                    System.out.print("Digite a quantidade de vizinhos esse pais tem: ");
                    int quantidadeVizinhos = scanner.nextInt();
                    scanner.nextLine();

                    List<String> vizinhos = new ArrayList<>();
                    for (int i = 0; i < quantidadeVizinhos; i++) {
                        System.out.print("Digite o vizinho " + (i + 1) + ": ");
                        String vizinho = scanner.nextLine();
                        vizinhos.add(vizinho);
                    }

                    bancoDeDados.adicionarPais(nome, isoPais, populacao, area, vizinhos);

                    break;
                case 2:
                    bancoDeDados.exibirPaises();
                    break;
                case 3:
                    System.out.print("Digite o nome do Pais a ser excluído: ");
                    String delNome = scanner.nextLine();

                    bancoDeDados.excluirPais(delNome);
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
