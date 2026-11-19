package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadFinal1 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido al usuario que introduzca el número decimal
        System.out.println("Introduzca el decimal:");
        int n = sc.nextInt();
        
        //Muestro un mensaje por pantalla de cual es el resultado
        System.out.println("El decimal pasado a binario es: ");
        
        // Si el número es 0, lo se muestra directamente
        if(n == 0){
            System.out.println(0);
        } else { //Si no es 0 se plantea el paso a binario
            //Creo las variables necesarias
            int binario = 0;
            int multiplicador = 1;
            int copia = n; //Copia para no perder el valor original
            
            //Planteo el bucle para calcular los bits y colocarlos en orden correcto
            do {
                int bit = copia % 2; //Obtengo el resto (0 o 1)
                binario = binario + (bit * multiplicador); //Añado el bit en su posición correspondiente
                copia = copia / 2; //Actualizo el número dividiéndolo entre 2
                multiplicador = multiplicador * 10; //Desplazo la posición para el siguiente
            } while(copia > 0);
            //Muestro el resultado por pantalla
            System.out.println(binario);
        }
    }
}
