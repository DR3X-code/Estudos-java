package pre_avancado.banco_de_dados.service;


import pre_avancado.banco_de_dados.config.ConnectionFactory;
import pre_avancado.banco_de_dados.dominio.Produto;
import pre_avancado.banco_de_dados.repository.CrudRepository;
import pre_avancado.banco_de_dados.repository.JdbcProdutoRepository;
import java.util.List;

public class ProdutoService {

    private final CrudRepository<Long, Produto> repository;
    public ProdutoService(ConnectionFactory connectionFactory) {
        this.repository = new JdbcProdutoRepository(connectionFactory);
    }

    public Produto salvar(Produto produto) {return repository.salvar(produto);}
    public List<Produto> listar() {return repository.listar();}
    public Produto buscarPorId(Long id) {return repository.buscarPorId(id);}
    public Produto atualizar(Produto produto) {return repository.atualizar(produto);}
    public void deletar(Long id) {repository.deletar(id);}

}
