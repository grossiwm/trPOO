package com.GabrielLopes.moduloProducao.services;

import com.GabrielLopes.moduloPedidos.Modelo;
import com.GabrielLopes.moduloPedidos.ModeloQuantidade;
import com.GabrielLopes.moduloPedidos.Pedido;
import com.GabrielLopes.moduloPedidos.peca.Guidao;
import com.GabrielLopes.moduloPedidos.peca.Quadro;
import com.GabrielLopes.moduloPedidos.peca.Roda;
import com.GabrielLopes.moduloPedidos.peca.Selim;
import com.GabrielLopes.moduloProducao.FilaPedidos;
import com.GabrielLopes.moduloRH.Tecnico;

import java.util.ArrayList;

public class LinhaProducao {

    private Pedido pedidoAtual;

    public void produzir(FilaPedidos filaPedidos) {

        Integer id_produto = Produto.getContadorIdProduto();

        while(!filaPedidos.isVazia()) {
            pedidoAtual = filaPedidos.getPedido();

            for(ModeloQuantidade modeloQuantidade:pedidoAtual.getModeloQuantidades()){
                Integer quantidadeModelo = modeloQuantidade.getQuantidade();
                Modelo modelo = modeloQuantidade.getModelo();

                //Tecnicos
                int qntTecnicos = modelo.getQntTecnicos();
                ArrayList<Tecnico> tecnicos = getTecnicos(qntTecnicos);

                //Alocar Supervisor

                //Verificação de estoque e Produção
                if(verificaEstoqueGuidao() && verificaEstoqueQuadro() && verificaEstoqueRoda() && verificaEstoqueSelim()){
                    for(int i=0; i<quantidadeModelo; i++){
                        Produto novoProduto = new Produto(id_produto ,pedidoAtual.getIdPedido());

                        produzModelo(modelo, novoProduto);

                        //Testes
                        while(!testarProduto(novoProduto)){
                            System.out.println("Produto " + novoProduto.getId_produto() + " não passou nos testes!\n" +
                                    "A produção será reinicializada.");
                            novoProduto = new Produto(id_produto ,pedidoAtual.getIdPedido());
                            produzModelo(modelo, novoProduto);
                        };
                        //Adicionando o novo produto ao estoque de produtos prontos
                        Estoque.addProdutoNoEstoque(novoProduto);
                    };
                };
            }
        }
    }

    private void produzModelo(Modelo modelo, Produto produto) {

        //Alocar corpo técnico
        System.out.println("Inicializando a produção do modelo " + modelo + ".");
        etapa1(produto, modelo.getQuadro(), modelo.getRoda());
        etapa2(produto, modelo.getSelim());
        etapa3(produto, modelo.getGuidao());
    }

    private void etapa1(Produto produto, Quadro quadro, Roda roda) {

        System.out.println("Etapa 1: juntando quadro do tipo " + quadro.getTipo() + " com roda do tipo " + roda.getTipo() + "...");
        produto.setQuadro(quadro);
        produto.setRoda(roda);
    }

    private void etapa2(Produto produto, Selim selim) {

        System.out.println("Etapa 2: adicionando o selim do tipo " + selim.getTipo() + "...");
        produto.setSelim(selim);
    }

    private void etapa3(Produto produto, Guidao guidao) {

        System.out.println("Etapa 3: adicionando o guidão do tipo " + guidao.getTipo() + "...");
        produto.setGuidao(guidao);
    }


    //Mock-up
    private Boolean testarProduto(Produto produto){
        System.out.println("Testando o produto " + produto.getId_produto() + ".");
        return true;
    }

    private ArrayList<Tecnico> getTecnicos(int qntTecnicos) {

        ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();

        for(int i = 0; i<qntTecnicos; i++){
            Tecnico tecnico = new Tecnico();
            tecnicos.add(tecnico);
        }

        return tecnicos;
    }

    private Boolean verificaEstoqueQuadro(){
        return true;
    }

    private Boolean verificaEstoqueSelim(){
        return true;
    }

    private Boolean verificaEstoqueRoda(){
        return true;
    }

    private Boolean verificaEstoqueGuidao(){
        return true;
    }

}
