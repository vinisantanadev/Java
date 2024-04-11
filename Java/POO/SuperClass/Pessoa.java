package POO.SuperClass;

public class Pessoa extends HomoSapiens {
    String nome;
    int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    void pensar() {
        
    };
}
