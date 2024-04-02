package POO.BolaDeFutebol;

import java.util.Scanner;

public class BolaDeFutebol {
    static int peso = 433; // em gramas
    static double cosAnguloChute = 0.800; // esse é o cosseno de 35°
    static double sinAnguloChute =  0.5736; // esse é o seno de 35°
    static double forcaG = 9.8;
    static double distancia;
    static String cor = "Branca";
    static String marca = "Santos FC";
    static Scanner entrada = new Scanner(System.in);
    // delcarando variaveis e scanner
    void chutar() {
        System.out.print("""
            
            Digite a porcentagem da força (sabendo que 100% = 80m/s)
            :  """);
        double velocidadeChute = entrada.nextInt();
        velocidadeChute = velocidadeChute / 100 * 80;
//      calcula a porcentagem da força, 100% é a força máxima média de um chute
        double velocidadeH = velocidadeChute * cosAnguloChute;
//      vai calcular a velocidade horizontal baseado na velocidade do chute,
//      vezes o cosseno do angulo do chute, nesse caso por padrão, coloquei 35°
        double velocidadeV = velocidadeChute * sinAnguloChute;
//      vai calcular a velocidade vertical baseado na velocidade do chute,
//      vezes o seno do angulo do chute, nesse caso por padrão, coloquei 35°
        double tempo = velocidadeV / forcaG;
//      vai calcular o tempo de viagem da bola baseado na velocidade vertical,
//      dividida pela forçaG, que na superficie da terra é de 9,8
        double distancia = velocidadeH * tempo;
//      aqui ele vai me dizer a distancia percorrida baseado na,
//      velocidade horizontal vezes o tempo que ela vai ficar sem tocar no chão
        System.out.printf("""
                A bola percorreu %f metros
                em %f segundos!!
                """, distancia, tempo);
    } // se é um método deve abrir e fechar parenteses após o mesmo (obvio)
    void analizar() {
        System.out.printf("""

                A cor da bola é %s
                Há um brasão que mostra a marca: %s

        """, cor, marca);
    }
}
