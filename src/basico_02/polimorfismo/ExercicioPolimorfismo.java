package basico_02.polimorfismo;

import java.util.List;

public class ExercicioPolimorfismo {

    public static void main(String[] args) {

        //TODO 1. Criar central de notificação
        CentralNotificacao centralNotificacao = new CentralNotificacao();

        //TODO 2. Adicionar canais a lista de central
        NotificacaoWhatsapp notificacaoWhatsapp = new NotificacaoWhatsapp();
        //centralNotificacao.adicionarCanal(notificacaoWhatsapp);
        // opcao 2: chamar metodo criarCanais(centralNotificacao.getCanais())

        //TODO 3. Chamar metodo para exibir quantidade de canais
        //System.out.println("Quantidade de Canais: " + centralNotificacao.getTotalCanais());

        //TODO 4. Chamar metodo para exibir quantidade de canais
        System.out.println("Canais cadastrados");
        //centralNotificacao.listarCanais().forEach(System.out::println);

        //TODO 5. Enviar notificacao para todos os canais cadastrados
        String destinatario = "Leandro";
        String mensagem = "Lembrete de usar commit do git para nao perder nada";
        System.out.println("Enviando notificacao para: " + destinatario);
        centralNotificacao.enviarComunicacao(destinatario, mensagem).forEach(System.out::println);
    }

    private static void criarCanais(List<Notificacao> canais) {
        NotificacaoSMS sms = new NotificacaoSMS();
        NotificacaoEmail email = new NotificacaoEmail();

        canais.add(sms);
        canais.add(email);
    }

}
