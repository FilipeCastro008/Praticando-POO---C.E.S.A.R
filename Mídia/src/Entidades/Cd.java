package Entidades;

public  class Cd extends Midia {
    private int nMusicas;

    public Cd(){}

    public Cd (int c, double p, String n, int nMusicas){
        super(c, p, n);
        this.nMusicas = nMusicas;
    }
    @Override
    public String getTipo(){
        return "CD";
    }
    @Override
    public String getDetalhes(){
        return super.getDetalhes() + "\n" + "Número de músicas: " + this.nMusicas;
    }
    public void setMusicas(int nMusicas){
        this.nMusicas = nMusicas;
    }
    
    public void inserirDados(){
        super.inserirDados();
        System.out.println("Quantidade de músicas: ");
        sc.nextInt();
    }
}
