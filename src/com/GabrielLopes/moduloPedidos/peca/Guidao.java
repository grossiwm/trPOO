package com.GabrielLopes.moduloPedidos.peca;

import com.GabrielLopes.moduloPedidos.enums.TipoGuidao;

public class Guidao {

    private TipoGuidao tipo;

    public TipoGuidao getTipo() {
        return tipo;
    }

    public void setTipo(TipoGuidao tipo) {
        this.tipo = tipo;
    }

    public Guidao(TipoGuidao tipo) {
        this.tipo = tipo;
    }
}
