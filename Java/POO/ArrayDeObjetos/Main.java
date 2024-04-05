package POO.ArrayDeObjetos;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static int opcao;
    public static void main(String[] args) {
        do { 
            Inventario inventario = new Inventario();
            Livro livro1 = new Livro("Gravity Falls");
            Livro livro2 = new Livro("HP Lovecraft");
            Livro livro3 = new Livro("The 36 Lessons Of Vivec");
            // livros (obvio mas eu gosto de separar sessões com comentarios)
            Livro[] estante_de_livros = {livro1, livro2, livro3};
            // array sem numero definido
            int indice = 0;
            // apenas para printar o indice dos livros
            System.out.print("""


                Você encontra os seguintes livros:

            """);
            for (Livro livros : estante_de_livros) {
                System.out.printf("""
                    %d - %s

                """, indice, livros.nome);
                indice++;
            } // printa os livros
            for (int loop = 0; loop < 33; loop++) {
                System.out.print('-');
            } // apenas para criar uma linha
            System.out.print("\n" + "pegar: 1 | pegar tudo: 2 | sair: 0 | : ");
            opcao = entrada.nextInt();
            if (opcao != 0 && Inventario.numero_de_itens >= 9) {
                System.out.println("\n" + "mochila cheia!!");
                opcao = 0;
            } // para que nao seja possivel adicionar se a mochila tiver cheia
            switch (opcao) {
                case 1 -> {
                    System.out.print("\n" + "index do livro que deseja pegar: ");
                    opcao = entrada.nextInt();
                    inventario.pegar(estante_de_livros[opcao]);
                    inventario.mostrarInventario(livro1);
                    opcao = 0;
//                  opcao = 0 para fechar o programa, pegou pegou, não pegou? faz 10 na mão 😤
                } // adiciona apenas o livro que o usuário escolher
                case 2 -> {
                    for (Livro pegar : estante_de_livros) {
                        inventario.pegar(pegar);
                    } // pega livro um por um até acabar os livros, não, não tem um jeito mais otimizado
                    inventario.mostrarInventario(livro1);
                    opcao = 0;
//                  opcao = 0 para fechar o programa, pegou? pegou. ja era mermao ta na mão 😤
                } // pega todos os livros
                case 0 -> opcao = 0;
//              opcao = 0 para fechar o programa, pegou pegou, não pegou? faz 10 na mão 😤
            }
            System.out.println("\n" + "espaço usado: " + Inventario.numero_de_itens + "/9");
//          mostra quantidade de intens na mochila
        } while (opcao != 0);
    }
}
