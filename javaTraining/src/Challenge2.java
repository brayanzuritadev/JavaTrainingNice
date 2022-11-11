import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las horas de trabajo semanales del empleado");
        int horasTrabjoSemana = entrada.nextInt();

        System.out.println("Ingrese el pago por hora al empleado");
        double salarioHora = entrada.nextDouble();

        System.out.println("Ingrese los dias de vacaciones del empleado");
        int diasVacaciones = entrada.nextInt();

        double salarioAnual = calcularSalarioAnual(horasTrabjoSemana,salarioHora)-calcularVacacionesSalario(diasVacaciones,salarioHora);

        System.out.println("El empleado recibe un salario anual de " + salarioAnual + "bolivianos y tiene " + diasVacaciones + "dias de vacaciones" );

    }

    public static double calcularSalarioAnual(int horasTrabajoSemana,double salarioHora){

        return (365/7)*(horasTrabajoSemana*salarioHora);
    }

    public static double calcularVacacionesSalario(int dias, double salarioHora){
        double SalarioVacacion = dias/7 * salarioHora;
        return SalarioVacacion;
    }
}
