package org.example.l8ListaDeExercicioRevisao.Exercicio1;

import java.text.DecimalFormat;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        BancoDeDados bancoDeDados = new BancoDeDadosEmMemoria();
        ProdutoController produtoController = new ProdutoController(bancoDeDados);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");

        FrontEnd front = new FrontEnd();

        boolean continuarExecucao = true;
        while (continuarExecucao) {

            int opcao = 0;
            opcao = front.menu();
            switch (opcao) {
                case 1:
                    mostrarCadastroProduto(produtoController, front);
                    break;
                case 2:
                    mostrarListagemDeProdutos(produtoController, formatador, front);
                    break;
                case 3:
                    mostrarDeletarProdutos(produtoController, front);
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

    private static void mostrarDeletarProdutos(ProdutoController produtoController, FrontEnd front) {
        String nomeProdutoRemover = front.navNomeProdutoDel();
        produtoController.deletaProduto(nomeProdutoRemover);
    }

    private static void mostrarCadastroProduto(ProdutoController produtoController, FrontEnd front) {
        String nomeProduto = front.navNomeProduto();
        double precoProduto = front.navPrecoProduto();
        produtoController.adicionarProduto(nomeProduto, precoProduto);
    }

    private static void mostrarListagemDeProdutos(ProdutoController produtoController, DecimalFormat formatador, FrontEnd front) {
        List<Produto> produtos = produtoController.listarTodosProdutos();
        front.msgProdutosCadastrados();
        for (Produto produto : produtos) {
            System.out.println("\n----------------------------------------");
            System.out.println("           " + produto.getNome() + " - R$ " + formatador.format(produto.getPreco()));
            System.out.println("----------------------------------------");
        }
    }
}