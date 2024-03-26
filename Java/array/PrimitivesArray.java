package array;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PrimitivesArray {
    static int loop;
    static Scanner entrada = new Scanner(System.in);
//  não é possivel armazenar valores de tipos diferentes em um mesmo array
    public static void main(String[] args) {
//      int[] conjunto1 = new int[5];
//      esta apenas declarando o array, sem atribuir valor
//      quando não é atribuido um valor, ele retorna nulo
        int[] numeros = {10, 20, 30, 40, 60};
        for (int printar : numeros) {
            System.out.println(printar);
            // esta é uma maneira de printar todas as casas do array
        }
        for (loop = 1; loop <= 33; loop++) {
            System.out.print('-');
        } // par layout apenas
        System.out.println("");
        System.out.println("Agora  digite os números:");
        for (int printar : numeros) {
            System.out.print(": ");
            printar = entrada.nextInt();
//          para alocar numeros que o usuario digitar no array
        }
        System.out.println(Arrays.toString(numeros));
        // * esta acima é a melhor forma de printar arrays
    }
}
