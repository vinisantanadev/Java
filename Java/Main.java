package Java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner pergunta = new Scanner(System.in);

        System.out.println("do zero para o nada:"); //pergunta
        String resposta = pergunta.nextLine(); // pega a resposta


        System.out.println("do zero para o nada, " + resposta + "!"); // printa a resposta

        System.out.println("Quantos anos nós temos?");
        float resposta2 = pergunta.nextFloat(); // pega a resposta

        System.out.println("Esta é a nossa idade: " + resposta2 + " anos!"); //

    }
}
