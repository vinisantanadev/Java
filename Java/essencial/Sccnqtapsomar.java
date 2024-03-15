//      *    SÓ COLA COM NOIS QUEM TA AQUI PRA SOMAR    *
package essencial;

import java.util.Scanner;

public class Sccnqtapsomar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//          aqui a gente cria o método
        
        System.out.println("");
        System.out.println("Bem vindo a somatória SCCNQTAPS (Só Cola Com Nois Quem Ta Aqui Pra SOmar)!");
        System.out.println("");
        System.out.println("Digite o primeiro númeoro:");

        double numero1 = entrada.nextDouble();
//          aqui a gente usa o método
        System.out.println("Digite o segundo número:");

        double numero2 = entrada.nextDouble();

        double resultado = numero1 + numero2;

        System.out.println("O Resultado da soma é: " + resultado + "!");
    }
}
