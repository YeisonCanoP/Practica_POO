import Utils.Operation;


void main() {

    int hours = 48;
    double precio_hora  = 5.000;
    double retencion = 0.125;

    //Calculo el sueldo bruto
    double bruto = Operation.calcular_sueldo_bruto(hours, precio_hora);

    //Calculo de la retencion
    double total_retencion = Operation.calcular_retencion(bruto, retencion);

    //Calculo del salario
    double neto = Operation.calcular_sueldo_neto(bruto, total_retencion);

    System.out.println("El sueldo bruto del empleado es: " + bruto);
    System.out.println("La retencion del empleado es: " + total_retencion);
    System.out.println("El sueldo neto del empleado es: " + neto);
}