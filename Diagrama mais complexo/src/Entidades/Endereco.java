package Entidades;
public class Endereco {
    private String rua;
    private int numero;
    private String cep;
    private String complemento;
    private String telefone;
    private String cidade;
    private String bairro;
    
    public Endereco(){

    }
   
    public Endereco(String rua, int numero, String cep, String complemento, String telefone, String cidade,
            String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.telefone = telefone;
        this.cidade = cidade;
        this.bairro = bairro;
        
    }
    
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void statusEndereco(){
        System.out.println("Cidade: " + getCidade());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Rua: " + getRua());
        System.out.println("CEP: " + getCep());
        System.out.println("Número: " + getNumero());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Complemento: " + getComplemento());
    }
    
}
