package pre_avancado.banco_de_dados.dominio;

public class Cliente extends EntidadeBase {

    private String nome;
    private String documento;
    //cpf
    private String email;

    public Cliente() {}

    public Cliente(String nome, String documento, String email) {
        //construtor da classe pai "super"
        super();
        this.nome = nome;
        this.documento = documento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + getId() +
                ", dataCriacao=" + getDataCriacaoString() +
                ", dataAtualizacao=" + getDataAtualizacaoString() +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //todo criar  metodos para data getDataCriacaoString formato dd-mm-aaaa getDataAtualizacaoString dica:simpladateformat
}
