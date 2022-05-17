package Entidades;
import java.util.Scanner;

public class Midia {

    private int codigo;
    private double preco;
    private String nome;
    
    Scanner sc = new Scanner(System.in);

    public Midia() {
    }

    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }
    public String getTipo(){
        return "Midia";
    }
    public String getDetalhes(){
        return "Informações \n" + "Código: " + this.codigo + "\n" + "Preço: " + this.preco + "\n" + "Nome: " + this.nome; 
    }
    public void inserirDados(){
        System.out.println("Digite o código do produto: ");
        this.codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o preço: ");
        this.preco = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o nome: ");
        this.nome = sc.nextLine();
        
    }
    
    public void printDados(){
        System.out.println(this.getTipo() + " = " + this.getDetalhes()); 
    }
        
}
