package POO.Construtor;
// essencial de metodo construtor e overload constructors
public class Main {
    static String nomeHumano = "artemis";
    static int idadeHumano = 16;
    static double alturaHumano = 1.69;
    static double pesoHumano = 56.6;
    public static void main(String[] args) {
        Humano meuHumano1 = new Humano(nomeHumano, idadeHumano, alturaHumano, pesoHumano);
//      *como eu fiz um 'overload constructor', ou seja como na classe Humano,
//      tem dois construtores com o mesmo nome, e um ta sem o atributo genero,
//      eu posso fazer um humano sem genero, ele só vai ignorar;
//      voce pode atribuir valores de variaveis (ou seja, pode pedir pro usuário imputar) ou,
        Humano meuHumano2 = new Humano("lua", "feminino", 19, 1.79, 69);
//      você pode atribuir valores de atributos diretamente para um objeto!
        Humano[] humanos = {meuHumano1, meuHumano2};
//      criando um array para que possamos printar usando for com apenas um printf
        for (Humano humano : humanos) {
//          a gente ta meio que criando >>algo<< chamado humano, e esse algo vai ser usado,
//          enquanto(:) não ser maior que a quantidade de humanos (quantidade no array)
//          por isso ele só vai printar duas vezes, pois temos apenas dois humanos no array
            System.out.printf("""

                    nome: %s;
                    genero: %s;
                    idade: %d;
                    altura: %.2f;
                    peso: %.1f;

                """, humano.nome, humano.genero, humano.idade, humano.altura, humano.peso);
            humano.comer();
//          assim voce chama o método!
//          caso não esteja usando o array, utilize 'meuHumano1.comer()'
        }
    }
}
