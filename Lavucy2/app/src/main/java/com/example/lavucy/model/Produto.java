package com.example.lavucy.model;

public class Produto {
    private int id;
    private String nomeProduto;
    private String marcaProduto;
    private String categoria;
    private String tamanho;
    private int quantidade;
    private double precoCusto;
    private double precoVenda;
    private String descrProduto;

    public Produto() {
    }

    public Produto(int id, String nomeProduto, String marcaProduto, String categoria,
                   String tamanho, int quantidade, double precoCusto, double precoVenda,
                   String descrProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.marcaProduto = marcaProduto;
        this.categoria = categoria;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.descrProduto = descrProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getDescrProduto() {
        return descrProduto;
    }

    public void setDescrProduto(String descrProduto) {
        this.descrProduto = descrProduto;
    }
}
