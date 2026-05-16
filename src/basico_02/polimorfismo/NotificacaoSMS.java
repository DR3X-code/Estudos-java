package basico_02.polimorfismo;

public class NotificacaoSMS implements Notificacao {
    @Override
    public String getNomeCanal() {
        return "SMS";
    }

    @Override
    public String envia(String destinario, String mensagem) {
        return "[SMS] Para: " + destinario + " - texto: " + mensagem;
    }
}
