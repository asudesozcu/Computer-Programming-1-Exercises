/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.finalw;

/**
 *
 * @author sozcu
 */
public class Finalw {

    public static double calculate(int []arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arrays = new int[3];
        arrays[0]=323;
        arrays[1]=64;
        
        System.out.println(arrays.length);
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println(calculate(arrays)/arrays.length);
    }
}
