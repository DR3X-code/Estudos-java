package basico_02.polimorfismo;

public class NotificacaoEmail implements Notificacao{

    @Override
    public String getNomeCanal() {
        return "E-mail";
    }

    @Override
    public String envia(String destinario, String mensagem) {
        return "[E-mail] Para: " + destinario + " Assunto : teste Interface" +  " - texto: " + mensagem;
    }

    public String envia(String destinario, String mensagem, String assunto) {
        return "[E-mail] Para: " + destinario + " Assunto : " + assunto +  " - texto: " + mensagem;
    }
}
