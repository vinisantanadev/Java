package essencial.pratica;

import java.util.Scanner;

public class ManipulandoChar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra = entrada.next().trim().charAt(0); // uma nota pra entender isso aqui: uam string é um array de vários caracteres
        System.out.println(letra);
    }
}