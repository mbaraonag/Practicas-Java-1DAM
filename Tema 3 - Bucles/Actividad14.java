package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad14 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Creo las variable      
        int div = 0;
        
        //Pido al usuario que introduzca un nÃºmero
        System.out.println("Introduzca un número:");
        int n = sc.nextInt();
        
        //Planteo el bucle for para comprobar si el número es primo
        for(int i = 1; i <= n; i++){
            //Compruebo si el la i es divisor del numero
            if(n % i == 0){
                div++;
            }
        }
        if(div == 2){
            //Muestro que el número es primo
            System.out.println("El número es primo");
        }else{
            //Muestro que el número no es primo
            System.out.println("El númeor no es primo");
        }
    }
}