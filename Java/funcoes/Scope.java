package funcoes;

public class Scope {
    public static void main(String[] args) {
//      scope is where we can acess our variables??
//      meio que  quando a gente fala 'ah so pode printar essa variavel dentro de main, porque ela só foi delcarada/refenciada em main'
//      a gente pode falar que a variavel está dentro do escopo main
//      Em Java, o escopo refere-se à região de um programa onde uma variável é válida e pode ser acessada.
        int numero1 = 10;
        int numero2 = 20;
        {
            numero1 = 30;
            System.out.println(numero2);
//          mas você pode acessar o que está fora do escopo deste bloco
        }
        System.out.println(numero1);
//      ele vai printar 30, porque isso foi alterado no escopo do bloco acima
    }
    static void somar() {
        int resultado = numero1 + numero2;
//      não pode ser acessada porque está no escopo de main
        System.out.println(resultado);
    }
}
