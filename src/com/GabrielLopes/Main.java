package com.GabrielLopes;

import com.GabrielLopes.moduloPedidos.Modelo;
import com.GabrielLopes.moduloPedidos.Pedido;
import com.GabrielLopes.moduloPedidos.enums.TipoGuidao;
import com.GabrielLopes.moduloPedidos.enums.TipoQuadro;
import com.GabrielLopes.moduloPedidos.enums.TipoRoda;
import com.GabrielLopes.moduloPedidos.enums.TipoSelim;
import com.GabrielLopes.moduloPedidos.peca.Guidao;
import com.GabrielLopes.moduloPedidos.peca.Quadro;
import com.GabrielLopes.moduloPedidos.peca.Roda;
import com.GabrielLopes.moduloPedidos.peca.Selim;
import com.GabrielLopes.moduloProducao.services.LinhaProducao;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Instanciando as peças
        Guidao guidaoBMX = new Guidao(TipoGuidao.BMX);
        Guidao guidaoEletrico = new Guidao(TipoGuidao.ELETRICO);
        Guidao guidaoHidraulico = new Guidao(TipoGuidao.HIDRAULICO);
        Guidao guidaoMB = new Guidao(TipoGuidao.MONTAIN_BIKE);
        Quadro quadroBMX = new Quadro(TipoQuadro.BMX);
        Quadro quadroMB = new Quadro(TipoQuadro.MONTAIN_BIKE);
        Roda roda26 = new Roda(TipoRoda.ARO_26);
        Roda roda29 = new Roda(TipoRoda.ARO_29);
        Roda roda27 = new Roda(TipoRoda.ARO_27);
        Roda aroHidraulico = new Roda(TipoRoda.ARO_HIDRAULICO);
        Selim selimCouro = new Selim(TipoSelim.COURO);
        Selim selimBorracha = new Selim(TipoSelim.BORRACHA);
        Selim selimPlastico = new Selim(TipoSelim.PLASTICO);

        //Instanciando os modelos
        Modelo modeloBMX = new Modelo("BMX", 2,guidaoBMX, roda26, selimPlastico, quadroBMX);
        Modelo modeloMB = new Modelo("Mountain Bike",3, guidaoMB, roda29, selimCouro, quadroMB);

        HashMap<Modelo,Integer> modeloQuantidades1 = new HashMap<>();
        modeloQuantidades1.put(modeloBMX, 2);
        modeloQuantidades1.put(modeloMB, 1);

        HashMap<Modelo,Integer> modeloQuantidades2 = new HashMap<>();
        modeloQuantidades2.put(modeloBMX, 1);
        modeloQuantidades2.put(modeloMB, 1);

        // Pedidos
        Pedido pedido1 = new Pedido(modeloQuantidades1);
        Pedido pedido2 = new Pedido(modeloQuantidades2);

        LinhaProducao.addPedido(pedido1);
        LinhaProducao.addPedido(pedido2);

        // Produção
        LinhaProducao linhaProducao = new LinhaProducao();
        linhaProducao.produzir();

    }
}
