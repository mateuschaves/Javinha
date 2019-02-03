
package L05;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String name = keyboard.nextLine();
        System.out.println("Informe sua senha: ");
        String password = keyboard.nextLine();
        
        
        while( password.equalsIgnoreCase(name) ){
            System.out.println("\nSua senha não pode ser igual ao nome !\n");
            
            System.out.println("Informe seu nome: ");
            name = keyboard.nextLine();
            
            System.out.println("Informe sua senha: ");
            password = keyboard.nextLine();
        }
    }
    
}
