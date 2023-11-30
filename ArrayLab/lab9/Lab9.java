/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab9;



/**
 *
 * @author sozcu
 */
public class Lab9 {

    public static void main(String[] args) {
        int array[]=new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
           }
        
        test obj= new test();
        System.out.println(obj.avarageodd(array));
        System.out.println(obj.Biggestelement(array));
        System.out.println(obj.smallestodd(array));
        System.out.println(obj.sum(array));
        obj.ex5(array);
      array[0]=array[4];
        System.out.println(obj.ex6(array));
        System.out.println(obj.ex7(array));
obj.ex8(array);
        obj.recapdemo(array);
        
        
        
    }
}
