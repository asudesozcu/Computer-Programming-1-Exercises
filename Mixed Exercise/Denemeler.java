/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.denemeler;

/**
 *
 * @author sozcu
 */
public class Denemeler {

    public static void main(String[] args) {
        int r = 1898;
        double pı = 3.14;
        System.out.println(r * r * pı);
        System.out.println(2 * r * pı);

        int a = 95, b = 100, c = 250;
        double areatrıangle = a * b;
        System.out.println(areatrıangle);
        System.out.println(2 * (a + b));
        //find the max
        int enb = a;
        if (enb < b) {
            enb = b;
        }
        if (enb < c) {
            enb = c;
        }
        System.out.println(enb);
        // swap variables
        int k = 81;
        int m = 32;
        System.out.println("k=" + m);
        System.out.println("m=" + k);
        //swap variables 2. way
        k = k + m;
        m = k - m;
        k = k - m;
        System.out.println("m=" + m);
        System.out.println("k=" + k);
        //fibonacci
        int f0 = 1;
        int f1 = 1;
        int f2 = f0 + f1;
        System.out.println(f2);
        int f3 = f2 + f1;
        System.out.println(f3);
        int f4 = f3 + f2;
        System.out.println(f4);
        int f5 = f4 + f3;
        System.out.println(f5);
        int f6 = f5 + f4;
        System.out.println(f6);
        //fibonacci ali hoca
        int F0 = 0;
        int F1 = 1;
        int F2 = F0 + F1;
        System.out.println(F2);
        F0 = F2;
        F2 = F2 + F1;
        F1 = F0;
        System.out.println(F2);
        F0 = F2;
        F2 = F2 + F1;
        F1 = F0;
        System.out.println(F2);
        F0 = F2;
        F2 = F2 + F1;
        F1 = F0;
        System.out.println(F2);
        F0 = F2;
        F2 = F2 + F1;
        F1 = F0;
        System.out.println(F2);
        //last digit of an integer
        int q = 14;
        int w = q % 10;
        System.out.println(w);
        // change the digits
        int s1 = 324;

        int d1 = s1 / 100;
        int d2 = (s1 / 10) - ((s1 / 100) * 10);
        int d3 = s1 - ((s1 / 10) * 10);

        System.out.print(d3);
        System.out.print(d2);
        System.out.println(d1);

//even or odd
        int a1 = 78;
        double modula = a1 % 2;
        if (modula == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
//print binary value
        int b1 = 7;
        System.out.print("1");

        if (b1 <= 5) {
            System.out.print("0");
        } else {
            System.out.print("1");
        }
        if (b1 % 2 == 0) {
            System.out.print("0");
        } else {
            System.out.print("1");
        }

        //else if 
        int s = 93;

        if (s > 1 && s < 10) {
            System.out.println("small");
        } else if (s > 10 && s < 20) {
            System.out.println("large");
        } else {
            System.out.println("undefined");
        }
// binary
 int num2=4;
 String bn="";
 while(num2>0){
 bn=(num2%2)+bn;
 num2=num2/2;
 
 }
        System.out.println(bn);
        
        
        
        
        
        
        
        
        
    }

}
