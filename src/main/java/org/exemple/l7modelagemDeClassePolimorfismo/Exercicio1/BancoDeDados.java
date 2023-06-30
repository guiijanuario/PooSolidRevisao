package org.exemple.l7modelagemDeClassePolimorfismo.Exercicio1;

import org.example.l8ListaDeExercicioRevisao.Exercicio1.Produto;

import java.util.List;

public interface BancoDeDados {

    void adicionarPais(String nome, String isoCodigo, long populacao, double area, List<String> vizinhos);
    void exibirPaises();
    void excluirPais(String nome);

}
