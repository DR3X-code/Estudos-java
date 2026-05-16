package basico_02.polimorfismo;

public class NotificacaoWhatsapp implements Notificacao{
    @Override
    public String getNomeCanal() {
        return "WhatsAPP";
    }

    @Override
    public String envia(String destinario, String mensagem) {
        return "[WhatsAPP] Para: " + destinario + " Status: Entregue" +  " - texto: " + mensagem;
    }
}
