package org.example.l8ListaDeExercicioRevisao.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosEmMemoria implements BancoDeDados {

    private List<Produto> produtos;

    public BancoDeDadosEmMemoria() {
        produtos = new ArrayList<>();
    }

    @Override
    public void addProduto(Produto produto) {
        try {
            produtos.add(produto);
            System.out.print("\n[----------------------------------------]");
            System.out.print("\nSucess: Produto Cadastrado com Sucesso!");
            System.out.print("\n[----------------------------------------]");

        } catch (Exception e){
            System.out.print("\n[----------------------------------------]");
            System.out.print("\nError: Produto Não foi cadastrado");
            System.out.print("\n[----------------------------------------]");
        }
    }

    @Override
    public List<Produto> listarTodosProdutos() {
        try {
            return produtos;

        } catch (Exception e) {
            System.out.print("\n[----------------------------------------]");
            System.out.print("\nError: Não é possível listar os produtos");
            System.out.print("\n[----------------------------------------]");
            return new ArrayList<>();
        }
    }

    @Override
    public void deletaProduto(String nomeProduto) {
        try {
            produtos.removeIf(produto -> produto.getNome().equals(nomeProduto));
            System.out.print("\n[----------------------------------------]");
            System.out.print("\nSucess: Produto Deletado com Sucesso!");
            System.out.print("\n[----------------------------------------]");
        } catch (Exception e) {
            System.out.print("\n[----------------------------------------]");
            System.out.print("\nError: Produto Não foi deletado");
            System.out.print("\n[----------------------------------------]");
        }
    }
}
