package pratica;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        boolean rodar = true;
        do {
            for (int linha = 1; linha <= 33; linha++) {
                System.out.print('-');
            }
//          faz uma linha apenas para layout
            System.out.println("");

            Scanner entrada = new Scanner(System.in);
//          pedir o número

            System.out.println("(Apenas números inteiros) Digite quantas vezes quer rodar o Fibonacci Wheel:");
            System.out.println(""); 
            System.out.print(": ");
            int loop = entrada.nextInt();
            for (int linha = 1; linha <= 33; linha++) {
                System.out.print('-');
            } 
            System.out.println(""); 
//          para fazer uma linha com proposito de layout apenas
            int numero1 = 1;
            int temp = 0;
            int fibonacci = 0;

//          formula:
//          fibonacci = (fibonacci - 2) + (fibonacci - 1);

//            do {
//                System.out.println(fibonacci);
//                if (fibonacci >= 3) {
//                    temp = numero1;
//                    numero1 = fibonacci;
//                }
//                fibonacci = numero1 + temp;
//            } while (fibonacci <= loop);
//          *fibonacci usando do while.

            for (fibonacci = 0; fibonacci <= loop; fibonacci = numero1 + temp) {
                System.out.println(fibonacci);
                if (fibonacci >= 1) {
                    temp = numero1;
                    numero1 = fibonacci;
                }
            } // fibonacci usando for
        } while (rodar == true);
    }
}
