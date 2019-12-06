package com.GabrielLopes.moduloPedidos;

import com.sun.tools.javac.util.List;

public class Pedido {

    private Integer idPedido;

    private List<ModeloQuantidade> modeloQuantidades;

    public List<ModeloQuantidade> getModeloQuantidades() {
        return modeloQuantidades;
    }

    public void setModeloQuantidades(List<ModeloQuantidade> modeloQuantidades) {
        this.modeloQuantidades = modeloQuantidades;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Integer idPedido, List<ModeloQuantidade> modeloQuantidades) {
        this.idPedido = idPedido;
        this.modeloQuantidades = modeloQuantidades;
    }

}
