package com.GabrielLopes.moduloProducao.services;

import com.GabrielLopes.moduloPedidos.peca.Guidao;
import com.GabrielLopes.moduloPedidos.peca.Quadro;
import com.GabrielLopes.moduloPedidos.peca.Roda;
import com.GabrielLopes.moduloPedidos.peca.Selim;


public class Produto{

    private static Integer contadorIdProduto = 0;

    private Integer id_produto = null;

    private Integer id_pedido = null;

    private Guidao guidao = null;

    private Roda roda = null;

    private Selim selim = null;

    private Quadro quadro = null;

    public Produto(Integer id_pedido) {
        this.id_produto = this.contadorIdProduto;
        this.id_pedido = id_pedido;
        contadorIdProduto++;
    }

    public static Integer getContadorIdProduto() {
        return contadorIdProduto;
    }

    public Integer getId_pedido() {
        return id_pedido;
    }

    public Guidao getGuidao() {
        return guidao;
    }

    public void setGuidao(Guidao guidao) {
        this.guidao = guidao;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Selim getSelim() {
        return selim;
    }

    public void setSelim(Selim selim) {
        this.selim = selim;
    }

    public Quadro getQuadro() {
        return quadro;
    }

    public void setQuadro(Quadro quadro) {
        this.quadro = quadro;
    }

    public Integer getId_produto() {
        return id_produto;
    }
}
