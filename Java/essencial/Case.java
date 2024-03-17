package essencial;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        do {
            System.out.println();

            Scanner entrada = new Scanner(System.in);

            System.out.print(": ");
            String letra = entrada.nextLine();

            switch (letra) {
                case "a" -> System.out.println("1");
                case "b" -> System.out.println("2");
                case "c" -> System.out.println("3");
                case "d" -> System.out.println("4");
//              o basico só que mais bonito
                case "todos" -> {
                    System.out.println("Achou que ia poder ficar em cima do muro??");
                    System.out.println("Escolha uma letra entre 'a' e 'd' imediatamente!!");
                    System.out.print(": ");
                    String letra2 = entrada.nextLine();

                    switch (letra2) {
                        case "a" -> System.out.println("1");
                        case "b" -> System.out.println("2");
                        case "c" -> System.out.println("3");
                        case "d" -> System.out.println("4");

                        case "A", "B", "C", "D" -> System.out.println("nao cara tem que ser em minusculo");

                        default -> System.out.println("Escreva uma letra entre 'a' e 'd' ou 'todos'");
                    }
                } // da pra colcoar varios elementos hein (e switches dentro de outros)!!
                case "A", "B", "C", "D" -> System.out.println("nao cara tem que ser em minusculo");
//              e da pra colocar varios &&'s de uma vez!! !!
                default -> System.out.println("Escreva uma letra entre 'a' e 'd' ou 'todos'");
            }
        } while (true);
    }
}
