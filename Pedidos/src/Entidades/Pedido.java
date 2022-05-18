package Entidades;

import java.util.ArrayList;
//Composição : Quando se inicializa no construtor / Agregaçã : Quando se inicializa nos ateibutos.
public class Pedido {
    private double valorTotal;
    private ArrayList<ItemPedido> itens;
    
    public Pedido(){
        this.itens = new ArrayList<ItemPedido>();
    }
    
     public ArrayList<ItemPedido> getItens() {
        return itens;
    }
    public void adicionarItem(ItemPedido item){
        this.itens.add(item);
    }
    public void obterTotal (double valorTotal){
        this.valorTotal += valorTotal;    
    }
    public double getValorTotal(){
        return this.valorTotal;
    }
}
