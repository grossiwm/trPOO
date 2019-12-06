package com.GabrielLopes.moduloPedidos;

import com.sun.tools.javac.util.List;

public class Pedido {

    private List<ModeloQuantidade> modeloQuantidades;

    public List<ModeloQuantidade> getModeloQuantidades() {
        return modeloQuantidades;
    }

    public void setModeloQuantidades(List<ModeloQuantidade> modeloQuantidades) {
        this.modeloQuantidades = modeloQuantidades;
    }

    public Pedido(List<ModeloQuantidade> modeloQuantidades) {
        this.modeloQuantidades = modeloQuantidades;
    }
}
