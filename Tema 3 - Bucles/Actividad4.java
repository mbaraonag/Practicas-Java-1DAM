package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad4 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Creo las variables
        int cm = 0;
        int i = 0;
        int masAlto = 0;
        int etiqueta = 0;
        
        //Planteo el while
        while(cm >= 0){
            
            //Pido al usuario una altura
            System.out.println("Introduce la altura del arbol (" + i + ") en cm: ");
            cm = sc.nextInt();
            
            //Planteo un if para que si la altura introducida es mayor a la guardada
            //anteriormente se guarde
            if(cm > masAlto){
                //Guardo los datos a las variables del más alto
                masAlto = cm;
                etiqueta = i;               
            }
            
            //Sumo uno al contador
            i++;
        }
        //Si el usuario pone un 0 el bucle termina y muestra los mensajes finales por pantalla
        System.out.println("El árbol mas alto mide: " + masAlto);
        System.out.println("La etiqueta del árbol es: " + etiqueta);
    }
}
