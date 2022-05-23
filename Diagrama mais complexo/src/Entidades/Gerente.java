package Entidades;
import java.util.ArrayList;

public class Gerente extends Funcionario{
    private ArrayList<Atendente> listaAtendente;
   
    public Gerente() {
       super(); 
    }
    public Gerente(String nome, String cpf, String nomeUsuaria, boolean status, String senha,
            String matricula, String cargo, double salario, String matricula2, String cargo2, double salario2) {
        super(nome, cpf, nomeUsuaria, status, senha, matricula, cargo, salario);
        matricula = matricula2;
        cargo = cargo2;
        salario = salario2;
    }

    public void listaFuncion(){

    }

    public void listaCliente() {

    }

    public void criaFuncionario() {

    }

    public ArrayList<Atendente> getListaAtendente() {
        return listaAtendente;
    }

    public void setListaAtendente(ArrayList<Atendente> listaAtendente) {
        this.listaAtendente = listaAtendente;
    }

    
}
