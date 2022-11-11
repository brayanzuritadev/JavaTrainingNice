import java.util.Scanner;

public class FinalTest {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.println("Ingrese la nota del estudiante");

        nota = entrada.nextDouble();

        if( nota > 70 ) {
            System.out.println("Aprobaste... tu nota es: " + nota);
        }else {
            System.out.println("No lograste aprobar...");
        }
    }
}
