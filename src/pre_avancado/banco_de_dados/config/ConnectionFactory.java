package pre_avancado.banco_de_dados.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final String usuario;
    private final String url;
    private final String senha;

    public ConnectionFactory(String usuario, String url, String senha) {
        this.usuario = usuario;
        this.url = url;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getUrl() {
        return url;
    }

    public String getSenha() {
        return senha;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);

    }

    public static ConnectionFactory getPostgreSQLConnectionFactory() {
        String usuario = "postgres";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String senha = "postgres";
        return new ConnectionFactory(usuario, url, senha);
    }

}
