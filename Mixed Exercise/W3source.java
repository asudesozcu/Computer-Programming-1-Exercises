/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.w3source;

/**
 *
 * @author sozcu
 */
public class W3source {

    public static void main(String[] args) {
        int count=4;
        for (int i = 1; i <=16 ; i*=2) {
            System.out.print(i+" ");
            for (int j = 1; j <= i-j; j++) {
                System.out.print(count+" ");
                count=count+2;
            }System.out.println("");
        }
        
        int a=11;
        int b=12;
        int c=13;
        int d=06;
        int difhour;
       int difmin;
        {
            if(d<b){
              
               c=c-1;
            }
            difmin=d+60-b;
           
        }
        
        {
            difhour=c-a;
            
        }
        
        System.out.println(a+":"+b+","+c+":"+d+"should return "+difhour+"hours and"+difmin+"minutes");
        
        
        int y = 5;
      int x = 1;
      int z = 0;

      while (z < 12) {
          if (x >= (y >> 1)) {
              System.out.println("x: " + x + " y: " + y + " z: " + z);
          }
          z = (3 * x++) + y--;
      }
      System.out.println("x: " + x + " y: " + y + " z: " + z);
        
        
        
        
        
        
    }   
}