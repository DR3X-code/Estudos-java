package pre_avancado.banco_de_dados.repository;

import pre_avancado.banco_de_dados.config.ConnectionFactory;
import pre_avancado.banco_de_dados.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class JdbcClienteRepository implements CrudRepository<Long, Cliente>{

    private final ConnectionFactory connectionFactory;

    public JdbcClienteRepository(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public Cliente salvar(Cliente entidade) {
        return null;
    }

    @Override
    public List<Cliente> listar() {

        String sql = " ";
        try(Connection connection = connectionFactory.getConnection()) {
            // criar o statement
            PreparedStatement statement = connection.prepareStatement(sql);
            // executar a query
            ResultSet resultSet = statement.executeQuery();
            // processar o resultado
            //todo interar resultset e criar lista de clientes
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public Cliente atualizar(Cliente entidade) {
        return null;
    }
}
