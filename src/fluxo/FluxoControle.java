package fluxo;

import java.util.List;

public class FluxoControle {

    static void main() {
        executarAula();

    }
    static void executarAula() {
        demostrarDeclaracaoEInicializacao();
        demostrarEscopoDeVariavel();
        demostrarSwitch();
        demostrarForWhileDowhile();
        demostrarBreakContinue();
        // Exercicios
        exercicioClassificarIdade(18);
        exercicioTabuada(7);
        exercicioDiaDaSemana(4);
        // FIXME poderia ter feito uma validacao de valor acima 0 (para nao passar negativos) nos 2 exercicios abaixo
        exercicioSomarAteLimite(5);
        exercicioContagemRegressiva(10);
    }

    static void demostrarDeclaracaoEInicializacao(){
        System.out.println("--- Fundamentos de Fluxo de Controle ---");
        int quantidade ;
        quantidade = 10;

        double preco = 25.5;
        String nome = "leandro";

        final int LIMITE_ALUNOS = 30;

        System.out.println("quantidade: " + quantidade + " ,preco: " + preco + " ,nome: " + nome + " ,limite de alunos: " + LIMITE_ALUNOS);

    }

    static void demostrarEscopoDeVariavel(){
        System.out.println("\n--- Fundamentos de Escopo de Variavel ---\n");

        int nivel = 2;

        if (nivel >= 2 ){
            String mensagem = "nivel intermediario" ;
            System.out.println(mensagem);
        }

        System.out.println("Nivel atual: " + nivel);

    }

    static void demostrarSwitch(){
        System.out.println("\n--- Fundamentos de Switch ---\n");

        int dia = 3;
        String nomeDoDia;

        switch (dia){
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Dia inválido";
                break;
        }
        System.out.println("Dia " + dia + ": " + nomeDoDia);
    }


    static void demostrarForWhileDowhile(){
        System.out.println("\n--- Fundamentos de For, While e Do-While ---\n");

        //utilizar quando precisa do contador
        System.out.println("For 1..5: ");
        int[] numeros = {1,2,3,4,5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }


        System.out.println("\nForEach 1..5: ");
        List<Integer> cont = List.of(1,2,3,4,5);
        for(int x: cont){
            System.out.print(x + " ");
        }


        System.out.println("\nWhile 1..5: ");
        int contador = 5;
        //condicional de saida
        while (contador >= 1) {
            System.out.print(contador + " ");
            contador--;
        }

        System.out.println("\nDoWhile (executa pelo menos uma vez ): ");
        int tentativas = 0;
        do{
           System.out.println("Tentativa " + (tentativas + 1));
           tentativas++;
        }while (tentativas < 1);

    }
    static void demostrarBreakContinue(){
        System.out.println("\n--- Fundamentos de Break e Continue ---\n");

        System.out.println("\nContinue: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula a iteração atual quando i é par
            }
            System.out.print(i + " ");
        }

        System.out.println("\nBreak: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break; // Interrompe o loop quando i é igual a 5
            }

        }

    }

    /**
     * EXERCICIO 1: classificar idade com if/else.
     */
    //FIXME (melhoria) se esta dando print no metodo, poderia alterar o retorno para void
    public static String exercicioClassificarIdade(int idade){
        System.out.println("\n--- 01 Exercicio para classificar idade --- \n");
        if (idade >= 18){
            System.out.println("Voce é de maior, sua idade é: " + idade );
        } else{
            System.out.println("Voce é de menor, sua idade é: " + idade );
        }
        return "";
    }

    /**
     * EXERCICIO 2: converter numero em dia da semana com switch.
     */
    //FIXME (melhoria) se esta dando print no metodo, poderia alterar o retorno para void
    public static String exercicioDiaDaSemana(int numeroDia) {
        System.out.println("\n--- 02 exercicio Dia Da Semana---\n");

            // FIXME (melhoria) usei a versao mais enxuta do switch usando lambda (java8)
            String nomeDoDia = switch (numeroDia) {
                case 1 -> "Domingo";
                case 2 -> "Segunda-feira";
                case 3 -> "Terça-feira";
                case 4 -> "Quarta-feira";
                case 5 -> "Quinta-feira";
                case 6 -> "Sexta-feira";
                case 7 -> "Sábado";
                default -> "Dia inválido";
            };

        System.out.println("Dia " + numeroDia + ": " + nomeDoDia);

        return nomeDoDia;
    }

    /**
     * EXERCICIO 3: somar numeros de 1 ate o limite usando for.
     */
    //FIXME (melhoria) se esta dando print no metodo, poderia alterar o retorno para void
    public static int exercicioSomarAteLimite(int limite) {
        System.out.println("\n--- 03 exercicio Somar Ate Limite ---\n ");

        int soma = 0;
        //condicional de saida
        for (int i = 1; i <= limite; i++) {
             soma = soma  + i;
             //FIXME (melhoria) poderia usar "soma += i", o operador += ou -= considera que está pegando o valor atual da variável e somando ou subtraindo o valor do lado direito, e depois atribuindo o resultado de volta à variável.
        }
        System.out.println(soma);

        return soma;

    }

    /**
     * EXERCICIO 4: contagem regressiva com while.
     */
    public static void exercicioContagemRegressiva(int inicio) {
        System.out.print("\n---  04 exercicio Contagem Regressiva --- \n ");
        int Regressivo = 0; //FIXME (correção) nome de variavel e metodo sempre minusculo, constante tudo Maiusculo, nome de classe padrao CamelCase (primeira letra sempre Maiuscula)
        while ( inicio >= Regressivo) {
            System.out.print(inicio + " ");
            inicio--;
        }
        return; // FIXME (correção) não há necessidade do return, pois o método é void, ou seja, não retorna nenhum valor.
    }

    /**
     * EXERCICIO 5: tabuada com for.
     */
    public static void exercicioTabuada(int numero) {
        System.out.print("\n---  05 exercicio Tabuada --- \n ");

        for (int x =0; x <= 10; x++ ){
            int multiplicao = numero * x; // FIXME (melhoria) não precisa declarar uma variavel se voce nao reaproveita depois

        System.out.println("Tabuada: "+ x +" * " + numero +" = " + multiplicao ); // poderia ter colocado (numero * x) aqui direto
        }
        return; // FIXME (correção) não há necessidade do return, pois o método é void, ou seja, não retorna nenhum valor.
    }

}




