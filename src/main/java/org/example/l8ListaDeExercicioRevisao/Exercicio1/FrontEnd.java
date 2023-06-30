package org.example.l8ListaDeExercicioRevisao.Exercicio1;

import java.util.Scanner;

public class FrontEnd {
    Scanner scanner = new Scanner(System.in);

    public int menu(){
        System.out.println("\n\n[----------------------------------------]");
        System.out.println(" ----------------- Menu ----------------");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Exibir todos os produtos cadastrados");
        System.out.println("3. Remover produto");
        System.out.println("4. Sair");
        System.out.println("[----------------------------------------]");
        System.out.print("Escolha uma opção -> ");
        return scanner.nextInt();
    }

    public String navNomeProduto(){
        System.out.print("Digite o nome do produto: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public double navPrecoProduto(){
        System.out.print("Digite o preço do produto: ");
        return scanner.nextDouble();
    }

    public void msgProdutosCadastrados(){
        System.out.println("Produtos cadastrados:");
    }

    public String navNomeProdutoDel(){
        System.out.print("Digite o nome do produto a ser removido: ");
        scanner.nextLine();
        return new Scanner(System.in).nextLine();
    }

    public void opcaoCadastrarCliente(ProdutoController produtoController, FrontEnd front) {
        String nomeProduto = front.navNomeProduto();
        double precoProduto = front.navPrecoProduto();
        produtoController.adicionarProduto(nomeProduto, precoProduto);
    }

    public void msgOpcaoInvalida(){
        System.out.println("[----------------------------------------]");
        System.out.println("      Opção inválida!");
        System.out.println("[----------------------------------------]");
    }

}
