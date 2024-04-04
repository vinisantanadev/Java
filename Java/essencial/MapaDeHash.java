package essencial;
import java.util.HashMap;

public class MapaDeHash {
    public static void main(String args[]) {
        HashMap<String, Double> lista_de_planetas = new HashMap<String, Double>();
//      o ato de colocar tipos primitivos capitulados (primeira letra em maíusculo),
//      é chamado de Wrapper Class, o que significa que o tipo primitivo foi transformado em objeto
//      a 'String', por exemplo, é um array de 'chars', é um objeto.
        lista_de_planetas.put("mercurio", 0.055);
        lista_de_planetas.put("venus", 0.815);
        lista_de_planetas.put("terra", 1.000);
        lista_de_planetas.put("marte", 0.107);
        lista_de_planetas.put("jupiter", 317.800);
        lista_de_planetas.put("saturno", 95.152);
        lista_de_planetas.put("urano", 14.536);
        lista_de_planetas.put("netuno", 17.147);
        lista_de_planetas.put("ceres", 0.000);
        lista_de_planetas.put("plutao", 0.002);
        lista_de_planetas.put("haumea", 0.000);
        lista_de_planetas.put("makemake", 0.000);
        lista_de_planetas.put("eris", 0.000);
//      hashmap.replace(); para substituir valor de uma chave
//      hashmap.containsKey() para retornar sem existe tal valor no hashmap

        System.out.println("""
                
                planeta, massa em relação à terra:
                """);
        for (String cada_planeta : lista_de_planetas.keySet()) {
//            System.out.print(i + ", ");
//            System.out.println(lista_de_planetas.get(i) + "M");
            System.out.printf("""

                %s, \t%.3fM
            """, cada_planeta, lista_de_planetas.get(cada_planeta));
        } // ! o '\t' é pra formatar o texto e ficar tudo retinho bonitinho 🥰
        for (int loop = 0; loop < 43; loop++) {
            System.out.print('-');
        }
    }
}
