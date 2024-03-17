package essencial.pratica;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        boolean rodar = true;
        do {
            System.out.println("");
            
            Scanner entrada = new Scanner(System.in);

            System.out.print(": ");
            double numero1 = entrada.nextDouble();
            System.out.print(": ");
            double numero2 = entrada.nextDouble();
            System.out.print(": ");
            double numero3 = entrada.nextDouble();
/*
            if (numero1 > numero2 && numero1 > numero3) {
                System.out.println(numero1 + ", numero1 é o maior!");
            } else if (numero2 > numero1 && numero2 > numero3) {
                System.out.println(numero2 + ", numero2 é o maior!");
            } else {
                System.out.println(numero3 + ", numero3 é o maior!");
            }
*/
            double maximo = Math.max(numero1, Math.max(numero2, numero3));

            System.out.println(maximo + ", é o maior!");
        } while (rodar = true);
    }
}
