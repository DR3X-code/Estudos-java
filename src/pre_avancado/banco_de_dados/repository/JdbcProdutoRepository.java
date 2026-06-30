package pre_avancado.banco_de_dados.repository;

import pre_avancado.banco_de_dados.config.ConnectionFactory;
import pre_avancado.banco_de_dados.dominio.Produto;

import java.sql.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class JdbcProdutoRepository implements CrudRepository<Long, Produto> {


    private final ConnectionFactory connectionFactory;

    public JdbcProdutoRepository(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public Produto salvar(Produto entidade) {

        //Criando SQL para inserir um produto no banco de dados
        String sql = "insert into produto (nome, descricao, valor, data_criacao) values (?, ?, ?, ?)";  try (
                Connection connection = connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {


            //substituindo valores da query/?
            statement.setString(1, entidade.getNome());
            statement.setString(2, entidade.getDescricao());
            statement.setDouble(3, entidade.getValor());
            statement.setTimestamp(4, Timestamp.from(Instant.now()));

            // executar a update
            statement.executeUpdate();
            try (ResultSet chaveGerada = statement.getGeneratedKeys()) {
                if (chaveGerada.next()) {
                    entidade.setId(chaveGerada.getLong(1));
                    return entidade;
                }
            }
            throw new IllegalStateException("Não foi possível recuperar o id do produto");

        } catch (SQLException e) {
            throw new IllegalStateException("ERRO ao salvar o produto", e);
        }
    }


    @Override
    public List<Produto> listar() {
        String sql = "select * from produto order by id";
        try (
                Connection connection = connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();
        ) {

            //nao vai ter substituincao de valores ate o momento
            List<Produto> produtos = new ArrayList<>();

            while (resultSet.next()) {
                Produto produto = mapearProduto(resultSet);
                produtos.add(produto);
            }
            return produtos;
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao listar produtos", e);
        }
    }


    @Override
    public void deletar(Long id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        try (
                Connection connection = connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao deletar produto", e);
        }
    }

    @Override
    public Produto atualizar(Produto entidade) {
        String sql = "UPDATE produto SET nome = ? , descricao = ?, valor = ? ,data_atualizacao = ? WHERE id = ? ";

        try (
                Connection connection = connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, entidade.getNome());
            statement.setString(2, entidade.getDescricao());
            statement.setDouble(3, entidade.getValor());
            statement.setTimestamp(4, Timestamp.from(Instant.now()));
            statement.setLong(5, entidade.getId());

            statement.executeUpdate();
            return entidade;
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao atualizar produto", e);
        }
    }

    @Override
    public Produto buscarPorId(Long id) {
        String sql = "select * from produto where id = ?";
        try (
                Connection connection = connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);

        ) {
            statement.setLong(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return mapearProduto(resultSet);
                }
                throw new IllegalStateException("Produto não encontrado para o id: " + id);
            }
        } catch (SQLException e) {
                throw new IllegalStateException("Erro ao buscar produto por id", e);
        }

    }



    private Produto mapearProduto(ResultSet resultSet) throws SQLException {
        Produto produto = new Produto();

        produto.setId(resultSet.getLong("id"));
        produto.setNome(resultSet.getString("nome"));
        produto.setDescricao(resultSet.getString("descricao"));
        produto.setValor(resultSet.getDouble("valor"));

        produto.setDataCriacao(resultSet.getTimestamp("data_criacao").toInstant());

        produto.setDataAtualizacao(resultSet.getTimestamp("data_atualizacao") != null ? resultSet.getTimestamp("data_atualizacao").toInstant() : null);

        return produto;
    }


}

