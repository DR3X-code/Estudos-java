package basico_02.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class CentralNotificacao {


    private List<Notificacao> canais;

    public List<String> enviarComunicacao(String destinario, String mensagem){

        List<String> resultado = new ArrayList<>();

        //toDo
        for (Notificacao canal : canais){
            resultado.add(canal.envia(destinario, mensagem));

        }
        return resultado;
    };

}


