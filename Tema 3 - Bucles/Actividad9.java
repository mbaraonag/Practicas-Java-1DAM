package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad9 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
         
        //Creo las variables necesarias
        int n = 0;
        int resultado = 0;
        //Planteo el do while para asegurarme que el usuario introduzca el numero correcto
        do{
            
            //Pido al usuario un número entre 1 y 10
            System.out.println("Introduzca un numero entre 1 y 10");
            n = sc.nextInt();
            
        }while(n < 1 || n > 10);
        
        //Planteo el bucle for para hacer la tabla del número
        for(int i = 1; i <= 10; i++){
            //Multiplico el n por el contador
            resultado = n * i;
            //Muestro por pantalla la tabla
            System.out.println(n + " x " + i + " = " + resultado);
        }
    }
}
