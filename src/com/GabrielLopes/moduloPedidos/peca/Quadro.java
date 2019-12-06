package com.GabrielLopes.moduloPedidos.peca;

import com.GabrielLopes.moduloPedidos.enums.TipoQuadro;

public class Quadro {

    private TipoQuadro tipo;

    public TipoQuadro getTipo() {
        return tipo;
    }

    public void setTipo(TipoQuadro tipo) {
        this.tipo = tipo;
    }

    public Quadro(TipoQuadro tipo) {
        this.tipo = tipo;
    }
}
