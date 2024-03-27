package array;
import java.util.Arrays;
import java.util.Scanner;

public class DoisDArray {
    public static void main(String[] args) {
        String[][] mapaCidades = {
            {"São Paulo", "Rio de Janeiro", "Belo Horizonte"},
            {"Brasilia", "Fortaleza", "Salvador"},
            {"Manaus", "Curitiba", "Goiania"}
        };
        for (int loop = 0; loop < mapaCidades.length; loop++) {
            System.out.println("");
            for (int loop2 = 0; loop2 < mapaCidades[loop].length; loop2++) {
                System.out.print(mapaCidades[loop][loop2] + "   ");
            }
        }
    }
}
