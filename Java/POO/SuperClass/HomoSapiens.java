package POO.SuperClass;

public abstract class HomoSapiens {
// apenas para aprender sobre a keyword abstract
// utilizamos, principalmente como boa pratica, pra falar que é um classe abstrata
// assim não será possível criar uma instancia dessa classe, apenas atributos e métodos para herança

// por exemplo, ninguém chega em uma loja de carros e pede pro atendente que quer comprar um veículo
// isso é muito abstrato, o vendedor provavelmente perguntaria o tipo de veículo
    abstract void pensar();
//  isso te impede de criar um corpo pra esse método nessa classe
//  então para adicionar atributos à esse método,
//  deve-se criar um método construtor em outra classe filha
//  !importante: isso força a criar uma instancia do método na classe filha
//  !com o @Override uma linha acima
}
