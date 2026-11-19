package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadFinal2 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario que introduzca el número binario
        System.out.println("Introduzca el número binario (Solo puedes poner 1 y 0):");
        int binario = sc.nextInt();
        
        //Creo las variables necesarias
        int decimal = 0;
        int base = 1; //Representa el 2^0 al empezar
        int copia = binario; //Copia para no perder el valor original
        
        //Planteo el bucle para extraer cada dígito de derecha a izquierda
        while (copia > 0) {
            //Extraigo el último dígito de la derecha
            int ultimoDigito = copia % 10; 
            
            //Multiplico el dígito por su valor posicional y lo acumulamos
            decimal = decimal + (ultimoDigito * base);
            
            //Elimino el último dígito del número
            copia = copia / 10;
            
            //Duplico la base para la siguiente posición
            base = base * 2;    
        }        
        // Muestro el resultado por pantalla
        System.out.println("El binario " + binario + " en decimal es: " + decimal);
    }
}
