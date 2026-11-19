package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadFinal3 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número natural: ");
        int numero = sc.nextInt();
        
        if (numero < 0) {
            System.out.println("El número debe ser natural (0 o positivo).");
        } else {
            int i = 1;

            //Pruebo potencias al cuadrado, hasta pasarme
            while ((i * i) <= numero) {
                i++;
            }

            //Como el bucle termina cuando i*i supera al número, el valor válido es el anterior
            int raiz = i - 1;
            int resto = numero - (raiz * raiz);
            
            //Si el resto es 0, muestro la raiz cuadrada exacta, sino  muestro la raiz con el resto
            if (resto == 0) {
                System.out.println("La raíz cuadrada exacta de " + numero + " es " + raiz + ".");
            } else {
                System.out.println("La raíz cuadrada de " + numero + " es " + raiz + " con un resto de " + resto + ".");
            }
        }
    }
}
