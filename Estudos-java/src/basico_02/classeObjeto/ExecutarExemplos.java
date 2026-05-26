import basico_02.classeObjeto.Biblioteca;
import basico_02.classeObjeto.Livro;

void main() {
    executarAula();
}

void executarAula(){
    demonstrarClasseObjeto();

}

void demonstrarClasseObjeto(){
    System.out.println("POO - Classe objeto");
    Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

    Livro livro = new Livro("pequeno principe", "maquiavel", 1943, 1000);
    Livro livro2 = new Livro("Chapeuzinho Amarelo", "Chico Buarque", 2019, 100);


    biblioteca.adicionarLivro(livro);
    biblioteca.adicionarLivro(livro2);

    System.out.println("Biblioteca : "+ biblioteca.getNome());
    System.out.println("Total de livros : "+ biblioteca.getTotalDeLivros());
    System.out.println("existe livro pequeno principe ? "+ biblioteca.buscarLivroPorTitulo("pequeno principe"));
    System.out.println("existe livro pequeno principe 2 ? "+ biblioteca.buscarLivroPorTitulo("pequeno principe2"));


    System.out.println("\n Validar atividade \n");
    System.out.println("O livro "+ livro2.getTitulo() + " é leitura rapida ? " + (livro2.ehLeituraRapida()? "livro curto" : "Livro longo"));
    System.out.println("O livro "+ livro2.getTitulo() + " é leitura recente ? " + (livro2.leituraEhRecente() ? "Livro recente" : "Livro antigo"));
    System.out.println("O livro "+  livro2.descricaoResumida() +"\n");

    System.out.println("O livro "+ livro.getTitulo() + " é leitura rapida ? " + (livro.ehLeituraRapida()? "livro curto" : "Livro longo"));
    System.out.println("O livro "+ livro.getTitulo() + " é leitura recente ? " + (livro.leituraEhRecente() ? "Livro recente" : "Livro antigo"));
    System.out.println("O livro "+  livro.descricaoResumida());



}