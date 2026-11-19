package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad2 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Introduzca un numero
        System.out.println("Introduzca una edad:");
        int edad = sc.nextInt();
        
        //Variables
        int suma = 0;
        double media = 0;
        int total = 0;
        int mayores = 0;
        
        //Planteo el bucle
        while(edad >= 0){
            
            //Sumo la edad
            suma = suma + edad;
            
            //Cuento el total de alumnos
            total++;
            
            //Cuento los mayores de edad
            if(edad >= 18){
                mayores++;
            }
            
            //Pregunto si quiere introducir otro número o terminar
            System.out.println("Introduce otro numero o INTRODUCE UN NEGATIVO PARA TERMINAR");
            edad = sc.nextInt();
        }
        //Calculo la media
        media = suma / total;
        
        //Muestro por pantalla los resultados finales
        System.out.println("Suma de todas las edades: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Numero total de alumnos: " + total);
        System.out.println("Mayores de edad: " + mayores);
        
    }
}
