import java.util.Scanner;

public class Challenge1 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        int respuesta1 = 0 ;
        int respuesta2 = 0 ;
        System.out.println("¿Cuales son los colores de la bandera de Senegal?");
        System.out.println("Elija una opcion: ");
        System.out.println("1: azul, rojo y blanco");
        System.out.println("2: rojo, verde y blanco");
        System.out.println("3: verde, amarillo y rojo");

        while(respuesta1!=3){

            respuesta1 = entrada.nextInt();
            if(respuesta1==3){
                System.out.println("Respuesta correcta. Verificaremos tu conocimiento no te asustes...");
                System.out.println("la division de los colores es de manera : ");
                System.out.println("1: horizontal");
                System.out.println("2: vertical");
                respuesta2 = entrada.nextInt();
            }else {
                System.out.println("quiza se equivoco al marcar intente nuevamente");
            }

        }

        if(respuesta2==2){
            System.out.println("Felcidades tu respuesta es correcta...");
        }else {
            System.out.println("lo sentimos pero no completaste de manera correcta");
        }
    }
}
