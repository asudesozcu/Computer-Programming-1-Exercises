/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thecalculator;

import java.util.Scanner;

/**
 *
 * @author sozcu
 */
public class DataBase {

    public double sumNumbers(double x, double y) {
        double sum = x + y;
        return sum;
    }

    public double sumNumbers(double x, double y, double z) {
        double sum = x + y + z;
        return sum;
    }

    public double sumNumbers(double x, double y, double z, double t) {
        double sum = x + y + z + t;
        return sum;
    }

    public double substactNumbers(double x, double y) {
        double subs = x - y;
        return subs;
    }

    public double substactNumbers(double x, double y, double z) {
        double subs = x - y - z;
        return subs;
    }

    public double substactNumbers(double x, double y, double z, double t) {
        double subs = x - y - z - t;
        return subs;
    }

    public int productInteger(int x, int y) {
        int multp = x * y;
        return multp;
    }

    public float productFloat(float x, float y) {
        float multp = x * y;
        return multp;
    }

    public void devisionInteger(int x, int y) {

        if (y == 0) {
            System.out.println("Error!. Can't devide by 0");
        } else {
            double dev = x / y;
            System.out.println(dev);
        }
    }

    public void devisionFloat(float x, float y) {
        double dev = x / y;
        if (y == 0) {
            System.out.println("Error!. Can't devide by 0");
        } else {
            System.out.println(dev);
        }

    }

    public int factorial(int number) {
        int result = 1;
        if (number == 0) {
            result = 1;
        }
        for (int i = 1; i <= number; i++) {
            result = productInteger(result, i);
        }
        System.out.println(result);
        return result;
    }

    public void summationBetweenTwoNumber(double x, double y) {
        double result = 0;
        for (double i = x; i < y; i++) {// it says between 2 numbers so we shouldnt include the second value which is written by user 
            result += sumNumbers(x, i);

        }
        System.out.println(result);

    }

    public void sumArrays(double[] x, double[] y) {
        double result = 0, result1 = 0, result2 = 0;
        for (int i = 0; i < x.length; i++) {
            result1 += x[i];
        }
        for (int i = 0; i < y.length; i++) {
            result2 += y[i];
        }

        result = sumNumbers(result1, result2);
        System.out.println(result);
    }

    public void ısPrime(int x) {
        boolean isprime = true;
        if (x <= 1) {
            isprime = false;
        }

        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                isprime = false;
            }
        }
        if (isprime == true) {
            System.out.println("The number is prime");
        } else if (isprime != true) {
            System.out.println("The number is not prime");
        }

    }

    public void InArrayOrNot(double[] array, double number) {
        boolean InArray = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                InArray = true;
            }

        }
        if (InArray == true) {
            System.out.println("The number is in our array");
        } else if (InArray != true) {
            System.out.println("The number is not in our array");
        }
    }

    public double avarege(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public void StandartDeviation(double[] array) {
        double variance = 0;
        for (int i = 0; i < array.length; i++) {
            variance += Math.pow((array[i] - avarege(array)), 2);

        }
        variance = variance / (array.length - 1);
        System.out.println(Math.pow(variance, 1 / 2));
    }

    public void generalSumOperation(int count) {
        double[] numbers = new double[count];
        double result = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scan.nextDouble();
            result += numbers[i];
        }
        System.out.println(result);

    }

    public void generalSubstractionOperation(int count) {
        double[] numbers = new double[count];
        double result = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scan.nextDouble();
            result -= numbers[i];
        }
        result += 2 * numbers[0];
        System.out.println(result);
    }
}
