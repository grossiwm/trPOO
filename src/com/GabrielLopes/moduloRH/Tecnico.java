package com.GabrielLopes.moduloRH;

public class Tecnico extends Funcionario{

    public Tecnico(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Tecnico{nome: "+this.nome+ " }";
    }
}
