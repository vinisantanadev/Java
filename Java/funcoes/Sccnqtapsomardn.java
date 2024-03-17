package funcoes;
import java.util.Scanner;

public class Sccnqtapsomardn {
    public static void main(String[] args) {
        System.out.println("");
        soma();
    }
    static void soma() {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, resultado;
//      aqui a gente cria o método e faz as atribuicoes
        System.out.println("Bem vindo a somatória SCCNQTAPSDN (Só Cola Com Nois Quem Ta Aqui Pra S+mar de novo!)!!");
        System.out.println("");
        System.out.println("Digite o primeiro númeoro:");
//      ----------------------------------------------------
        numero1 = entrada.nextDouble();
//          aqui a gente usa o método
        System.out.println("Digite o segundo número:");
        numero2 = entrada.nextDouble();
        resultado = numero1 + numero2;
//      aqui a gente faz a soma
        System.out.println("O Resultado da soma é: " + resultado + "!");
    }
}
