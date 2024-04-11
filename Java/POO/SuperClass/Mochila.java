package POO.SuperClass;

import java.util.ArrayList;

public class Mochila {
    static int loop;
    static int numero_de_itens = 0;
    ArrayList<String> itens = new ArrayList<String>();
    void mostrarInventario () {
        System.out.println("\n" + "itens em seu inventário:" + "\n");
        for (loop = 0; loop < itens.size(); loop++) {
            System.out.println(loop + " - " + itens.get(loop));
        } // mostra os itens no inventario
        for (loop = 0; loop < 33; loop++) {
            System.out.print('-');
        }
    }
}
