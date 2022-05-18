package Entidades;

public class Produto {
    private int codigo;
    private double valor;
    private String descricao;
    
    public Produto() {
    }
    public Produto(int codigo, double valor, String descricao) {
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }     
    public int getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getStatus(){
        return "Códido = " + codigo + "\n" + "Valor = R$ " + String.format("%.2f", valor) + "\n" + "Descrição = " + descricao;
    }
}