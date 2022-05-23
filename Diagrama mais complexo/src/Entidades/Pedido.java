package Entidades;
import java.util.ArrayList;



public abstract class Pedido {
    private String dataPedido;
    private boolean status;
    private double valorTotal;
    private ArrayList<ItemPedido> itemPedido = new ArrayList<ItemPedido>();
    
    public Pedido(){

    }
    public Pedido(String dataPedido, boolean status, double valorTotal) {
        this.dataPedido = dataPedido;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public abstract void statusPedido();

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<ItemPedido> getListaPedidos() {
        return itemPedido;
    }

    public void setListaPedidos(ArrayList<ItemPedido> itemPedido) {
        this.itemPedido = itemPedido;
    }

    
}