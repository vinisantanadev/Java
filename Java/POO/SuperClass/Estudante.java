package POO.SuperClass;

public class Estudante extends Pessoa {
    Mochila mochila = new Mochila();
    String id_estudante;
    Estudante(String nome, int idade, String id_estudante) {
        super(nome, idade);
//      *isso aqui substitui o 'this.nome', por exemplo que ja foi feito na classe pai
        this.id_estudante = id_estudante;
    }
}
