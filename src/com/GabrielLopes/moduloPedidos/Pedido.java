package com.GabrielLopes.moduloPedidos;

import java.util.HashMap;

public class Pedido {

    private Integer idPedido;

    private HashMap<Modelo,Integer> modeloQuantidades;

    public HashMap<Modelo, Integer> getModeloQuantidades() {
        return modeloQuantidades;
    }

    public void setModeloQuantidades(HashMap<Modelo, Integer> modeloQuantidades) {
        this.modeloQuantidades = modeloQuantidades;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Integer idPedido, HashMap<Modelo,Integer> modeloQuantidades) {
        this.idPedido = idPedido;
        this.modeloQuantidades = modeloQuantidades;
    }

}
