package com.GabrielLopes.moduloPedidos.peca;

import com.GabrielLopes.moduloPedidos.enums.TipoSelim;

public class Selim {

    private TipoSelim tipo;

    public TipoSelim getTipo() {
        return tipo;
    }

    public void setTipo(TipoSelim tipo) {
        this.tipo = tipo;
    }

    public Selim(TipoSelim tipo) {
        this.tipo = tipo;
    }
}
