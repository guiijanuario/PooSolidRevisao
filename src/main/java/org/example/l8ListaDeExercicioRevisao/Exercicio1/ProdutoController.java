package org.example.l8ListaDeExercicioRevisao.Exercicio1;

import java.util.List;

public class ProdutoController {

    private BancoDeDados bancoDeDados;

    public ProdutoController(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void adicionarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        bancoDeDados.addProduto(produto);
    }

    public List<Produto> listarTodosProdutos() {
        return bancoDeDados.listarTodosProdutos();
    }

    public void deletaProduto(String nomeProduto) {
        bancoDeDados.deletaProduto(nomeProduto);
    }
}
