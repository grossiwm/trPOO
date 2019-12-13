package com.GabrielLopes.moduloProducao.services;

import com.GabrielLopes.moduloPedidos.Modelo;
import com.GabrielLopes.moduloPedidos.Pedido;
import com.GabrielLopes.moduloPedidos.peca.Guidao;
import com.GabrielLopes.moduloPedidos.peca.Quadro;
import com.GabrielLopes.moduloPedidos.peca.Roda;
import com.GabrielLopes.moduloPedidos.peca.Selim;
import com.GabrielLopes.moduloProducao.FilaPedidos;
import com.GabrielLopes.moduloRH.Supervisor;
import com.GabrielLopes.moduloRH.Tecnico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class LinhaProducao {

    private Pedido pedidoAtual;

    public void produzir(FilaPedidos filaPedidos) throws InterruptedException {

        while(!filaPedidos.isVazia()) {
            pedidoAtual = filaPedidos.getPedido();

            Iterator it = pedidoAtual.getModeloQuantidades().entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                Integer quantidadeModelo = (Integer) pair.getValue();
                Modelo modelo = (Modelo) pair.getKey();

                //Tecnicos:
                //qntTecnicos: quantidade de técnicos necessária para produção do modelo de acordo com a especificação
                //funcionarios: lista de funcionarios alocados pelo RH para produzir o modelo em questão
                int qntTecnicos = modelo.getQntTecnicos();
                ArrayList<Tecnico> tecnicos = getTecnicos(qntTecnicos);

                //Supervisor
                Supervisor supervisor = getSupervisor();

                //Verificação de estoque e Produção
                if(verificaEstoqueGuidao() && verificaEstoqueQuadro() && verificaEstoqueRoda() && verificaEstoqueSelim()){
                    for(int i=0; i<quantidadeModelo; i++){
                        Produto novoProduto = new Produto(pedidoAtual.getIdPedido());

                        produzModelo(modelo, novoProduto, tecnicos, supervisor);

                        //Testes
                        while(!testarProduto(novoProduto)){
                            System.out.println("Produto de id=" + novoProduto.getId_produto() + "do pedido de id="+ novoProduto.getId_pedido()+" não passou nos testes!\n" +
                                    "A produção será reinicializada.");
                            novoProduto = new Produto(pedidoAtual.getIdPedido());
                            produzModelo(modelo, novoProduto, tecnicos, supervisor);
                        }

                        //Adicionando o novo produto ao estoque de produtos prontos
                        System.out.println("Produto de id="+novoProduto.getId_produto()+ " do pedido de id="+novoProduto.getId_pedido() +" passou nos testes!");
                        Thread.sleep(2000);
                        Estoque.addProdutoNoEstoque(novoProduto);
                    }
                }
                it.remove(); // avoids a ConcurrentModificationException
            }
        }
    }


    private void produzModelo(Modelo modelo, Produto produto, ArrayList<Tecnico> tecnicos, Supervisor supervisor) throws InterruptedException {

        //Alocar corpo técnico
        System.out.println("\n\nAlocando corpo técnico para o projeto "+modelo+" do pedido de id="+ produto.getId_pedido() +".\n");
        for(Tecnico tecnico : tecnicos) {
            System.out.println("Alocando técnico: "+tecnico);
            Thread.sleep(1000);
        }
        System.out.println("Alocando supervisor: "+supervisor);
        Thread.sleep(1000);

        //Inicialização da produção
        Thread.sleep(2000);
        System.out.println("\nInicializando a produção do modelo " + modelo + ".");
        Thread.sleep(1000);
        etapa1(produto, modelo.getQuadro(), modelo.getRoda());
        Thread.sleep(2000);
        etapa2(produto, modelo.getSelim());
        Thread.sleep(1000);
        etapa3(produto, modelo.getGuidao());
        Thread.sleep(3000);
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
    private Boolean testarProduto(Produto produto) throws InterruptedException {
        System.out.println("\nTestando o produto de id=" + produto.getId_produto() + " do pedido de id="+produto.getId_pedido()+"...");
        Thread.sleep(2500);
        return true;
    }

    public ArrayList<Tecnico> getTecnicos(int qntTecnicos) {

        ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();

        for(int i = 0; i<qntTecnicos; i++){
            Tecnico tecnico = new Tecnico("Técnico "+i);
            tecnicos.add(tecnico);
        }
        return tecnicos;
    }

    public Supervisor getSupervisor(){
        return new Supervisor("Supervisor Fulano");
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
