package essencial;

public class Final {
    public static void main(String[] args) {
        int numero1 = 3;
        numero1 = 6;
        // nós atualizamos o numero1 de 3, para 6.
        final int NUMERO2 = 13;
        NUMERO2 = 16;
//      ele nao atualizou, porque o numero dois foi declarado com 'final';
//      não é necessário usar todos os caracteres capitalizados,
//      é uma boa pratica;
    }
}
