package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad6 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario el número max que contara el for
        System.out.println("Introduce el numero hasta el que se contra");
        int n = sc.nextInt();
        
        //Planteo el bucle for
        for(int i = 1; i <= n; i++){
            //Muestro el resultado por pantalla
            System.out.println(i);
        }
    }
}
