package com.GabrielLopes.moduloProducao.services;

import com.GabrielLopes.moduloPedidos.peca.Guidao;
import com.GabrielLopes.moduloPedidos.peca.Quadro;
import com.GabrielLopes.moduloPedidos.peca.Roda;
import com.GabrielLopes.moduloPedidos.peca.Selim;
import com.GabrielLopes.moduloRH.Tecnico;

import java.util.ArrayList;


public class Produto{

    private static Integer contadorIdProduto = 0;

    private Integer id_produto = null;

    private Integer id_pedido = null;

    private Guidao guidao = null;

    private Roda roda = null;

    private Selim selim = null;

    private Quadro quadro = null;

    private ArrayList<Tecnico> listaTecnicos = new ArrayList<Tecnico>();

    public Produto(Integer id_produto, Integer id_pedido) {
        this.id_produto = id_produto;
        this.id_pedido = id_pedido;
        contadorIdProduto++;
    }

    public void setListaTecnicos(ArrayList<Tecnico> listaTecnicos) {
        this.listaTecnicos = listaTecnicos;
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
