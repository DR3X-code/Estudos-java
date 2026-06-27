package pre_avancado.banco_de_dados.dominio;

public class Pagamento extends EntidadeBase {
    private double valor;
    private String status;
    //pago,aguardando
    private String metodo;
    //credito, debito ,pix

    public Pagamento(double valor, String status, String metodo) {
        this.valor = valor;
        this.status = status;
        this.metodo = metodo;
    }

    public double getValor() {return valor;}

    public void setValor(double valor) {this.valor = valor;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public String getMetodo() {return metodo;}

    public void setMetodo(String metodo) {this.metodo = metodo;}
}
