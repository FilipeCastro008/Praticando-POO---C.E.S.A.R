package Entidades;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private ArrayList<PedidoDelivery> pedidoDelivery;

    public Cliente(){
        super();
    }

    public Cliente(String nome, String cpf, String nomeUsuaria, boolean status, String senha,
    ArrayList<PedidoDelivery> pedidoDelivery) {
        super(nome, cpf, nomeUsuaria, status, senha);
        this.pedidoDelivery = pedidoDelivery;
    }
    public ArrayList<PedidoDelivery> getPedidoDelivery() {
        return pedidoDelivery;
    }

    public void setPedidoDelivery(ArrayList<PedidoDelivery> pedidoDelivery) {
        this.pedidoDelivery = pedidoDelivery;
    }
  
}
