package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad13 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Creo las variables
        int aprob = 0;
        int cond = 0;
        int susp = 0;
        
        //Planteo el bucle for
        for(int i = 0; i <= 6; i++){
            //Pido al usuario que introduzca una nota
            System.out.println("Introduzca la nota del 1 al 10:");
            int n = sc.nextInt();
            
            //Pleo los if para sumar al contador dependiendo de si la nota es aprobada, condicionada o suspensa
            if(n > 4){
                //Sumo al contador de aprobados
                aprob++;
            }else if(n == 4){
                //Sumo al contador de condicionados
                cond++;
            }else{
                //Sumo al contador de suspensos
                susp++;
            }
        }
        //Muestro por pantalla los resultados
        System.out.println("Hay " + aprob + " aprobados");
        System.out.println("Hay " + cond + " condicionados");
        System.out.println("Hay " + susp + " suspensos");
    }
}
