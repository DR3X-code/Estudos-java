package basico_02.classeObjeto;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalDeLivros(){
        return livros.size();
    }

    public void adicionarLivro(Livro livro){
        if(livro != null){
        livros.add(livro);
        }
    }

    public Livro buscarLivroPorTitulo(String titulo){
        for(Livro livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }

}
