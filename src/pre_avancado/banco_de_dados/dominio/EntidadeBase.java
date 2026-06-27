package pre_avancado.banco_de_dados.dominio;

import org.postgresql.jdbc2.optional.SimpleDataSource;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class EntidadeBase {


    private Long id;
    private Instant dataCriacao;
    private Instant dataAtualizacao;

    public EntidadeBase() {
        this.dataCriacao = Instant.now();
    }

    public EntidadeBase(Long id, Instant dataCriacao, Instant dataAtualizacao) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.dataCriacao = Instant.now();
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

    public void setDataCriacao(Instant dataCriacao) {  this.dataCriacao = dataCriacao;}

    public Instant getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Instant dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getDataCriacaoString() {
        return formataData(dataCriacao);
    }

    public String getDataAtualizacaoString() {
        return formataData(dataAtualizacao);
    }

    private String formataData (Instant dataSemFormatacao) {

        if(dataSemFormatacao == null) {return null;}

        String dataFormatada = dataSemFormatacao
                .atZone(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

        return dataFormatada;
    }
    //todo criar  metodos para data getDataCriacaoString formato dd-mm-aaaa getDataAtualizacaoString dica:simpladateformat



}
