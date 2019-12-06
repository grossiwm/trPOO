package com.GabrielLopes.moduloProducao.services;

import com.GabrielLopes.moduloPedidos.Modelo;
import com.GabrielLopes.moduloPedidos.ModeloQuantidade;
import com.GabrielLopes.moduloPedidos.Pedido;
import com.GabrielLopes.moduloProducao.FilaPedidos;
import com.sun.tools.javac.util.List;

public class LinhaProducao {

    private Pedido pedidoAtual;



    public void pruduz(FilaPedidos filaPedidos) {
        while(!filaPedidos.isVazia()) {
            pedidoAtual = filaPedidos.getPedido();
            pedidoAtual.getModeloQuantidades().forEach(this::produzModelo);
        }
    }

    public Boolean produzModelo(ModeloQuantidade modeloQuantidade) {
        Modelo modelo = modeloQuantidade.getModelo();
        Integer quantidade = modeloQuantidade.getQuantidade();

        return true;
    }


}
