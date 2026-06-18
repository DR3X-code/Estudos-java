package intermediario_01.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    static void main() {
        /*
        Set é uma coleção que não permite elementos duplicados e não mantém uma ordem específica.
        Ela é parte da Java Collections Framework e é implementada por classes como HashSet, LinkedHashSet, TreeSet etc.
         */

        //somente a chave

        // Exemplo de uso de Set
      Set<String> conjunto = new HashSet<>();
        conjunto.add("Elemento 1");
        conjunto.add("Elemento 2");
        conjunto.add("Elemento 3");
        conjunto.add("Elemento 2"); // Elemento duplicado, não será adicionado

        System.out.println("Meu Conjunto: " + conjunto);

        Set<String> ordemInsercao = new LinkedHashSet<>();
        ordemInsercao.add("Elemento A");
        ordemInsercao.add("Elemento B");
        ordemInsercao.add("Elemento D");
        ordemInsercao.add("Elemento C");

        System.out.println("Ordem de Inserção: " + ordemInsercao);

        Set<String> ordemChave = new TreeSet<>();
        ordemChave.add("Elemento X");
        ordemChave.add("Elemento Z");
        ordemChave.add("Elemento Y");

        System.out.println("Ordem de Chave: " + ordemChave);

    }
}
