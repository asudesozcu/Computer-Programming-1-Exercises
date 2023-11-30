/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car2;

/**
 *
 * @author sozcu
 */
class Test {

    int total, av;

    public int sum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            total += num[i];

        }
        return total;
    }

    public int avarage(int[] num) {
total=0;
        for (int i = 0; i < num.length; i++) {
            
            total = total + num[i];

        }
        av = total / num.length;

        return av;
    }
}
