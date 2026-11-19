package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad1 {
    public static void main(String[] args) {
        
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Introduzca un numero
        System.out.println("Introduzca un numero:");
        int n = sc.nextInt();
        
        //Variables
        boolean par, positivo;
        int cuadrado;
        
        //Planteo el bucle
        while(n != 0){
            //Pirmero veo si es par o impar
            if(n % 2 == 0){
                par = true;
            }else{
                par = false; 
            }
            
            //Ahora miro si es positivo o negativo
            if(n > 0){
                positivo = true;
            }else{
                positivo = false;
            }
            
            //Calculo el cuadrado
            cuadrado = n * n;
            
            //Muestro por pantalla los resultados finales
            System.out.println("¿Es par? " + par);
            System.out.println("¿Es positivo? " + positivo);
            System.out.println("Cuadrado: " + cuadrado);
            
            //Pregunto si quiere poner otro numero o terminar
            System.out.println("Si quieres volver con otro numero introducelo, si quieres terminar INTRODUCE UN 0");
            n = sc.nextInt();
        }
    }
}
