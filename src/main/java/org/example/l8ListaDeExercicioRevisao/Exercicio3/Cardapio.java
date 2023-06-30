package org.example.l8ListaDeExercicioRevisao.Exercicio3;

import java.util.List;

public interface Cardapio {
    void adicionarPrato(String nome, List<String> ingredientes);
    void exibirPratos();
    void excluirPrato(String nome);
}
