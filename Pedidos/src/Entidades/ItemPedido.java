package Entidades;

import java.util.ArrayList;

public class ItemPedido {
    private int quantidade;    
    private ArrayList<Produto> produtos;
    
    public ItemPedido(int quantidade) {
        this.quantidade = quantidade;
        this.produtos = new ArrayList<Produto>();
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public ArrayList<Produto> getListProduto(){
        return produtos;
    }

}

