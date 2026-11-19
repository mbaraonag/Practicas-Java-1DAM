package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad5 {
    public static void main(String[] args) {
        
        //Creo el objeto escaner para leer los datos
        Scanner sc = new Scanner(System.in);
        
        //Creo las variables 
        int nUsuario = 0;
        int aciertos = 0; 
        int nAleatorio1;
        int nAleatorio2;
        int suma;
        
        do{
            //Asigno los números aleatorios
            nAleatorio1 = (int) (Math.random() * 100 + 1);
            nAleatorio2 = (int) (Math.random() * 100 + 1);
           
            //Verifico la suma
            suma = nAleatorio1 + nAleatorio2;
            
            //Muesto los numeros generados
            System.out.println("El primer numero es:"+ nAleatorio1);
            System.out.println("El primer numero es:"+ nAleatorio2);
            
            //Digo al usuario que itroduzca su resultado
            System.out.println("Introduzca el resultado de la suma de "+ nAleatorio1 + "+" + nAleatorio2 + " :");
            nUsuario = sc.nextInt();
            
            //Sumo al contador de sumas acertadas
            aciertos++;
            
        }while(nUsuario == suma);
        
        //Muestro por pantalla cuantas sumas hizo bien 
        System.out.println("Has hacertado: " + aciertos + " sumas");
    }
}
