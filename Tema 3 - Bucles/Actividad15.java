package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad15 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
       //Creo la variable constante
       final int PERSONAS = 10;
       final int AFORO = 5;
       
       //Creo las variables necesarias
       int admitidas = 0;
       int comprobadas = 0;
       int menores = 0;
       
       
       for(int i = 1; i <= 10; i++){
           //Pido la edad
           System.out.println("Introduzca la edad: ");
           int edad = sc.nextInt();
           
           //Si admitidas es menor que el aforo
           if(admitidas < AFORO){
                //Si es menor
                if(edad < 18){
                //Muestro mensaje por pantalla
                    System.out.println("Es menor de edad, no puede pasar");
                    //Sumo uno al contador de menores
                    menores++;
                    //Sumo uno al contador de comprobadas
                    comprobadas++;
                    continue;
                    //Si tiene 18 o más
                }else{ 
                    //Muestro por pantalla que tiene permitido el acceso
                    System.out.println("Puede pasar");
                    //Sumo uno al contador de admitidas
                    admitidas++;
                    //Sumo uno al contador de comprobadas
                    comprobadas++;
                    continue;
                }
            //Si ha llegado al aforo máximo
           }else{
                //Muestro por pantalla que ha llegado al máximo de aforo
                System.out.println("¡AFORO COMPLETO!");
                //Uso el break para cortar el bucle 
                break; 
           }
       }
       //Cuando finaliza el bucle muestro los resultados por pantalla
        System.out.println("Personas comprobadas: " + comprobadas);
        System.out.println("Menores de edad: " + menores);
        System.out.println("Personas admitidas: " + admitidas);
    }
}
