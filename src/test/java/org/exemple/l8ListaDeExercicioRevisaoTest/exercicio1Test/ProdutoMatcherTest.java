package org.exemple.l8ListaDeExercicioRevisaoTest.exercicio1Test;

import org.example.l8ListaDeExercicioRevisao.Exercicio1.Produto;
import org.mockito.ArgumentMatcher;

public class ProdutoMatcherTest implements ArgumentMatcher<Produto> {

    private final Produto produtoEsperado;

    public ProdutoMatcherTest(Produto produtoEsperado) {
        this.produtoEsperado = produtoEsperado;
    }

    @Override
    public boolean matches(Produto produtoAtual) {
        return produtoAtual.getNome().equals(produtoEsperado.getNome()) &&
                produtoAtual.getPreco() == produtoEsperado.getPreco();
    }
}
