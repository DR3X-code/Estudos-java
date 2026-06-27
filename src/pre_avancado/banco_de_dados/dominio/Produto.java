package pre_avancado.banco_de_dados.dominio;

public class Produto extends EntidadeBase{

    private String descrição;
    private double valor;


    public Produto() {}

    public Produto(String descrição, double valor) {
        this.descrição = descrição;
        this.valor = valor;
    }

    public String getDescrição() {return descrição;}

    public void setDescrição(String descrição) {this.descrição = descrição;}

    public double getValor() {return valor;}

    public void setValor(double valor) {this.valor = valor;}

}
