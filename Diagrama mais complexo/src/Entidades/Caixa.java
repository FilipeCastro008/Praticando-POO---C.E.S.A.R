package Entidades;
import java.util.ArrayList;

public class Caixa {
    private double valorReceita;
    private String dataAbertura;
    private String dataFechamento;
    private ArrayList<Movimento> listaMovimento;
    
    public Caixa(double valorReceita, String dataAbertura, String dataFechamento, ArrayList<Movimento> listaPedido) {
        this.valorReceita = valorReceita;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.listaMovimento =  new ArrayList<Movimento>();
    }
   
    public String getDataFechamento() {
        return dataFechamento;
    }
    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
    public String getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public void setValorReceita(double valorReceita) {
        this.valorReceita = valorReceita;
    }
    public double getValorReceita() {
        return valorReceita;
    }
    public ArrayList<Movimento> getListaMovimento(){
        return listaMovimento;
    }
    public void setListaMovimento(ArrayList<Movimento> listaMovimento){
        this.listaMovimento = listaMovimento;
        
    }
}
