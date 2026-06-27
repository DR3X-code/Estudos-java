package pre_avancado.banco_de_dados.controller;

import pre_avancado.banco_de_dados.config.ConnectionFactory;
import pre_avancado.banco_de_dados.dominio.Cliente;
import pre_avancado.banco_de_dados.service.ClienteService;

import java.security.Provider;

public class ClienteController {

    static void main() {
        //abrindo conexao com postgres
        ConnectionFactory connectionFactory = ConnectionFactory.getPostgreSQLConnectionFactory();
        //Chamando service
        ClienteService service = new ClienteService(connectionFactory);

        //Criando massa de teste
        Cliente cliente1 = new Cliente("João", "xxx.xxx.xxx-xx", "joao@email.com");
        Cliente cliente2 = new Cliente("Maria", "1xx.xxx.xxx-xx", "maria@email.com");

        //C:criar
        service.salvar(cliente1);
        service.salvar(cliente2);

        //R:Listando clientes
        //service.listar().forEach(System.out::println);
        Cliente cliente1Atualizacao = service.buscarPorId(2L);

        //U:atualiazar
        cliente1Atualizacao.setNome("joao Atualizado");
        service.atualizar(cliente1Atualizacao);
        //service.listar().forEach(System.out::println);

        //D:deletar
        service.deletar(3L);
        service.listar().forEach(System.out::println);

    }
}

//receber e enviar dados
