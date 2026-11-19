package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad10 {
    public static void main(String[] args) {
        
        //Creo la variable
        int n = 1;
        
        //Planteo el bucle for 
        for(int i = 1; i <= 10; i++){
            //Muestro por pantalla el número
            System.out.println(n);
            //Calculo el siguiente numero impar
            n = n + 2;
        }
    }
}