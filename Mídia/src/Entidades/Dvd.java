package Entidades;

public class Dvd extends Midia {
    private int nFaixas;

    public Dvd(){}

    public Dvd (int c, double p, String n, int f){
        super(c, p, n);
        this.nFaixas = f;
    }
    @Override
    public String getTipo(){
        return "DVD";
    }
    @Override
    public String getDetalhes(){
        return super.getDetalhes() + "\n" + "Número de faíxas: "  + this.nFaixas;
    }
    public void setFaixas(int f){
        this.nFaixas = f;
    }
    public void inserirDados(){
        super.inserirDados();
        System.out.println("Quantidade de faixas: ");
        this.nFaixas = sc.nextInt();
        
    }
}
