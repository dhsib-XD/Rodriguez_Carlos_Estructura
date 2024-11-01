
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CarlosXl
 */
public class Rodriguez_Carlos_Piedra{
     
    public static void main(String[] args) {
        
        Random random = new Random();{
        Scanner scanner = new Scanner (System.in);
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        
        System.out.println("Favor ingrese una opcion:");
        System.out.println("Piedra = 0");
        System.out.println("Papel = 1");
        System.out.println("Tijeras = 2");
        System.out.println("Su eleccion es:");
        int eleccion = scanner.nextInt();
        
        if (eleccion < 0 || eleccion > 2) {
            System.out.println("Error....Opcion invalida....Pruebe nuevamente....");
             
        }else{
            String Usuario = opciones[eleccion];
            int cpu = random.nextInt(3);
            String cpue = opciones[cpu];
            
            System.out.println("Tu eleccion es: " + Usuario );
            System.out.println("La elecion de la cpu es: " + cpue );
            
            if (Usuario.equals(cpue)) {
                System.out.println("Es un empate");
            } else if ((eleccion == 0 && cpu == 2) || 
                       (eleccion == 1 && cpu == 0) || 
                       (eleccion == 2 && cpu == 1)) { 
                System.out.println("Ganaste");
            } else {
                System.out.println("La CPU gana. Suerte para la proxima");
            }
            
        }
        
           
        }
            
            
}
        }
    

