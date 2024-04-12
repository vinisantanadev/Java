package permissoes.permissoes1;
import permissoes.permissoes2.*;
// !isso é importante para herdar os atributos da MainA, que está em outro pacote
import java.util.*;
// ------------------------------------- //
public class MainA {
    public static void main(String[] args) {
        FilhaMainA filhaMainA = new FilhaMainA();
//      !muito foda...importando uma classe de outro pacote a gente pode criar uma instancia dela
        System.out.printf("""

                %s

        """, filhaMainA.mensagemPublica);
    }
}
