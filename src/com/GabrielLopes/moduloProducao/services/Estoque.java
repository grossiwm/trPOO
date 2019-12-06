package com.GabrielLopes.moduloProducao.services;

import com.GabrielLopes.moduloPedidos.Pedido;

import java.util.ArrayList;

public class Estoque {

    private static ArrayList<Produto> produtosEmEstoque = new ArrayList<>();

    public static void addProdutoNoEstoque(Produto produto){
        produtosEmEstoque.add(produto);
    }
}
