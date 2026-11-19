package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadFinal4 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Creo una variable para contar los primos
        int contadorPrimos = 0;
        
        //Pido al usuario un numero
        System.out.println("Introduce un número");
        int n = sc.nextInt();
        
        //Planteo el bucle externo for para recorrer los números de 1 a n
        for(int i = 1; i <= n; i++){
            
            //Creo las variables
            int div = 0;
            
            //Bucle interno para contar los divisores que tiene el número actual del vucle externo
            for(int j = 1; j <= i; j++){
            
                //Compruebo si el la j es divisor del numero
                if(i % j == 0){
                    div++;
                }
            }
            if(div <= 2){
                //Aumento en uno el contador de primos
                contadorPrimos++;
            }
        }
        //Muestro por pantalla el mensaje final con los resultados
        System.out.println("Resultan un total de: "+contadorPrimos+" números primos");
    }
}
