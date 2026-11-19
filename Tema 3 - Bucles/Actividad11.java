package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad11 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario un número
        System.out.println("Introduce un numero:");
        int n = sc.nextInt();
        
        //Creo una variable para el resultado y le guardo el valor de n
        int resultado = n;
        
        //Planteo el bucle con un contador que decrece a 0
        for(int i = n - 1; i >= 1; i--){
            //Multiplico el numero por el siguiente
            resultado = resultado * i;    
        }
        //Muestro el resultado por pantalla
        System.out.println("El resultado de el factorial de " + n + " es: " + resultado);
    }
}
