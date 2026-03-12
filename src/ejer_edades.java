//Importo la libreria de math utils
import Utils.MathUtils;


public class ejer_edades {

    static void main(String[] args) {
        int edjuan = 9;
        int edalber, edana, edmama;

        //Calculo la edad de edalber
        edalber = MathUtils.calcular_edad_albert(edjuan);

        //Calculo la edad de ana
        edana = MathUtils.calcular_edad_ana(edjuan);

        //Calculo la edad de mama
        edmama = MathUtils.calcular_edad_mama(edjuan, edalber, edana);

        //Ahora se imprime las edades

        System.out.println("Edajuan = "+ edjuan);
        System.out.println("EdAna = "+ edana);
        System.out.println("EdAlber = "+ edalber);
        System.out.println("Edmama = " + edmama);

    }
}
