package com.GabrielLopes.moduloProducao;

import com.GabrielLopes.moduloPedidos.Pedido;

import java.util.LinkedList;

public class FilaPedidos extends LinkedList<Pedido> {

    public Pedido getPedido() {
        return this.poll();
    }

    public void addPedido(Pedido pedido) {
        this.addLast(pedido);
    }

    public Boolean isVazia() {
        return this.isEmpty();
    }
}
