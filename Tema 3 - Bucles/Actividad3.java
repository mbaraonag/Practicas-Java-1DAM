package Actividades;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        
        //Creo el objeto escaner para leer los datos
        Scanner sc = new Scanner(System.in);
        
        //Creo la variable del numero secreto y el que introducira el usuario, ademas le asigno un nº aleatorio al secreto
        int numeroSecreto = (int) (Math.random() * 100 + 1);
        int numeroUsuario = 0;
        
        //Muestro por pantalla las instrucciones del juego
        System.out.println("He pensado un número entre 1 y 100");
        System.out.println("¡Intenta adivinarlo! (O introduce un negativo para salir)");

        //Planteo el bucle con dos condiciones, una para que funcione mientras el numero sea diferente y la otra con un and para que ademas sea positivo
        while (numeroUsuario != numeroSecreto && numeroUsuario >= 0) {
            
            //Pido al usuario un número
            System.out.print("Introduce un numero: ");
            numeroUsuario = sc.nextInt();
            
            //Primero compruebo si se ha rendido
            if (numeroUsuario < 0) {
                System.out.println("Te has rendido. El numero secreto era: " + numeroSecreto);
                
            //Si no se ha rendido, compruebo los posibles casos normales
            } else if (numeroUsuario < numeroSecreto) {
                //Muestro por pantalla que el nº secreto es mayor
                System.out.println("El numero secreto es mayor.");
                
            } else if (numeroUsuario > numeroSecreto) { 
                //Muestro por pantalla que el nº secreto es menor
                System.out.println("El numero secreto es menor.");
                
            } else {
                //Muestro por pantalla que a hacertado 
                System.out.println("¡Has acertado!");
            }
        }
    }
}