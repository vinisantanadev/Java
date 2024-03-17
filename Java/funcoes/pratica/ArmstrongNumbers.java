package funcoes.pratica;
import java.util.Scanner;

public class ArmstrongNumbers {
//  *não vou excluir pra mostrar que voce nao conseguiu 👍
    static int numero;
    static int sobra;
    static int soma;
    static int original;
    static int resposta;
    public static void main(String[] args) {
        numero = 153;
        resposta = 0;
        original = numero;
        do {
            sobra = numero % 10;
            numero = numero / 10;
            soma = soma + sobra*sobra*sobra;
            System.out.println(soma);
        } while (numero > 0);
        if (soma == original) {
        }
        System.out.println(resposta);
    }
//}























//  -------------------------------------------------------------------
    static void resultado(int numero, int resposta) {
        
    }
}
