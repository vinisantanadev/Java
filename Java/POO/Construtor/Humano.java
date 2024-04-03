package POO.Construtor;

public class Humano {
    String nome;
    String genero;
    int idade;
    double altura;
    double peso;
//  declarando atributos
    Humano(
        String nome,
        String genero,
        int idade,
        double altura,
        double peso
    ) { // apenas variáveis
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
//      'tudo isso??!!' sim,,, tudo isso pra que 3 vezes? sei la neh, isso é java?
//      com 'this' estamos dizendo que este.objeto(human) recebe o valor da string nome,
//      mas coloca 'this.nome' porque é o nome que ta la na classe main dentro do objeto
    } // *o método construtor deve ter o mesmo nome que a classe
    Humano(
        String nome,
        int idade,
        double altura,
        double peso
    ) { // este conjunto de atributos de um método construtor é chamado de signature
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    } // para aprender overload constructors, esse método(humano) é pra quem não tiver genero
    void comer() {
        System.out.printf("""

                    %s está comendo!

                """, this.nome);
    }
}
