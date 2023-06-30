package org.example.l8ListaDeExercicioRevisao.Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class CardapioRestaurante implements Cardapio{

    private List<Prato> pratos;

    public CardapioRestaurante() {
        this.pratos = new ArrayList<>();
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    @Override
    public void adicionarPrato(String nome, List<String> ingredientes) {
        Prato prato = new Prato(nome);
        prato.getIngredientes().addAll(ingredientes);
        pratos.add(prato);
        System.out.println("[-------------------------------]");
        System.out.println("  Prato adicionado com sucesso!");
        System.out.println("[-------------------------------]");
    }

    @Override
    public void exibirPratos() {
        if(pratos.isEmpty()){
            System.out.println("[-------------------------------]");
            System.out.println("   Não tem prato cadastrado!");
            System.out.println("[-------------------------------]");
        } else {
            System.out.println("[-------------------------------]");
            System.out.println("      Pratos cadastrados!");
            System.out.println("[-------------------------------]");
            for (Prato prato : pratos){
                System.out.printf("Nome: " + prato.getNome());
                System.out.println("Ingredientes: " + prato.getIngredientes());
            }
        }
    }

    @Override
    public void excluirPrato(String nome) {
        try {
            pratos.removeIf(prato -> prato.getNome().equals(nome));
            System.out.print("\n[----------------------------------------]");
            System.out.print("\nSucess: Prato Deletado com Sucesso!");
            System.out.print("\n[----------------------------------------]");
        } catch (Exception e) {
            System.out.print("\n[----------------------------------------]");
            System.out.print("\nError: Prato Não foi deletado");
            System.out.print("\n[----------------------------------------]");
        }
    }


}
