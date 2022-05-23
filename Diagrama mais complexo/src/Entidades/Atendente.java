package Entidades;
import java.util.ArrayList;

public class Atendente extends Funcionario {
    private ArrayList<PedidoBasico> listaPedidoBasico;
    
    
    public Atendente() {
        super();
    }

    public Atendente(String nome, String cpf, String nomeUsuaria, boolean status, String senha,
            String matricula, String cargo, double salario) {
        super(nome, cpf, nomeUsuaria, status, senha, matricula, cargo, salario);
    }

    public void listaPedidos(){

    }
    public void editaPedidos(){

    }
    public void setListaPedidoBasico(ArrayList<PedidoBasico> listaPedidoBasico){
        this.listaPedidoBasico = listaPedidoBasico;
    }
    public ArrayList<PedidoBasico> getListaPedidoBasico(){
        return listaPedidoBasico;
    }
}
