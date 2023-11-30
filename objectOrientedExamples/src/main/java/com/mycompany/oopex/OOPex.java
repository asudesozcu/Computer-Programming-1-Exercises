/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.oopex;

import java.util.ArrayList;

/**
 *
 * @author sozcu
 */
public class OOPex {

    public static void main(String[] args) {
   int array[] = new int [3];
   ArrayList mylist = new ArrayList();
   mylist.add("Asude Sözcü");
   mylist.add("Şevval Cücük");
   
        System.out.println(mylist.size());
        System.out.println(mylist);
        mylist.remove("Şevval Cücük");
        System.out.println(mylist);
        
        
        ArrayList <String> countries= new ArrayList <>();// ArrayList <String> countries= new ArrayList <String>();

       countries.add("Türkiye");
       countries.add("Amerika");
       countries.add("Türkiye");
        System.out.println(countries);
        System.out.println(countries.get(1));
        
        
        
    }
}
