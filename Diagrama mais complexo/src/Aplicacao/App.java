package Aplicacao;
import Entidades.ItemPedido;
import Entidades.Produto;

import java.util.ArrayList;

//import Entidades.Atendente;
import Entidades.Cliente;
import Entidades.Endereco;
import Entidades.PedidoBasico;

public class App{
    public static void main(String[] args)throws Exception{
        //Instanciando objetos
        Produto p1 = new Produto();
        ItemPedido ip1 = new ItemPedido();
        //Atendente at1 = new Atendente();
        Endereco endereco = new Endereco();
        Cliente cl1 = new Cliente();
        PedidoBasico pedido1 = new PedidoBasico();

       //Criando Produto
       p1.setDescricao("Hambúrguer com carne e sem cebola"); p1.setNome("X-Egg");p1.setPeso(32.45);
       p1.setValor(14.00);p1.setQuantidade(2);
       
        //Criando lista de produtos para salvar os produtos criados.
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        listaProduto.add(p1);
        
        //Criando Item Pedido para receber os produtos
        ip1.setProduto(listaProduto.get(0));
        
        //Criando Pedido Básico para receber o Item do Pedido.
        pedido1.getListaPedidos().add(ip1);

        //Criando valores para Cliente.
        cl1.setNome("Rodrigo"); cl1.setCpf("000.000.000-00");cl1.setNomeUsuaria("Rodrigo_Gol");
        
        //Criando valores pra o endereço
        endereco.setCidade("Recife");endereco.setBairro("Macaxeira");endereco.setCep("52090-675");
        endereco.setNumero(11);endereco.setRua("Rua Manoel Aleixo da Silva");endereco.setTelefone("0000");
        endereco.setComplemento("Próximo a Polidoro");
        
        
        cl1.setEndereco(endereco);
        cl1.getStatusPessoaEEndereco();
        //cl1.getEndereco();
        pedido1.statusPedido();
        
    }
    
}