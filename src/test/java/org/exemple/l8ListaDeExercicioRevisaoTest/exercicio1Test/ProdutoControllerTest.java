package org.exemple.l8ListaDeExercicioRevisaoTest.exercicio1Test;

import org.example.l8ListaDeExercicioRevisao.Exercicio1.BancoDeDados;
import org.example.l8ListaDeExercicioRevisao.Exercicio1.Produto;
import org.example.l8ListaDeExercicioRevisao.Exercicio1.ProdutoController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ProdutoControllerTest {

    private BancoDeDados bancoDeDados;
    private ProdutoController produtoController;

    @BeforeEach
    void config(){
        bancoDeDados = Mockito.mock(BancoDeDados.class);
        produtoController = new ProdutoController(bancoDeDados);
    }

    @Test
    public void testaSeAdicionaProduto(){
        String nome = "Chocolate";
        double preco = 4.99;
        Produto produto = new Produto(nome, preco);
        produtoController.adicionarProduto(produto.getNome(), produto.getPreco());
        Mockito.verify(bancoDeDados, Mockito.times(1))
                .addProduto(Mockito.argThat(new ProdutoMatcherTest(produto)));
    }

    @Test
    public void testaSeListaTodosOsProdutos(){
        String nomeProduto1 = "Leite Ninho";
        double precoProduto1 = 18.90;
        String nomeProduto2 = "Batata Doce";
        double precoProduto2 = 2.99;
        Produto produto1 = new Produto(nomeProduto1, precoProduto1);
        Produto produto2 = new Produto(nomeProduto2, precoProduto2);
        List<Produto> produtosEsperados = Arrays.asList(produto1, produto2);

        Mockito.when(bancoDeDados.listarTodosProdutos()).thenReturn(produtosEsperados);

        List<Produto> produtosAtuais = produtoController.listarTodosProdutos();
        Assertions.assertEquals(produtosEsperados, produtosAtuais);
    }

    @Test
    public void testRemoverProduto() {
        String nomeProduto = "Abacaxi";
        produtoController.deletaProduto(nomeProduto);
        Mockito.verify(bancoDeDados, Mockito.times(1)).deletaProduto(nomeProduto);
    }


}
