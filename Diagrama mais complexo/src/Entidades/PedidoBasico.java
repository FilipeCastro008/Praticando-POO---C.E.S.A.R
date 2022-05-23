package Entidades;
public class PedidoBasico extends Pedido {
    private String nome;

    public PedidoBasico() {
        super();
    }

    public PedidoBasico(String dataPedido2, boolean status2, double valorTotal2, String nome) {
        super(dataPedido2, status2, valorTotal2);
        this.nome = nome;
    }
    @Override
    public void statusPedido() {
        System.out.println("\n" + "=-=-=-" + " PEDIDO " + "=-=-=-");
        System.out.println();
        System.out.println("Descrição: " + getListaPedidos().get(0).getProduto().getDescricao());
        System.out.println("Nome: " + getListaPedidos().get(0).getProduto().getNome());
        System.out.println("Peso: " + getListaPedidos().get(0).getProduto().getPeso());
        System.out.println("Quantidade: " + getListaPedidos().get(0).getProduto().getQuantidade());
        System.out.printf("Valor: R$ %.2f", getListaPedidos().get(0).getProduto().getValor());
        System.out.printf("%nTotal: R$ %.2f", getListaPedidos().get(0).getProduto().getValor() * getListaPedidos()
        .get(0).getProduto().getQuantidade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

