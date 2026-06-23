package intermediario_01.collections;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    static void main() {
        /*
        Queue é uma coleção que segue a estrutura de dados de fila, onde os elementos são inseridos no final e removidos do início (FIFO - First In, First Out).
        Ela é parte da Java Collections Framework e é implementada por classes como LinkedList, PriorityQueue,ArrayDeque etc..
         */

         // Exemplo de uso de Queue
         Queue<String> fila = new LinkedList<>();
         fila.add("Pessoa 1");
         fila.add("Pessoa 2");
         fila.add("Pessoa 3");

         System.out.println("Fila: " + fila);

         String primeiroDaFila = fila.poll(); // Remove o primeiro elemento da fila
         System.out.println("Primeiro da Fila: " + primeiroDaFila);
         System.out.println("Fila após remover o primeiro elemento: " + fila);
         //todo
    }
}
