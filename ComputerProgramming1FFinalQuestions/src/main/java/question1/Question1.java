/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package question1;

/**
 *
 * @author sozcu
 */
public class Question1 {

    public static void main(String[] args) {
        //QUESTON1A
        int number = 101;
        while (number < 300) {
            System.out.print(number+" ");
            number += 2;
        }
        System.out.println("");

//QUESTION1B
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            if (i != 20 && i != 21 && i != 22) {
                sum +=i;
            }
          
        } // System.out.println("The sum of the elements is:"+ sum);   
        
        //QUESTION1C
        int rows = 6; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2*(rows - i); j++) {
                System.out.print("*");
            }

            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            

            for (int j = 1; j <= 2*(rows - i); j++) {
                System.out.print("*");
            }

            System.out.println(); 
            
        }
    }
}
