package array;
import java.util.Arrays;
import java.util.Scanner;

public class ObjectsArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[6];
        System.out.println("Digite 6 nomes:");
//      for (String loop : nomes) {
//          System.out.print(": ");
//          loop = entrada.next();
//      } // para pegar os nomes
//      mas acho que nao funciona com string
        for (int loop = 0; loop < nomes.length; loop++) {
            System.out.print(": ");
            nomes[loop] = entrada.next();
        }
        entrada.close();
        //      apenas para fechar a variavel entrada, pois não vamos usar novamente
        System.out.println(Arrays.toString(nomes));
    }
}
