package com.GabrielLopes.moduloRH;

public class Supervisor extends Funcionario{
    public Supervisor(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Supervisor{nome:"+nome+" }";
    }
}
