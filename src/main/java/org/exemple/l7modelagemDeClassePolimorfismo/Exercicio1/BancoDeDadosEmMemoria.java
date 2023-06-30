package org.exemple.l7modelagemDeClassePolimorfismo.Exercicio1;

import org.example.l8ListaDeExercicioRevisao.Exercicio1.Produto;
import org.example.l8ListaDeExercicioRevisao.Exercicio3.Prato;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosEmMemoria implements BancoDeDados {

    private List<Pais> paises;

    public BancoDeDadosEmMemoria() {
        this.paises = new ArrayList<>();
    }

    public List<Pais> getPaises() {
        return paises;
    }

    @Override
    public void adicionarPais(String nome, String isoCodigo, long populacao, double area, List<String> vizinhos) {
        Pais pais = new Pais(nome);
        pais.setIsoCodigo(isoCodigo);
        pais.setPopulacao(populacao);
        pais.setArea(area);
        pais.getVizinhos().addAll(vizinhos);
        paises.add(pais);
        System.out.println("[-------------------------------]");
        System.out.println("  Vizinho adicionado com sucesso!");
        System.out.println("[-------------------------------]");
    }

    @Override
    public void exibirPaises() {
        if(paises.isEmpty()){
            System.out.println("[-------------------------------]");
            System.out.println("   Não tem prato cadastrado!");
            System.out.println("[-------------------------------]");
        } else {
            System.out.println("[-------------------------------]");
            System.out.println("      Pratos cadastrados!");
            System.out.println("[-------------------------------]");
            for (Pais pais : paises){
                System.out.printf("ISO Código: " + pais.getIsoCodigo());
                System.out.printf("Nome: " + pais.getNome());
                System.out.printf("População: " + pais.getPopulacao());
                System.out.printf("Área: " + pais.getArea());
                System.out.println("Países vizinhos: " + pais.getVizinhos());
            }
        }
    }

    @Override
    public void excluirPais(String nome) {
        try {
            paises.removeIf(pais -> pais.getNome().equals(nome));
            System.out.print("\n[----------------------------------------]");
            System.out.print("\nSucess: Pais Deletado com Sucesso!");
            System.out.print("\n[----------------------------------------]");
        } catch (Exception e) {
            System.out.print("\n[----------------------------------------]");
            System.out.print("\nError: Pais Não foi deletado");
            System.out.print("\n[----------------------------------------]");
        }
    }
}
