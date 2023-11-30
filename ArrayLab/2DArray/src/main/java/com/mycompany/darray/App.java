/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.darray;

/**
 *
 * @author sozcu
 */
public class App {

    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {10, 11, 12}};
        
        App object = new App();
        System.out.println(object.calculate(array));
    }
    
    
    

    int calculate(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }

        }
        return total;

    }
}
