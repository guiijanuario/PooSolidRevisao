package org.example.l8ListaDeExercicioRevisao.Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardapioRestaurante cardapio = new CardapioRestaurante();

        FrontEnd front = new FrontEnd();

        int opcao = 0;
        while (opcao != 4) {
            front.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do prato: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a quantidade de ingredientes: ");
                    int quantidadeIngredientes = scanner.nextInt();
                    scanner.nextLine();

                    List<String> ingredientes = new ArrayList<>();
                    for (int i = 0; i < quantidadeIngredientes; i++) {
                        System.out.print("Digite o ingrediente " + (i + 1) + ": ");
                        String ingrediente = scanner.nextLine();
                        ingredientes.add(ingrediente);
                    }

                    cardapio.adicionarPrato(nome, ingredientes);

                    break;
                case 2:
                    cardapio.exibirPratos();
                    break;
                case 3:
                    System.out.print("Digite o nome do prato a ser excluído: ");
                    String delNome = scanner.nextLine();

                    cardapio.excluirPrato(delNome);
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
