package org.exemple.l8ListaDeExercicioRevisaoTest.exercicio3Test;

import org.example.l8ListaDeExercicioRevisao.Exercicio3.CardapioRestaurante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardapioRestauranteTest {

    private CardapioRestaurante cardapio;

    @BeforeEach
    void config(){
        cardapio = new CardapioRestaurante();
    }

    @Test
    void adicionarPratoTeste() {

        String nome = "Macarrão";
        List<String> ingredientes = Arrays.asList("Molho", "Massa");

        cardapio.adicionarPrato(nome, ingredientes);

        assertEquals(1, cardapio.getPratos().size());
        assertEquals(nome, cardapio.getPratos().get(0).getNome());
        assertEquals(ingredientes, cardapio.getPratos().get(0).getIngredientes());
    }

    @Test
    void exibirPratosTeste() {
        String nome1 = "Strogonoff";
        List<String> ingredientes1 = Arrays.asList("Frango", "Creme de leite");
        String nome2 = "Salada";
        List<String> ingredientes2 = Arrays.asList("Tomate", "Alface");
        cardapio.adicionarPrato(nome1, ingredientes1);
        cardapio.adicionarPrato(nome2, ingredientes2);

        cardapio.exibirPratos();
    }

    @Test
    void excluirPratoTeste() {
        String nome = "Cachorro Quente";
        List<String> ingredientes = Arrays.asList("Pão", "Salsicha");
        cardapio.adicionarPrato(nome, ingredientes);

        cardapio.excluirPrato(nome);

        assertEquals(0, cardapio.getPratos().size());
    }

}
