package pre_avancado.banco_de_dados.dominio;

public class Entrega extends EntidadeBase{

    private int pedidoId;
    private String status;

    private String endereco;
    private String codigoDeRastreio;
    //codigoDeRastreio: CD_3primeiroDigitoDoCP+random12Caracter+XX
    
    public Entrega (int pedidoId, String status, String endereco, String codigoDeRastreio) {
        this.pedidoId = pedidoId;
        this.status = status;
        this.endereco = endereco;
        this.codigoDeRastreio = codigoDeRastreio;
    }

    public int getPedidoId() {return pedidoId;}

    public void setPedidoId(int pedidoId) {this.pedidoId = pedidoId;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getCodigoDeRastreio() {return codigoDeRastreio;}

    public void setCodigoDeRastreio(String codigoDeRastreio) {this.codigoDeRastreio = codigoDeRastreio;}
}
