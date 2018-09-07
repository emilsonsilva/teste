
package exerciciocase;

import java.util.Scanner;


public class ExercicioCase {

    public static void main(String[] args) {
       int cod;
       Scanner leia = new Scanner(System.in);
       System.out.println("Digite o código:");
       cod=leia.nextInt();
       switch (cod){
       case 1:
           System.out.println("(ADS-Anfiteatro:");
            break;
        case 2:
            System.out.println("Redes Laboratório 101:");
             break;
        case 3:
            System.out.println("Logística - Sala 305:");
            break;
        default:
            System.out.println("Curso Inexistente:3");
                  
    }
    }
    
}
