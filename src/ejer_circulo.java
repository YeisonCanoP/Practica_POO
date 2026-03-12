import Utils.MathUtils;



void main() {

    int radio = 20;


    //calculo el area del circulo
    double area = MathUtils.calcular_area_circulo(radio);

    //calcular longitud del circulo
    double longitud = MathUtils.calcular_longitud_circulo(radio);

    System.out.println("El area del circulo es: " + area);
    System.out.println("La longitud del circulo es: " + longitud);
}