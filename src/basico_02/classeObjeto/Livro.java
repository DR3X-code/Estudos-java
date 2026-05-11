package basico_02.classeObjeto;

//classe = especificação | objeto = instancia
public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;

    //construtor padrao
    public Livro(){

    }

    //construtor customizado
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
    }
    //metodos de acesso

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean ehLeituraRapida() {return numeroPaginas < 300;}

    public boolean leituraEhRecente() {return anoPublicacao >2016;}

    public String descricaoResumida() {
        return titulo +" " + autor + "  "+ "(" + anoPublicacao + ")";
    }

    @Override
    public String toString() {
        return descricaoResumida();
    }

}
//criar metodo retorna string com a descrição do livro titulo+ autor +(ano de publicação) "formatada" metodo descricaoResumida
//ok

//criar metodo booleano valida se a leitura é rapida EhLeituraRapida, quantidade de pag <300 paginas é leitura rapida!
//ok

//criar metodo booleano valida se a leitura EhRecente ano de publição >2016
//ok

// Atualizar toString,chamar o metodo descricaoResumida
//ok esse ajudou fazer o de cima