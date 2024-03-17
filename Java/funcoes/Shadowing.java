package funcoes;
import java.util.Scanner;

public class Shadowing {
//  shadowing é a pratica de usar duas variaveis com o mesmo nome no escopo que está dentro do escopo onde a variavel foi declarada
//  sim eh isso ai se nao entendeu fodase 👍🙅‍♂️
//  ex:
    static double resultado;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;
//      declarando variaveis
        for (int linha = 1; linha <= 33; linha++) {
            System.out.print('-');
        }
        System.out.println("");
//      ----------------------------------------------
        System.out.println("digite um numero");
        System.out.print(": ");
        numero1 = entrada.nextInt();
//      pegando o numero1
        System.out.println("digite dois numero");
        System.out.print(": ");
        numero2 = entrada.nextInt();
//      pegando o numero2
        resultado = somar(numero1, numero2);
        System.out.println(resultado);
//      somando usando a variavel que foi declarada fora do escopo de main
    }
    static double somar(double numero1, double numero2) {
        resultado = numero1 + numero2;
        return resultado;
    }
//  esta funcao soma os valores do escopo de main, e atribui a variavel resultado, que foi declarada fora de ambos escopo
//  isso é shadowing 👍
}
