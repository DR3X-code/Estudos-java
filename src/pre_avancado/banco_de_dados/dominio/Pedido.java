package pre_avancado.banco_de_dados.dominio;

import pre_avancado.banco_de_dados.dominio.enums.StatusPedidoEnum;

public class Pedido extends EntidadeBase{

    private Cliente cliente;
    private StatusPedidoEnum status;
    //a caminho,processando,finalizado

    public Pedido() {}

    public Pedido(Cliente cliente, StatusPedidoEnum status) {
        this.cliente = cliente;
        this.status = status;
    }

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public StatusPedidoEnum getStatus() {return status;}

    public void setStatus(StatusPedidoEnum status) {this.status = status;}
}
