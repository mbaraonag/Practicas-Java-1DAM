package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad8 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Creo una variable para la suma y la media
        int suma = 0;
        double media;
        
        //Planteo el bucle for para pedir los números y ir sumandolos
        for(int i = 1; i <= 10; i++){
            //Pido al usuario que introduzca un número
            System.out.println("Introduzca un numero:");
            int n = sc.nextInt();
            
            //Lo sumo al total
            suma = suma + n;
        }
        //Calculo la media
        media = suma / 10;
        
        //Muestro por pantalla la media
        System.out.println("La media es de: " + media);
    }
}