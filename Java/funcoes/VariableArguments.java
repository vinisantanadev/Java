package funcoes;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
//      var args é quando a gente não sabe quantos imputs vamos ter??
        funcao(13, 8, 9 ,46846, 321);
//      antes de tentar entender a linha acima, leia a partir da linha 11
    }
//  ----------------------------------------------------------------------------
    static void funcao(int ...array_de_inteiros) {
//  pelo que entendi, esse 'int ... + nome_do_array' é quando você não sabe quantas variaveis vai delcarar??
//  ta acho que esse int '... + nome_do_array' diz que o metodo funcao vai aceitar uma quantidade variavel de argumentos inteiros...
        System.out.println(Arrays.toString(array_de_inteiros));
        System.out.println("sim... mt foda...");
    }
}
