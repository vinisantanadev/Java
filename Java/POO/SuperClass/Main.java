package POO.SuperClass;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Noulede da Silva", 16, "3332024EAD");
        System.out.printf("""

                nome: %s;
                idade: %d;
                id_estudante: %s;

        """, estudante1.nome, estudante1.idade, estudante1.id_estudante);
    }
}
