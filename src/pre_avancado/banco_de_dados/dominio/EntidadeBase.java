package pre_avancado.banco_de_dados.dominio;

import java.time.Instant;

public class EntidadeBase {


    private Long id;
    private Instant dataCriacao;
    private Instant dataAtualizacao;

    public EntidadeBase() {}
    public EntidadeBase(Long id, Instant dataCriacao, Instant dataAtualizacao) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Instant dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Instant getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Instant dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }



}
