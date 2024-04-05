package POO.ArrayDeObjetos;
import java.util.ArrayList;
import javax.smartcardio.Card;

public class Inventario {
    static int loop;
    static int numero_de_itens = 0;
    ArrayList<String> itens = new ArrayList<String>();
    void pegar(Livro adicionar_item) {
        itens.add(adicionar_item.nome);
        numero_de_itens++;
//      !ele aumenta esse numero para cada item adicionado
//      assim é possivel contar ou definir um limite de itens na mochila!!
    } // metodo adiciona livro(s) ao inventario
    void mostrarInventario (Livro mostrar_livros) {
        System.out.println("\n" + "itens em seu inventário:" + "\n");
        for (loop = 0; loop < itens.size(); loop++) {
            System.out.println(loop + " - " + itens.get(loop));
        } // mostra os itens no inventario
        for (loop = 0; loop < 33; loop++) {
            System.out.print('-');
        }
    }
}
