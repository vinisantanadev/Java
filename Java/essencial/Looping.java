package essencial;

public class Looping {
    public static void main(String[] args) {
//      criando loops com while
        int contar = 1;
        while (contar <= 14) {
            System.out.println(contar);
            contar++;
        }
//      conta até 14
//      principalmente usado quando você não sabe quantas vezes vai loopar

//      criando loops com for
        for (contar = 1; contar <= 66; contar++) {
            System.out.print('-');
        }
//      faz uma linha de 66 caracteres
//      principalmente usado quando você sabe quantas vezes vai loopar
    }
}
