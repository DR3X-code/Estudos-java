package intermediario_01.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {

    static void main() {
            /*
            List é uma coleção ordenada que pode conter elementos duplicados.
            Ela é parte da Java Collections Framework e é implementada por classes como ArrayList, LinkedList, vector etc.
            */

            // Exemplo de uso de List
           List<String> listaNaoOrdenada = new ArrayList<>();
            listaNaoOrdenada.add("Elemento 1");
            listaNaoOrdenada.add("Elemento 2");
            listaNaoOrdenada.add("Elemento 3");
            listaNaoOrdenada.add("Elemento 2"); // Elemento duplicado

            System.out.println("Minha Lista: " + listaNaoOrdenada);
        //List<String> nomes =
        List<String> nomes = new LinkedList<>();
        nomes.add("Elemento 1");
        nomes.add("Elemento 2");
        nomes.add("Elemento 3");
        nomes.add("Elemento 4");
        nomes.add("Elemento 1"); // Elemento duplicado

        nomes.forEach(System.out::println);

    }
}
