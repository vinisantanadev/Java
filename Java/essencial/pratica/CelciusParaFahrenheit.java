package essencial.pratica;

import java.util.Scanner;

public class CelciusParaFahrenheit {
    public static void main(String[] args) {
        System.out.println("");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número em C°: ");
        float celcius = entrada.nextFloat();
        double fahreinheit = celcius * 9/5 + 32;

        System.out.println(celcius + "C° em fahrenheit é: " + fahreinheit + "F!");

        System.out.println("");
    }
}
