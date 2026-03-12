import Utils.Operation;


void main() {

    double suma = 0;
    double x = 20;

    //Parte 1
    suma = Operation.calcular_suma(suma, x);
    System.out.println("Resultado de la operacion de la parte 1: " + suma);

    //Parte 2
    double y = 40;
    x = Operation.calcular_suma(x,Math.pow(y,2));
    System.out.println("Resultado de la operacion de la parte 2: " + x);

    //Parte 3
    suma = Operation.calcular_suma(suma,(x/y));
    System.out.println("El valor de la suma es :" + suma);
}