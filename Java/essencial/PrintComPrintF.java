package essencial;

public class PrintComPrintF {
    public static void main(String[] args) {
        String codenome = "parsa";
        System.out.printf   ("""

            Este é um printf e eu estou testando, %s!!
            gostou, gostou. nao gostou faz 5 minutin na mao, nao?
            fica ruim?

        """, codenome);
//      ele serve pra gente formatar melhor o texto
//      -------------------------------------------
//      *System.out.printf("%b, para o tipo booleano", variavel)
//      *System.out.printf("%c, para o tipo char", variavel)
//      *System.out.printf("%s, para o tipo string", variavel)
//          se voce colocar um número após o '%' e antes do 's',
//          este número vai dizer o minimo de caracteres que,
//          o printf vai printar da variavel. ex: %10s;
//          para que este espaço minimo seja printado após a variavel,
//          digite -numero. ex: %-10s;
//      *System.out.printf("%d, para o tipo inteiro", variavel)
//      *System.out.printf("%f, para o tipo double", variavel)
//          para formatar o double, coloque, por exemplo: %.3f;
//          para printar se o numero é negativo ou positivo,
//          coloque '+' antes do f. ex: %+f;
//          pode colocar também %020f, assim ele vai printar,
//          varios 0 antes do numero;
//          se quiser formatar o numero com virgula, coloque %,f;
    }
}
