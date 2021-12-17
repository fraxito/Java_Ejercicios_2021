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
 
    /**
     * 
     * @param velocidad valores entre 60 y 80
     * @param birthday indica si es tu cumpleaños
     * @return  se devuelve un valor 0 1 o 2 dependiendo de tu velocidad 
     * y de si es tu cumpleaños o no < >
     */
    public int multa (int velocidad, boolean birthday){
        if (birthday){
            //velocidad = velocidad -5;
            velocidad -= 5; //si es mi cumple, me quitan 5 de la velocidad
        }
        if (velocidad <= 60){ //si va a menos de 60, no hay multa
            return 0;
        }
        if (60 < velocidad && velocidad <= 80){ //si va entre 60 y 80, multa pequeña
            return 1; //multa pequeña
        }
        return 2;
    }
    
    public boolean muyVanidoso(int numero){
        if (numero % 11 < 2){
            return true;
        }
        return false;
    }
       //ejercicio 04
    public boolean contesta ( boolean matinal, boolean madre, boolean dormido){
        if (dormido){
            return false;
        }
        if (matinal && madre){
            return true;
        }
        if (matinal){
            return false;
        }
        return true;
        
        /*   otra solución más corta
        if (dormido){
            return false;
        }
        if (matinal && !madre){
            return false;
        }
        return true;
        */
    }
    
    
    public boolean menorPor10 (int a, int b, int c){
        if (Math.abs(a-b) >= 10  || Math.abs(a-c) >= 10 || Math.abs(b-c) >= 10 ){
            return true;
        }
        return false;
    }
    
    //ejercicio 6
    
    public boolean digitoIgual (int a , int b){
        int aIzq = a / 10;
        int aDer = a % 10;
        int bIzq = b / 10;
        int bDer = b % 10;
        if (aIzq == bIzq  || aIzq == bDer || aDer == bIzq || aDer == bDer){
            return true;
        }
        return false;
    } 
    
    // ejercicio 7
    public boolean multiploMultiple(int numero){
        if (numero % 3 == 0 && numero % 5 == 0){ //el número es múltiplo de 3 Y de 5
            return false;
        }
        if (numero % 3 == 0 || numero % 5 == 0){ //el número es múltiplo de 3 ó
                                                 //de 5 pero no de los dos, porque si fuera de los dos se habría salido ya en el anterior if
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
       EjerciciosJava ejercicio = new EjerciciosJava();
       //test del primer ejercicio
       System.out.println("Ejercicio 01: ARDILLAS");
       System.out.println("30 , false: "+ ejercicio.fiestaArdillas(30, false) );
       System.out.println("50 , false: "+ ejercicio.fiestaArdillas(50, false) );
       System.out.println("70 , true: "+ ejercicio.fiestaArdillas(70, true) );
    
       //test del segundo ejercicio
       System.out.println("Ejercicio 02: multa");
       System.out.println("60 , false: "+ ejercicio.multa(60, false) );
       System.out.println("65 , false: "+ ejercicio.multa(65, false) );
       System.out.println("65 , true: "+ ejercicio.multa(65, true) );
              System.out.println("muyVanidoso (22) " + ejercicio.muyVanidoso(22) );
        System.out.println("muyVanidoso (23) " + ejercicio.muyVanidoso(23) );
        System.out.println("muyVanidoso (24) " + ejercicio.muyVanidoso(24) );
           // testeo el ejercicio 4
        System.out.println("contesta (falso, falso, falso) " + ejercicio.contesta(false, false, false) );
        System.out.println("contesta (falso, falso, true) " + ejercicio.contesta(false, false, true) );
        System.out.println("contesta (true, falso, falso) " + ejercicio.contesta(true, false, false) );
            // testeo el ejercicio 5
        System.out.println("menorPor10 (1, 7, 11) " + ejercicio.menorPor10(1, 7, 11) );
        System.out.println("menorPor10 (1, 7, 10) " + ejercicio.menorPor10(1, 7, 10) );
        System.out.println("menorPor10 (11, 1, 7) " + ejercicio.menorPor10(11, 1, 7) );
            // testeo el ejercicio 6
        System.out.println("digitoIgual (12, 23) " + ejercicio.digitoIgual(12, 23) ); 
        System.out.println("digitoIgual (12, 43) " + ejercicio.digitoIgual(12, 43) );
        System.out.println("digitoIgual (12, 44) " + ejercicio.digitoIgual(12, 44) );
            //testeo el ejercicio 7
        System.out.println("multiploMultiple (3) " + ejercicio.multiploMultiple(3) );     
        System.out.println("multiploMultiple (10) " + ejercicio.multiploMultiple(10) );
        System.out.println("multiploMultiple (15) " + ejercicio.multiploMultiple(15) );
         
    }
    
}
