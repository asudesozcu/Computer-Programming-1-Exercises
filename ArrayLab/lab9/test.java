/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;

import java.util.Arrays;

/**
 *
 * @author sozcu
 */
public class test {

    int total;
    int av;

    public int avarageodd(int[] array) {
        total = 0;
        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 1) {
                total += array[i];
            }
            av = total / (array.length / 2);
        }
        return av;
    }

    int Biggestelement(int[] array) {
        int biggest = 0;
        int a = 0;
        while (a < array.length) {
            if (a % 2 == 1);
            {
                biggest = array[a];
            }
            a++;
        }
        return biggest;

    }

    int smallestodd(int[] array) {
        int smallest = 0;
        for (int i = array[array.length - 1]; i > 6; i--) {
            if (i % 2 == 1) {
                smallest = array[i];
            }

        }
        return smallest;

    }

    int sum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];

        }
        return total;
    }

    int ex5(int[] array) {
        int biggest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 49) {
                biggest = array[i];
            }
        }
        System.out.println(biggest);
        return biggest;

    }

    int ex6(int[] array) {
int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    count++;
                }
             
            }
        }return count;
    }
    
    int ex7(int []array){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]!=array[j]){
                    count++;
                }
            }break;
        }return count;
    }
    
    
    int ex8 (int[]array){
        int difference=0;
        for (int i = 0; i < array.length && i>=0; i++) {
            int j=array.length-i-1;
           if(j<array.length && j>=0){
               difference=(array[i]-array[j]);
                System.out.println(array[i]+" ve"+array[j]+"arasındaki fark = "+difference );
       }  
            }   return difference  ;
        }
    
    int recapdemo(int... array){
        int sonuc=0;
        for (int i = 0; i <array.length ; i++) {
            sonuc+=array[i];
            
            
        }
        System.out.println(sonuc);
        return sonuc;
    }
    }

