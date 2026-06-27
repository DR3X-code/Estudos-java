package pre_avancado.banco_de_dados.dominio;

public class Produto extends EntidadeBase{

    private String nome;
    private String Descricao;
    private double valor;


    public Produto() {}

    public Produto(String nome, String Descricao, double valor) {
        super();
        this.nome = nome;
        this.Descricao = Descricao;
        this.valor = valor;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getDescricao() {return Descricao;}

    public void setDescricao(String Descricao) {this.Descricao = Descricao;}

    public double getValor() {return valor;}

    public void setValor(double valor) {this.valor = valor;}

    public String toString() {
        return "Produto{" +
                "id=" + getId() +
                ", dataCriacao=" + getDataCriacaoString() +
                ", dataAtualizacao=" + getDataAtualizacaoString() +
                ", nome='" + nome + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
