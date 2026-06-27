package pre_avancado.banco_de_dados.repository;

import pre_avancado.banco_de_dados.config.ConnectionFactory;
import pre_avancado.banco_de_dados.dominio.Cliente;

import java.sql.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class JdbcClienteRepository implements CrudRepository<Long, Cliente>{

    private final ConnectionFactory connectionFactory;

    public JdbcClienteRepository(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public Cliente salvar(Cliente entidade) {
        //primeira etapa criar SQL
        String sql = "insert into cliente (nome, documento, email, data_criacao) values (?, ?, ?, ?)";

        try(Connection connection = connectionFactory.getConnection()) {
            // criar o statement
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            //substituindo valores da query/?
            statement.setString(1, entidade.getNome());
            statement.setString(2, entidade.getDocumento());
            statement.setString(3, entidade.getEmail());
            statement.setTimestamp(4, Timestamp.from(entidade.getDataCriacao()));

            // executar a update
            statement.executeUpdate();
            try(ResultSet chaveGerada = statement.getGeneratedKeys()) {
                if (chaveGerada.next()) {
                    entidade.setId(chaveGerada.getLong(1));
                    return entidade;
                }
            }
            throw new IllegalStateException("Não foi possível recuperar o id do cliente");
        } catch (SQLException e) {
            throw new IllegalStateException("ERRO ao salvar cliente !!! ", e);
        }
    }

    @Override
    public List<Cliente> listar() {

        String sql = "select * from cliente order by id ";
        try(Connection connection = connectionFactory.getConnection()) {
            // criar o statement
            PreparedStatement statement = connection.prepareStatement(sql);
            // executar a query
            ResultSet resultSet = statement.executeQuery();
            // processar o resultado
            //todo interar resultset e criar lista de clientes

            List<Cliente> clientes = new ArrayList<>();

            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultSet.getLong("id"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setDocumento(resultSet.getString("documento"));
                cliente.setEmail(resultSet.getString("email"));
                cliente.setDataCriacao(resultSet.getTimestamp("data_criacao").toInstant());
                cliente.setDataAtualizacao(resultSet.getTimestamp("data_atualizacao")!= null ?resultSet.getTimestamp("data_atualizacao").toInstant():null);
                clientes.add(cliente);

            }
            return clientes;

        } catch (SQLException e) {
            throw new IllegalStateException("ERRO ao listar clientes !!! ", e);
        }
    }

    @Override
    public void deletar(Long id) {
        String sql = "DELETE FROM cliente WHERE id = ?";

        try (Connection connection = connectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setLong(1, id);

            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new IllegalStateException("Cliente não encontrado para exclusão");
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao deletar cliente", e);
        }
    }

    @Override
    public Cliente atualizar(Cliente entidade) {
        String sql = "UPDATE cliente SET nome = ?, documento = ?, data_atualizacao = ? WHERE id = ?";

        try (Connection connection = connectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, entidade.getNome());
            statement.setString(2, entidade.getDocumento());
            statement.setTimestamp(3, Timestamp.from(Instant.now()));
            statement.setLong(4, entidade.getId());

            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new IllegalStateException("Cliente não encontrado para atualização");
            }

            return entidade;

        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao atualizar cliente", e);
        }
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //primeira etapa criar SQL
        String sql = "select * from cliente where id = ?";

        try(Connection connection = connectionFactory.getConnection()) {
            // criar o statement
            PreparedStatement statement = connection.prepareStatement(sql);

            //substituindo valores da query/?
            statement.setLong(1, id);

            // executar a query para buscar o cliente por ID
            try(ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setId(resultSet.getLong("id"));
                    cliente.setNome(resultSet.getString("nome"));
                    cliente.setDocumento(resultSet.getString("documento"));
                    cliente.setDataCriacao(resultSet.getTimestamp("data_criacao").toInstant());
                    cliente.setDataAtualizacao(resultSet.getTimestamp("data_atualizacao")!= null ?resultSet.getTimestamp("data_atualizacao").toInstant():null);
                    return cliente;
                }
            }
            throw new IllegalStateException("Não foi possível recuperar o id do cliente");
        } catch (SQLException e) {
            throw new IllegalStateException("ERRO ao buscar cliente pelo ID: " + id, e);
        }
    }
}

