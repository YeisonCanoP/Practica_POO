package Utils;


public class MathUtils {

    //Function calcular la edad de albert
    public static int calcular_edad_albert( int edjuan) {
      return (2 * edjuan) / 3;
    };

    //Funcion para calcular la edad de ana
    public static int calcular_edad_ana(int edjuan) {
      return (4 * edjuan) / 3;
    };

    //Funcion apra caluclar la edad de la mama
    public static int calcular_edad_mama(int edjuan, int edalber, int edana) {
        return edjuan + edalber + edana;
    }
    //Funcion para calcular el area de un circulo
    public static double calcular_area_circulo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    };

    //Funcion para calcular la longitud de un circulo
    public static double calcular_longitud_circulo(double radio) {
        return 2 * Math.PI * radio;
    };
}
