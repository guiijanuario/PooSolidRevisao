package org.exemple.l7modelagemDeClassePolimorfismo.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String isoCodigo;
    private String nome;
    private long populacao;
    private double area;
    private List<String> vizinhos;

    public Pais(String isoCodigo, String nome, double area) {
        this.isoCodigo = isoCodigo;
        this.nome = nome;
        this.area = area;
        this.vizinhos = new ArrayList<>();
    }

    public Pais(String nome) {
        this.nome = nome;
        this.vizinhos = new ArrayList<>();
    }

    public String getIsoCodigo() {
        return isoCodigo;
    }

    public void setIsoCodigo(String isoCodigo) {
        this.isoCodigo = isoCodigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<String> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<String> vizinhos) {
        this.vizinhos = vizinhos;
    }
}
