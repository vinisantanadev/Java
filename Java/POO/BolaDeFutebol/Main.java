package POO.BolaDeFutebol;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static boolean rodar = true;
    public static void main(String[] args) {
        BolaDeFutebol minhaBola = new BolaDeFutebol();
//      chama uma outra classe e torna ela manipulavel
//      isso é muito foda
        do {
            System.out.print("""
                
                escolha uma das opções abaixo:
                chutar: 1 | analizar: 2 | fechar: 3 | :_ """);
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1 -> minhaBola.chutar();
                case 2 -> minhaBola.analizar();
                case 3 -> rodar = false;
                default -> System.out.println("é 1 ou 2 cara '-'");
            } // chutar, analizar, fechar o programa ou dizer que ta errado
//          esse case é uma obra de arte
        } while (rodar == true);
        // apenas para fins de loop
    }
} // sim este codigo está lindo
