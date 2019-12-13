package com.GabrielLopes.moduloPedidos;

import java.util.HashMap;

public class Pedido {

    private static Integer contadorIdPedido = 0;

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

    public Pedido(HashMap<Modelo,Integer> modeloQuantidades) {
        this.idPedido = this.contadorIdPedido;
        this.modeloQuantidades = modeloQuantidades;
        contadorIdPedido++;
    }

}
