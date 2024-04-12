package permissoes.permissoes2;
import permissoes.permissoes1.*;
// !isso é importante para herdar os atributos da MainA, que está em outro pacote
import java.util.*;

public class FilhaMainA {
    static public String mensagemPublica = "Essa é uma mensagem pública";
//  nós estamos tentando printar essa mensagem a partir da classe MainA,
//  mas quando a varíavel está em um pacote diferente, mesmo após importar,
//  e mesmo a classe sendo pública
//  !é necessário declarar que a variável é publica também.
//  niveis de acesso à variáveis públicas:
//      class: Y | package: Y | subclass: Y | world: Y;
//  outras permissões:
    static protected String mensagemProtegida = "Esta mensagem é protegida";
//  niveis de acesso à variáveis protegidas:
//      class: Y | package: Y | subclass: Y | world: N;
/*  no modifier */ static String mensagemSemModificacao = "Esta mensagem não tem nível de acesso especificado";
//  niveis de acesso à variáveis protegidas:
//      class: Y | package: Y | subclass: N | world: N;
    static private String mensagemPrivada = "Esta mensagem é privada";
//  niveis de acesso à variáveis protegidas:
//      class: Y | package: N | subclass: N | world: N;
// -------------------------------------------- //
    public static void main(String[] args) {
        System.out.printf("""

            %s
            %s
            %s
            %s

                """, mensagemPublica, mensagemProtegida, mensagemSemModificacao, mensagemPrivada);
    }
}
