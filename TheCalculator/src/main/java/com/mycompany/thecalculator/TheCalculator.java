/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.thecalculator;

import java.util.Scanner;

/**
 *
 * @author sozcu
 */
public class TheCalculator {

    public static void main(String[] args) {
        boolean iscontinue = true;
        double[] testArray = new double[10];

        int testnumber = 0;
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = testnumber;
            testnumber += 3;
        }

        DataBase obj = new DataBase();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcom to calcutor");
        System.out.println("************* HELLO *************");
        System.out.println("1. Compute the sum between 2 or 3 or 4 numbers");
        System.out.println("2.Compute the subtraction between 2 or 3 or 4 numbers");
        System.out.println("3. Compute the product between two integer or float numbers");
        System.out.println("4. Compute the division between two integer or float numbers");
        System.out.println("5. Compute the factorial of a number");
        System.out.println("6. Compute the summation of the numbers between two selected numbers");
        System.out.println("7. Sum two arrays");
        System.out.println("8. Test if a number is prime or not");
        System.out.println("9. Test if a number is in an array or not");
        System.out.println("10. Compute the Standard Deviation of a set of 100 numbers in an array");
        System.out.println("What you want to do:");
        while (iscontinue == true) {

            String operation = scan.nextLine();

            switch (operation) {
                case "1":
                    System.out.println("How many numbers for sum");
                    int number = scan.nextInt();
                    switch (number) {
                        case 2: {
                            obj.generalSumOperation(2);
                            break;
                        }
                        case 3: {
                            obj.generalSumOperation(3);
                            break;
                        }
                        case 4: {
                            obj.generalSumOperation(4);
                            break;
                        }
                        default:
                            System.out.println("Only you can sum 2-3 or 4 numbers");
                            break;
                    }

                    break;
                case "2":
                    System.out.println("How many numbers for substraction?");
                    int substraction = scan.nextInt();
                    switch (substraction) {
                        case 2: {
                            obj.generalSubstractionOperation(2);
                            break;
                        }
                        case 3: {
                            obj.generalSubstractionOperation(3);

                            break;
                        }
                        case 4: {
                            obj.generalSubstractionOperation(4);

                            break;
                        }
                        default:
                            System.out.println("Only you can sum 2-3 or 4 numbers");
                            break;
                    }

                    break;
                case "3":
                    System.out.println("If you want to product integer press 1. If you want to product float press 2 ");
                    int op3 = scan.nextInt();
                    switch (op3) {
                        case 1:
                            System.out.println("Enter 2 numbers");
                            int result = obj.productInteger((scan.nextInt()), (scan.nextInt()));
                            System.out.println(result);
                            break;
                        case 2:
                            System.out.println("Enter 2 float");
                            float result2 = obj.productFloat((scan.nextFloat()), (scan.nextFloat()));
                            System.out.println(result2);
                            break;
                        default:
                            System.out.println("Please enter a valid number!");
                            break;
                    }

                    break;
                case "4":
                    System.out.println("If you want to product integer press 1. If you want to product float press 2 ");
                    int op4 = scan.nextInt();
                    switch (op4) {
                        case 1:
                            System.out.println("Enter 2 numbers");
                            obj.devisionInteger((scan.nextInt()), (scan.nextInt()));
                            break;
                        case 2:
                            System.out.println("Enter 2 float");
                            obj.devisionFloat((scan.nextFloat()), (scan.nextFloat()));
                            break;
                        default:
                            System.out.println("Please enter a valid number!");
                            break;
                    }

                    break;
                case "5":
                    System.out.println("Enter a number for factorial");
                    int factorial = scan.nextInt();
                    obj.factorial(factorial);

                    break;
                case "6":
                    System.out.println(" Enter 2 numbers");
                    double num1 = scan.nextDouble();
                    double num2 = scan.nextDouble();
                    obj.summationBetweenTwoNumber(num1, num2);

                    break;
                case "7":
                    System.out.println("Enter the size of the array: ");
                    int length = scan.nextInt();
                    double[] numberarray = new double[length];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < length; i++) {
                        numberarray[i] = scan.nextDouble();
                    }

                    System.out.println("Enter the size of the second array: ");
                    int length2 = scan.nextInt();
                    double[] numberarray2 = new double[length];
                    System.out.println("Enter the elements of the second array:");
                    for (int i = 0; i < length2; i++) {
                        numberarray2[i] = scan.nextDouble();
                    }
                    obj.sumArrays(numberarray, numberarray2);

                    break;
                case "8":
                    System.out.println("Enter a number");
                    int primenumber = scan.nextInt();
                    obj.ısPrime(primenumber);

                    break;
                case "9":
                    System.out.println("Enter a number to search for it: ");
                    double searchnumber = scan.nextDouble();
                    obj.InArrayOrNot(testArray, searchnumber);
                    break;
                case "10":
                    System.out.println("Enter an array elements");
                    double[] array = new double[100];
                    for (int i = 0; i < 100; i++) {
                        array[i] = scan.nextDouble();
                    }
                    obj.StandartDeviation(array);
                    break;
                case "Stop":
                    System.out.println("=========================");
                    System.out.println("------------- Thanks ----------------");
                    System.out.println("=========================");
                    iscontinue = false;
                    break;
                default:
                    System.out.println("Invalid operation! Please enter a valid operation (1-10 or Stop).");
                    break;

            }
            if (iscontinue) {

                System.out.println("What you want to do:");
                scan.nextLine();
            }

        }
    }
}
