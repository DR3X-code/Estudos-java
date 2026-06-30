package pre_avancado.banco_de_dados.repository;

import pre_avancado.banco_de_dados.config.ConnectionFactory;
import pre_avancado.banco_de_dados.dominio.Entrega;
import pre_avancado.banco_de_dados.dominio.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcEntregaRepository implements CrudRepository<Long, Entrega>{

    private final ConnectionFactory connectionFactory;

    public JdbcEntregaRepository(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }


    @Override
    public Entrega salvar(Entrega entidade) {
        String sql = "insert into entrega (pedido_id, status, endereco, codigo_de_rastreio) values (?, ?, ?, ?)";
        try (
                Connection connection = connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {
            statement.setLong(1, entidade.getPedidoId());
            statement.setString(2, entidade.getStatus());
            statement.setString(3, entidade.getEndereco());
            statement.setString(4, entidade.getCodigoDeRastreio());
            statement.executeUpdate();


            try (ResultSet chaveGerada = statement.getGeneratedKeys()) {
                if (chaveGerada.next()) {
                    entidade.setId(chaveGerada.getLong(1));
                    return entidade;
                }
            }
            throw new IllegalStateException("Não foi possível recuperar o id da entrega");
        } catch (Exception e) {
            throw new IllegalStateException("ERRO ao salvar a entrega", e);
        }
    }

    @Override
    public List<Entrega> listar() {
        String sql = "select * from entrega order by id";
        try (
                Connection connection = connectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();
        ) {

            List<Entrega> entregas = new ArrayList<>();

            while (resultSet.next()) {
                Entrega entrega = mapearEntrega(resultSet);
                entregas.add(entrega);
            }
            return entregas;
        } catch (SQLException e) {
            throw new IllegalStateException("Erro ao listar entrega", e);
        }
    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public Entrega atualizar(Entrega entidade) {
        return null;
    }

    @Override
    public Entrega buscarPorId(Long id) {
        return null;
    }

    private Entrega mapearEntrega(ResultSet resultSet) throws SQLException{
        Entrega entrega = new Entrega();


        entrega.setId(resultSet.getLong("id"));
        entrega.setPedidoId(resultSet.getLong("pedido_id"));
        entrega.setPedidoId(resultSet.getLong("pedido_id"));
        entrega.setStatus(resultSet.getString("status"));
        entrega.setEndereco(resultSet.getString("endereco"));
        entrega.setCodigoDeRastreio(resultSet.getString("codigoDeRastreio"));

        entrega.setDataAtualizacao(resultSet.getTimestamp("data_atualizacao") != null ? resultSet.getTimestamp("data_atualizacao").toInstant() : null);

        return entrega;
    }

}
