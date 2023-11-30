/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sozcu
 */
public class Question2 {

    public static double calculate(int numberofexams) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write points of exams");
        double[] points = new double[numberofexams];
        double sum = 0;
        double maximum = points[0];
        for (int i = 0; i < numberofexams; i++) {
            double point = scan.nextInt();
            points[i] = point;
            sum += point;
        }
        for (int i = 0; i < points.length; i++) {
            if (points[i] > maximum) {
                maximum = points[i];
            }
        }
        System.out.println("Max is :" + maximum);
        return sum / numberofexams;
    }

    public static int[] arrays(int[] array, int[] array1) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i] * array1[i];

        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 4, 3, 5, 2};
        int[] array2 = {3, 2, 0, 6, 7};
        int[] result = arrays(array2, array1);
        System.out.println(Arrays.toString(result));

    }
}
