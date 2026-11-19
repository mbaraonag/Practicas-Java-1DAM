package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad12 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        boolean suspenso = false;
        
        //Planteo el bucle for
        for(int i = 0; i <= 5; i++){
            //Pido al usuario que introduzca una nota
            System.out.println("Introduzca la nota del 1 al 10:");
            int n = sc.nextInt();
            
            if(n <= 4){
                suspenso = true;
            }
        }
        if(suspenso == true){
            //Muestro el mensaje de que hay un suspenso
            System.out.println("Hay alumnos suspensos");
        }
    }
}
