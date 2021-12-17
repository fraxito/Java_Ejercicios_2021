package ejerciciosjava;
/**
 *
 * @author Jorge Cisneros
 */
public class EjerciciosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //si es fin de semana da igual cuantas bellotas haya
        if (finDeSemana){
            return true;
        }
        //si hay entre 40 y 60 bellotas, exito
        if (40 <= numBellotas  && numBellotas <= 60){
            return true;
        }
        return false;
    }
 
    public static void main(String[] args) {
       EjerciciosJava ejercicio = new EjerciciosJava();
       System.out.println("Ejercicio 01: ARDILLAS");
       System.out.println("30 , false: "+ ejercicio.fiestaArdillas(30, false) );
       System.out.println("50 , false: "+ ejercicio.fiestaArdillas(50, false) );
       System.out.println("70 , true: "+ ejercicio.fiestaArdillas(70, true) );
    }
    
}
