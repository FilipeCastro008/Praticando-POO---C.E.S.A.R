package Entidades;



public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String nomeUsuaria;
    private boolean status;
    private String senha;
    private Endereco endereco;
    
    public Pessoa() {
    }
    public Pessoa(String nome, String cpf, String nomeUsuaria, boolean status, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.nomeUsuaria = nomeUsuaria;
        this.status = status;
        this.senha = senha;
        this.endereco = new Endereco();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNomeUsuaria() {
        return nomeUsuaria;
    }
    public void setNomeUsuaria(String nomeUsuaria) {
        this.nomeUsuaria = nomeUsuaria;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void getEndereco() {
        endereco.statusEndereco();
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void getStatusPessoaEEndereco(){
        System.out.println("=-=-=" + " Cliente " + "=-=-=-");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Nome do usuário: " + nomeUsuaria);
        System.out.println("CPF: " + cpf);
        System.out.println();
        System.out.println("=-=-=-" + " ENDEREÇO " + "=-=-=-");
        System.out.println();
        endereco.statusEndereco();
    }
}
