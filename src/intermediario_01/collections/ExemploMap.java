package intermediario_01.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {

    static void main() {
        /*
        Map é uma coleção que associa chaves a valores. Cada chave é única, mas os valores podem ser duplicados.
        Ela é parte da Java Collections Framework e é implementada por classes como HashMap, TreeMap, LinkedHashMap
         */

        //chave não se repete

        // Exemplo de uso de Map
        Map<String, String> mapaNaoOrdenado = new HashMap<>();
        mapaNaoOrdenado.put("chave1", "Valor 1");
        mapaNaoOrdenado.put("chave2", "Valor 2");
        mapaNaoOrdenado.put("chave3", "Valor 3");
        mapaNaoOrdenado.put("chave4", "Valor 4");
        mapaNaoOrdenado.put("chave1", "Valor 5"); // Sobrescreve o valor associado à chave1

        System.out.println("Minha Map: " + mapaNaoOrdenado);
        System.out.println("Valor chave 2 (hashMap) : " + mapaNaoOrdenado.get("chave2"));

        Map<Integer, String> mapaMantemOrdemInsercao = new LinkedHashMap<>();
        mapaMantemOrdemInsercao.put(1, "Valor A");
        mapaMantemOrdemInsercao.put(2, "Valor B");
        mapaMantemOrdemInsercao.put(3, "Valor C");
        mapaMantemOrdemInsercao.put(4, "Valor D");

        System.out.println("mapa Mantem Ordem Insercao (LinkedHashMap) : " + mapaMantemOrdemInsercao);

        Map<String, String> mapaOrdenado = new TreeMap<>();
        mapaOrdenado.put("chave 3", "Valor 3");
        mapaOrdenado.put("chave 1", "Valor 1");
        mapaOrdenado.put("chave 4", "Valor 4");
        mapaOrdenado.put("chave 2", "Valor 2");


        System.out.println("Minha Map Ordenado (treemap): " + mapaOrdenado +"ordenação em tree map");;

    }
}
