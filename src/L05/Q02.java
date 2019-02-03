package L05;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class Q02 {
    public static void main(String[] args){
        String nextStudent;
        int studentA = 0, studentB = 0, studentC = 0, totalStudent = 0, console = 0;
        
        do{
            
            System.out.print("Quantas refeições você fez no mes anterior ? ");
            Scanner keyboard = new Scanner(System.in);
            console = keyboard.nextInt();
            
            if( console < 10 ){
                studentA++;
            }else if ( console > 10 && console < 20 ){
                studentB++;
            }else {
                studentC++;
            }
            
            totalStudent++;
            
            System.out.println("Deseja entrevistar mais um estudante ?  Sim / Não ");
            Scanner a = new Scanner(System.in);
            nextStudent = a.nextLine();
            
        }while( nextStudent.equalsIgnoreCase("sim") );
        
        
        System.out.println("Total de estudantes estrevistados: " + totalStudent);
        System.out.println("Estudantes do tipo A: " + studentA);
        System.out.println("Estudantes do tipo B: " + studentB);
        System.out.println("Estudantes do tipo C: " + studentC);
        
    }
}
