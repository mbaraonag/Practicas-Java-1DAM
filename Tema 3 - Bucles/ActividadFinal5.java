package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadFinal5 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Pido el número de filas
        System.out.println("Introduce el número de filas que desea:");
        int n = sc.nextInt();
        
        //Bucle for que rrecorre de 0 a n
        for(int fila = 0; fila <= n; fila++){
            
            //Bucle interno que recorre cada m de la fila actual
            for (int m = 0; m <= fila; m++){
                //Calculo la fila factorial
                int factFila = 1;
                for(int i = 1; i <= fila; i++){
                    factFila = factFila * i;
                }
                
                //Calculo el factorial de m
                int factM = 1;
                for(int i = 1; i <= m; i++){
                    factM = factM * i;
                }
                
                //Calculo la fila - m
                int factResta = 1;
                for(int i = 1; i <= (fila - m); i++){
                    factResta = factResta * i;
                }
                
                //Aplico la formula
                int resultado = factFila / (factM * factResta);
                
                //Imprimo el resultado con un espacio y sin saltar de linea
                System.out.print(resultado + " ");
            }
            //Imprimo un salto de línea al terminar la fila
            System.out.println("");
        }
    }
}
