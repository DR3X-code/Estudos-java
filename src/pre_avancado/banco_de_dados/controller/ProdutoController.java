package pre_avancado.banco_de_dados.controller;

import pre_avancado.banco_de_dados.config.ConnectionFactory;
import pre_avancado.banco_de_dados.dominio.Produto;
import pre_avancado.banco_de_dados.service.ProdutoService;

public class ProdutoController {

    static void main(){
        //abrindo conexao postgre
        ConnectionFactory connectionFactory = ConnectionFactory.getPostgreSQLConnectionFactory();
        //Chamando service produto
        ProdutoService service = new ProdutoService(connectionFactory);
        //criando massa de teste
        Produto produto1 = new Produto("Produto 1", "Descrição do produto 1", 100.0);
        Produto produto2 = new Produto("Produto 2", "Descrição do produto 2", 200.0);
        Produto produto3 = new Produto("Produto 3", "Descrição do produto 3", 300.0);

        //C:create
        service.salvar(produto1);
        service.salvar(produto2);

        //R:read
        Produto produtoEncontrado = service.buscarPorId(18L);
        System.out.println(produtoEncontrado);

        //U:update
        produto1.setNome("Produto 1 - Atualizado");
        produto1.setDescricao("Descrição do produto 1 - Atualizada");
        produto1.setValor(150.0);
        service.atualizar(produto1);


        //D:delete
        service.deletar(17L);
        service.listar().forEach(System.out::println);

    }


}
