package org.example.l8ListaDeExercicioRevisao.Exercicio1;

import java.util.List;

public interface BancoDeDados {

    void addProduto(Produto produto);
    List<Produto> listarTodosProdutos();
    void deletaProduto(String nomeProduto);

}
