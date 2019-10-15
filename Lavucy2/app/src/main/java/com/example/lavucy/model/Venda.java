package com.example.lavucy.model;

import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private Cliente cliente;
    private List<Produto> produtos;
    private double valor;
    private Date datacompra;
    private int quantidade;

    public Venda() {
    }

    public Venda(int id, Cliente cliente, List<Produto> produtos, double valor, Date datacompra, int quantidade) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
        this.valor = valor;
        this.datacompra = datacompra;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(Date datacompra) {
        this.datacompra = datacompra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", produtos=" + produtos +
                ", valor=" + valor +
                ", datacompra=" + datacompra +
                ", quantidade=" + quantidade +
                '}';
    }
}
