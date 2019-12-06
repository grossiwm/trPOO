package com.GabrielLopes.moduloPedidos;

import com.GabrielLopes.moduloPedidos.peca.Guidao;
import com.GabrielLopes.moduloPedidos.peca.Quadro;
import com.GabrielLopes.moduloPedidos.peca.Roda;
import com.GabrielLopes.moduloPedidos.peca.Selim;

public class Modelo {

    private String nome;

    private Integer qntTecnicos;

    private Guidao guidao;

    private Roda roda;

    private Selim selim;

    private Quadro quadro;

    public Modelo(String nome, Integer qntTecnicos, Guidao guidao, Roda roda, Selim selim, Quadro quadro) {
        this.nome = nome;
        this.qntTecnicos = qntTecnicos;
        this.guidao = guidao;
        this.roda = roda;
        this.selim = selim;
        this.quadro = quadro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Integer getQntTecnicos() {
        return qntTecnicos;
    }

    public void setQntTecnicos(Integer qntTecnicos) {
        this.qntTecnicos = qntTecnicos;
    }
}
