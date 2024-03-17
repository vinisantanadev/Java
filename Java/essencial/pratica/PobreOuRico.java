package essencial.pratica;
import java.util.Scanner;

public class PobreOuRico {
    public static void main(String[] args) {
        boolean rodar;
        do {
            rodar = false; // o programa só loopa se o usuário errar

            System.out.println("");
            System.out.println("Bem vindo ao identificador de classes!");
            System.out.println("Digite o número da opção que te classifica:");
            System.out.println("1. Possuo uma empresa, latifundio ou vivo de renda");
            System.out.println("2. Nenhuma das opções acima, recebo um salário mensal ou presto serviços");
            
            Scanner entrada = new Scanner(System.in);
            int opcao = entrada.nextInt();

            System.out.println('-' * 66);

            if (opcao != 1 && opcao != 2) {
                System.out.println("Não cara, digite apenas o número.");
                rodar = true;
            } else if (opcao == 1) {
                System.out.println("Agora digite qual opção define seu papel na empresa:");
                System.out.println("1. Poderia/Já não preciso trabalhar para manter a empresa");
                System.out.println("2. Se eu parar te trabalhar na empresa, ela irá falir");

                opcao = entrada.nextInt();

                if (opcao != 1 && opcao != 2) {
                    System.out.println("Errou o número, parabens seu burgues");
                    rodar = true;
                }
                else if (opcao == 1) {
                    System.err.println("Você é rico :)");
                } else {
                    System.out.println("Você faz parte da classe trabalhadora :)");
                }
            } else {
                System.out.println("Você faz parte da classe trabalhadora :)");
            }
        } while (rodar == true);
    }
}
