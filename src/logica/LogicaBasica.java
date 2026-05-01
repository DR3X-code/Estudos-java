package logica;

import java.util.Arrays;

public class LogicaBasica {

    static void main() {
        executarAula();


    }

    static void executarAula() {
        demonstrarTiposEVariaveis();
        demonstrarOperadores();
        demonstraCondicionais();
        demonstraLoops();
        demonstrarMetodos();
        demonstrarArrays();
    }

    static void demonstrarTiposEVariaveis() {
        System.out.println("--- Fundamentos tipos e variaveis ---");

        int idade = 25;
        double altura = 1.75;
        boolean ativo = true;
        char inicial = 'l';
        String nome = "leandro";

        System.out.println("nome; " + nome + " ,altura:  " + altura + " ,inicial: " + inicial + " ,tipo: " + ativo + " ,idade:" + idade);

    }

    static void demonstrarOperadores() {
        System.out.println("\n--- Fundamentos operadores ---");

        int a = 10;
        int b = 3;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Mutiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        boolean maior = a > b;
        boolean igual = a == b;
        boolean logico = (a > 5) && (b < 5);

        System.out.println(" a > b ? " + maior);
        System.out.println(" a == b ? " + igual);
        System.out.println(" (a > 5 ) && (b < 5) ? " + logico);

    }

    static void demonstraCondicionais() {
        System.out.println("\n--- Fundamentos Condicionais ---");

        int nota = 78;

        if (nota >= 90) {
            System.out.println("conceito A:");

        } else if (nota >= 70) {
            System.out.println("conceito B:");

        } else {
            System.out.println("conceito C:");
        }
    }

    static void demonstraLoops() {
        System.out.println("\n--- Fundamentos Loops ---");

        System.out.println("For 1..5: ");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");

        }
        System.out.println("\nWhile 1..5: ");

        int contador = 5;

        //condicional de saida
        while (contador >= 1) {
            System.out.print(contador + " ");
            contador--;
        }

    }

    //Metodo
    static void demonstrarMetodos() {
        System.out.println("\n--- Fundamentos Metodos ---");

        int resultadoSoma = somar(3, 6);
        System.out.println("somar(3,6) = " + resultadoSoma);
    }

    private static int somar(int x, int y) {
        return x + y;
    }

    static void demonstrarArrays() {
        System.out.println("\n--- Fundamentos Arrays ---");

        int[] notas = {30, 15, 10, 95, 80};
        System.out.println("Array completo: " + Arrays.toString(notas));
        System.out.println("Primeira nota (indice 0): " + notas[0]);
        System.out.println("media das notas:  " + exercicioMediaArray(notas));
    }

    private static double exercicioMediaArray(int[] notas) {
        //toDo completar sem usar IA
        //quantos elementos tem, calcular media?

        double total = 0.0;
        int elementos = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas " + i + ": " + notas[i] );
            //pegando posicão 0 e incrimendo a posição +1
            total += notas[i];

            elementos ++;
            //para saber quantas vezes o loop rodou
        }
        return total / elementos;
    }
}
//quantas notas tem ?
//o valor de notas tem que ser o mesmo valor de divisão
//tive que pesquisar sobre o length e como utilizar array


//syntax de fluxo de controle
//metodos e parametros
//switch case
//loops
//
//classe/objeto

