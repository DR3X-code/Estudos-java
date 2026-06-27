package pre_avancado.banco_de_dados.service;

import pre_avancado.banco_de_dados.config.ConnectionFactory;
import pre_avancado.banco_de_dados.dominio.Cliente;
import pre_avancado.banco_de_dados.repository.CrudRepository;
import pre_avancado.banco_de_dados.repository.JdbcClienteRepository;

import java.util.List;

public class ClienteService {
    //injeção de dependencia
    private final CrudRepository<Long, Cliente> repository;

    public ClienteService(ConnectionFactory connectionFactory) {
        this.repository = new JdbcClienteRepository(connectionFactory);
    }

    public Cliente salvar(Cliente cliente) {
        return repository.salvar(cliente);
    }

    public List<Cliente> listar() {
        return repository.listar();
    }

    public Cliente buscarPorId(Long id) {
        return repository.buscarPorId(id);
    }

    public Cliente atualizar(Cliente cliente) {
        return repository.atualizar(cliente);
    }

    public void deletar(Long id) {
        repository.deletar(id);
    }
}