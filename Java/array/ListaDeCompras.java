package array;
import java.util.Scanner;
import java.util.ArrayList;
// importar o modulo para utilizar perguntas e para criar a lista, e toranar ela modificável
public class ListaDeCompras {
    static Integer opcao;
    static Integer editar;
    static String adicionar = "null";
    static Integer loop;
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<String> itens = new ArrayList<String>();
    static ArrayList<Integer> quantidades = new ArrayList<Integer>();
    // declarando as variaveis, scanner e arrays
    public static void main(String[] args) {
        do {
            System.out.print("""
                            
                            Bem vindo \u00e0 sua lista de compras!
                            Digite o que deseja comprar, aperte espa\u00e7o;
                            Digite a quantidade, aperte enter;
                            Quando tiver pronto digite X.
                            
                            """);
//          o '\n' serve pra quebrar linha, e gosto de deixar separado do resto da string
            while (!adicionar.equals("x") && !adicionar.equals("X")) {
                System.out.print(": ");
                adicionar = entrada.next();
                itens.add(adicionar);
//              ao contrario do array normal, para editar os elementos do arraylist
//              devem ser usados métodos (arraylist.metodo)
                if (!adicionar.equals("x") && !adicionar.equals("X")) {
//              esse 'adicionar' ta aqui dentro do 'if'
//              porque se o usuario digitar x, ele não é adicionado a lsita
                    quantidades.add(entrada.nextInt()); 
                }// isso porque se o usuário digitar x, ele não vai pedir a quantidade
            }// para o usuário adicionar itens e quantidades na lista
            itens.remove(itens.size() - 1);
            for (loop = 0; loop < 33; loop++) {
                System.out.print('-'); }
//          apenas para criar uma linha
            System.out.println("");
            for (loop = 0; loop < itens.size(); loop++) {
                System.out.println(loop + " - " + itens.get(loop) + ", " + quantidades.get(loop)); }
//          para mostrar a lista
            for (loop = 0; loop < 33; loop++) {
                System.out.print('-'); }
//          apenas para criar uma linha
            System.out.print("\neditar tudo: 1 | editar item: 2 | fechar: 3 | opção: ");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                adicionar = "loopar";
            } else if (opcao == 2) {
                System.out.println("index do item que deseja editar: ");
                editar = entrada.nextInt();
                System.out.println("""
                                digite item substituto, aperte espaço
                                digite a quantidade, aperte enter
                                : 
                                """);
                adicionar = entrada.nextLine();
                itens.set(editar, adicionar);
            } else {
                adicionar = "x";
            }
        } while (!adicionar.equals("x") && !adicionar.equals("X"));
    }// *muito importante lembrar que pra comparar strings, deve usar o metodo .equals()
}// *e adicionar o '!' antes da variavel que quer comparar, caso para ser diferente