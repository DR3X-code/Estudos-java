package basico_02.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class CentralNotificacao {

    /**
     * todo
     * 1. Criar um atributo privado do tipo: List<Canais> chamado canais
     * 2. Criar um método publico do tipo void: chamado adicionarCanal, que recebe um parametro do tipo Canal e adiciona a lista de canais.
     * 3. Criar um método publico do tipo int: chamado getTotalCanais, que retorna a quantidade de canais cadastrados.
     * 4. Criar um método publico do tipo List<String>: chamado listarCanais, que retorna os nomes dos canais configurados.
     * 5. Criar um método publico do tipo List<String>: chamado enviarComunicacao, que recebe dois parametros: destinatario e mensagem. O método deve percorrer a lista de canais e chamar o método enviar(destinatario, mensagem) de cada canal, armazenando os resultados em uma lista de strings e retornando essa lista.
     */

    private List<Notificacao> canais;

    public List<String> enviarComunicacao(String destinario, String mensagem){

        List<String> resultado = new ArrayList<>();

        for (Notificacao canal : canais){
            resultado.add(canal.envia(destinario, mensagem));

        }
        return resultado;
    };

}


