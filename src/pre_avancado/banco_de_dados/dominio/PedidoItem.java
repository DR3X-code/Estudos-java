package pre_avancado.banco_de_dados.dominio;

public class PedidoItem extends EntidadeBase{
    private int pedidoId;
    private int produtoId;
    private int quantidade;
    private double valorUnitario;

    public PedidoItem() {}

    public PedidoItem(int pedidoId, int produtoId) {
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
    }

    public int getPedidoId() {return pedidoId;}

    public void setPedidoId(int pedidoId) {this.pedidoId = pedidoId;}

    public int getProdutoId() {return produtoId;}

    public void setProdutoId(int produtoId) {this.produtoId = produtoId;}
}
