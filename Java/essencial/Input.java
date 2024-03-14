package essencial;

import java.util.Scanner;
// importa a função Scanner

public class Input {
    public static void main(String[] args) {
        System.out.println("diga algo:");
        Scanner input = new Scanner(System.in);
        // dentro desse 'new Scanner()' pode colocar um arquivo, por exemplo
        System.out.println(input.nextInt());
        // esse input pode trazer todas as funções do Scanner
    }
}
