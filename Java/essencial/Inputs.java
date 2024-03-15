package essencial;

import java.util.Scanner;
// importa a função Scanner

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner input = new Scanner(System.in);
        /*
            na linha acima a gente cria o objeto 'new Scanner()'
                e atribui a variável 'input'
            'in' é a classe para input de telcados
            dentro desse 'new Scanner()' pode colocar um arquivo, por exemplo
        */
        Integer numeroInput = input.nextInt();
        System.out.println("O número que digitou é: " + numeroInput);
//          esse input pode trazer todas as funções do Scanner
    }
}
