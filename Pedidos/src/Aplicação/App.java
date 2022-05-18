package Aplicação;

import Entidades.ItemPedido;
import Entidades.Pedido;
import Entidades.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto prod = new Produto (14,4.00,"Refrigerante");
        Produto prod3 = new Produto (15, 2.00, "Sanduíche");
        ItemPedido item1 = new ItemPedido (2);
        Pedido ped = new Pedido();

        item1.getListProduto().add(prod);
        item1.getListProduto().add(prod3);
        ped.getItens().add(item1);
        
        for(int i = 0; i < item1.getListProduto().size(); i++){
            ped.obterTotal(item1.getListProduto().get(i).getValor() * item1.getQuantidade());;
        }   
        for(int i = 0; i < item1.getListProduto().size(); i++){
            System.out.println("Quantidade = " + item1.getQuantidade());
            System.out.println(ped.getItens().get(0).getListProduto().get(i).getStatus() + "\n");
        }
        System.out.println("Valor total = " + ped.getValorTotal());
    }   
}
