package funcoes;
import java.util.Scanner;
public class MethodOverloading {
//  primeiro que sim, método e funcão em java são a mesma coisa, apenas sinonimos, funcao é o nome oficialmente usado.
//  o nome ja descreve mas, é sobre ter dois ou mais métodos com o mesmo nome, e com mesmo tipo isso é method overloading
//* maaaas, voce pode criar duas funcoes, com o mesmo nome, se elas retornarem tipos diferentes 👍
//* ooooouuu, se as duas funcoes retornarem o mesmo tipo, porem com quantidades diferentes de variaveis
    static int linha;
    static int idade;
    static String nome;
    static String ela_fala;
    static String ela_fala_de_novo;
//  declarando variaveis
    public static void main(String[] args) {
        for (linha = 1; linha <= 33; linha++) {
            System.out.print('-');
        } System.out.println("");
//      para proposito de layout apenas
//      -----------------------------------------
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite seu nome");
            System.out.print(": ");
            nome = entrada.nextLine();
            System.out.println("Digite sua idade");
            System.out.print(": ");
            idade = entrada.nextInt();
        }
//      pede o nome e a idade
//      esse 'try' serve como um bloco pra usar a entrada apenas quando precisar, assim não tem memory leak
//      fecha entrada, ja que nao será mais usado
        for (linha = 1; linha <= 33; linha++) {
            System.out.print('-');
        } System.out.println("");
//      para proposito de layout apenas
        funcao(nome);
        funcao(idade);
        funcao(ela_fala, ela_fala_de_novo);
//      printando as funções que servem pra printar o nome e a idade, mas ambas são as mesmas, que retornam valores de tipos diferentes.
    }// ---------------------------------------------
    static void funcao(String nome) {
        System.out.println("Eu sou a funcao, sirvo para imprimir seu nome:");
        System.out.println(nome);
        System.out.println("");
    }// printa o nome
    static void funcao(int idade) {
        System.out.println("Eu sou a funcao, sirvo para imprimir sua idade:");
        System.out.println(idade);
        System.out.println("");
    }// printa a idade
    static void funcao(String ela_fala, String ela_fala_de_novo) {
        System.out.println(ela_fala = "E eu também sou outra funcao!!");
        System.out.println(ela_fala_de_novo = "Nós 3 temos o mesmo nome, porém, nós retornamos tipos diferentes, ou quantidades diferentes do mesmo tipo!!");
        System.out.println("e eu também imprimo essa linha aqui em baixo olha:");
        for (linha = 1; linha <= 33; linha++) {
            System.out.print('-');
        }// para layout apenas
    }// aqui ela fala, duas vezes!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//  primeiro que sim, método e funcão em java são a mesma coisa, apenas sinonimos, funcao é o nome oficialmente usado.
//  o nome ja descreve mas, é sobre ter dois ou mais métodos com o mesmo nome, e com mesmo tipo, isso é method overloading
//* maaaas, voce pode criar duas funcoes, com o mesmo nome, se elas retornarem tipos diferentes 👍
//* ooooouuu, se as duas funcoes retornarem o mesmo tipo, porem com quantidades diferentes de variaveis
}
