package Actividades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadFinal6 {
    public static void main(String[] args) {
        //Creo el objeto scanner para leer los datos 
        Scanner sc = new Scanner(System.in);
        
        //Declaro las variables
        int opcion = 0;
        int encontrados = 0;
        int capturasTotales = 0;
        int normalesCapturados = 0;
        int singularesCapturados = 0;
        int legendariosCapturados = 0;
        int huidas = 0;
        int probCaptura = 0;
        String tipo = "";
        
        //Muestro el mensaje inicial
        System.out.println("--- BIENVENIDO A LA ZONA SAFARI ---");
        
        do{
            //Genero un numero del 1 al 3 aleatorio para indicar que rareza de pokemon ha aparecido
            int tipoPokemon = (int) (Math.random() * 3) + 1; // Genera 1, 2 o 3
            
            //Sumo uno al contador de encontrados
            encontrados++;
            
            //Planteo el switch para los 3 casos posibles, uno por cada tipo de Pokémon
            switch(tipoPokemon){
                //Si sale un Pokémon Normal
                case 1 ->{
                    //Muestro un mensaje por pantalla para indicar que caso es
                    System.out.println("!Ha aparecido un Pokémon NORMAL¡");
                    
                    //Guardo en la variable tipo que Pokémon aparecio
                    tipo = "Normal";
                    
                    //Creo la variable con la probabilidad de captura del caso 1
                    probCaptura = 60;
                }
                //Si sale un Pokémon Singular
                case 2 ->{
                    //Muestro un mensaje por pantalla para indicar que caso es
                    System.out.println("!Ha aparecido un Pokémon SINGULAR¡");
                    
                    //Guardo en la variable tipo que Pokémon aparecio
                    tipo = "Singular";
                    
                    //Creo la variable con la probabilidad de captura del caso 2
                    probCaptura = 20;
                }
                //Si sale un Pokémon Legendario
                case 3 ->{
                    //Muestro un mensaje por pantalla para indicar que caso es
                    System.out.println("!Ha aparecido un Pokémon LEGENDARIO¡");
                    
                    //Guardo en la variable tipo que Pokémon aparecio
                    tipo = "Legendario";
                    
                    //Creo la variable con la probabilidad de captura del caso 3
                    probCaptura = 5;
                }
            }
            //Pregunto al usuario que es lo que desea hacer
            System.out.println("¿Qué desea hacer?");
            //Muestro por pantalla las opciones
            System.out.println("1. Lanzar safari ball");
            System.out.println("2. Huir");
            System.out.println("3. Salir de la Zona Safari");
            
            //Pido la opcion que quiere
            System.out.println("Opcion:");
            opcion = sc.nextInt();
            
            //Planteo otro switch para las 3 opciones que puede hacer
            switch(opcion){
                //Cuando elige lanzar una safari ball
                case 1 ->{
                    //Creo la variable y le asigno un número aleatorio del 1 al 100 para ver si se captura o no
                    int tirada = (int) (Math.random() * 100) + 1;
                    
                    //Planteo un if-else para ver si se captura
                    if(tirada <= probCaptura){
                        //Sumo 1 a las capturas totales
                        capturasTotales++;
                        
                        //Sumo 1 al contador del tipo concreto que se ha capturado
                        switch(tipoPokemon){
                            case 1 -> normalesCapturados++;
                            case 2 -> singularesCapturados++;
                            case 3 -> legendariosCapturados++;
                        }
                        //Muestro un mensaje de enorabuena
                        System.out.println("Lanzando Safari Ball...");
                        System.out.println("¡ENHORABUENA! Has capturado al Pokémon " + tipo + ".");
                    }
                    //Si el pokemon a huido
                    else{
                        //Muestro por pantalla que el Pokémon ha huido
                        System.out.println("Lanzando Safari Ball...");
                        System.out.println("¡Oh no! La captura ha fallado.");
                        System.out.println("El Pokémon ha huido.");
                    }
                }
                //Si ha elegido huir
                case 2 ->{
                    //Sumo uno al contador de huidas
                    huidas++;
                    
                    //Muestro por pantalla que ha huido
                    System.out.println("Has decidido huir.");
                    System.out.println("Buscando otro Pokémon...");
                }
                //Si ha elegido salir de la Zona Safari
                case 3 ->{
                    //Muestro un mensaje por pantalla para que se sepa que se ha salido de la zona Safari
                    System.out.println("Has abandonado la Zona safari.");
                }
                //Si introduce un número que no tiene opción asignada
                default ->{
                    System.out.println("Opción no válida");
                }
            }
        }while(opcion != 3);
        //Muestro por pantalla los mensajes finales
        System.out.println("----------------------------------------");
        System.out.println("          ESTADÍSTICAS FINALES          ");
        System.out.println("----------------------------------------");
        System.out.println("Pokémon encontrados: " + encontrados);
        System.out.println("Pokémon capturados: " + capturasTotales);
        System.out.println("Normales capturados: " + normalesCapturados);
        System.out.println("Singulares capturados: " + singularesCapturados);
        System.out.println("Legendarios capturados: " + legendariosCapturados);
        System.out.println("Huidas realizadas: " + huidas);
        System.out.println("----------------------------------------");
    }
}