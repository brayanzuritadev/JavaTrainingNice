import java.util.Scanner;
public class HighscholTrainee {
    public static void main(String[] args){

        int studentAge = 17;
        double prom = 7.5;
        char firstInitial = 'B';
        char lastInitial = 'Z';
        boolean attendance = true;

        String studentName = "Carlos Andres";
        String firstname = "Carlos";
        String lastName = "Azcarraga";

        System.out.println("The student Age is: " + studentAge);
        System.out.println("The prom is: " + prom);
        System.out.println("The First Initial is: " + firstInitial);
        System.out.println("The Last Initial is: " + lastInitial);
        System.out.println("The attendance is: " + attendance);
        System.out.println("The student Name is: " + studentName);
        System.out.println("The student First Name is: " + firstname);
        System.out.println("The student Last Name is: " + lastName);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Desea cambiar su apellido y promedio?");
        String respuesta =entrada.nextLine();
        if(respuesta.toUpperCase().equals("SI")){
            System.out.println("Ingrese su promedio:");
            prom=Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese su Apellido:");
            lastName=entrada.nextLine();
        }
        System.out.println("The prom is: " + prom);
        System.out.println("The student Last Name is: " + lastName);
    }
}
