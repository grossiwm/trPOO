package com.GabrielLopes.moduloProducao.services;

import java.util.ArrayList;

public class Estoque {

    private static ArrayList<Produto> produtosEmEstoque = new ArrayList<>();

    public static void addProdutoNoEstoque(Produto produto) throws InterruptedException {
        System.out.println("\nEncaminhando produto de id="+produto.getId_produto()+" do pedido de id="+produto.getId_pedido()+" para estoque...");
        produtosEmEstoque.add(produto);
        Thread.sleep(3000);
        System.out.println("Produto de id="+produto.getId_produto()+" do pedido de id="+produto.getId_pedido()+" encaminhado para estoque.");
    }
}
