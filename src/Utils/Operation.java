package Utils;

public class Operation {

    //Metodo para calcular la suma de dos numeros
    public static double calcular_suma (double a, double b) {
      return a + b;
    }

    //Metodo para calculcar el salaio bruto seugno precio hora y las horas trabajadas
    public static double calcular_sueldo_bruto (int hours, double precio_hora) {
        return hours * precio_hora;
    }

    //Metodo para calcular la retencion de un sueldo bruto
    public static double calcular_retencion (double bruto, double retencion) {
        return bruto * retencion;
    }

    //Metodo para calcucar el salario neto de un empleado
    public static double calcular_sueldo_neto (double bruto, double retencion) {
        return bruto - retencion;
    }
}
