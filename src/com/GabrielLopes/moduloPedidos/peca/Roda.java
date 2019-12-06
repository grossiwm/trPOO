package com.GabrielLopes.moduloPedidos.peca;

import com.GabrielLopes.moduloPedidos.enums.TipoRoda;

public class Roda {

    private TipoRoda tipo;

    public TipoRoda getTipo() {
        return tipo;
    }

    public void setTipo(TipoRoda tipo) {
        this.tipo = tipo;
    }

    public Roda(TipoRoda tipo) {
        this.tipo = tipo;
    }

}
