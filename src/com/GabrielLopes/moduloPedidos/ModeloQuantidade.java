package com.GabrielLopes.moduloPedidos;

public class ModeloQuantidade {

    private Modelo modelo;

    private Integer quantidade;

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public ModeloQuantidade(Modelo modelo, Integer quantidade) {
        this.modelo = modelo;
        this.quantidade = quantidade;
    }
}
