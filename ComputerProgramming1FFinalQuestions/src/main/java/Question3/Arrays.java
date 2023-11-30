/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

/**
 *
 * @author sozcu
 */
public class Arrays {

    public static void main(String[] args) {
        //Question3.1
        int[] givenArray = {1, 4, 5, 10, 7, 8, 8, 9, 1, 3, 8};
        int[] givenArray2 = new int[11];
        givenArray2[0] = 1;
        givenArray2[1] = 4;
        givenArray2[2] = 5;
        givenArray2[3] = 10;
        givenArray2[4] = 7;
        givenArray2[5] = 8;
        givenArray2[6] = 8;
        givenArray2[7] = 9;
        givenArray2[8] = 1;
        givenArray2[9] = 3;
        givenArray2[10] = 8;
        int[] array3;
        array3 = new int[]{1, 4, 5, 10, 7, 8, 8, 9, 1, 3, 8};
//  Question3.2
        double maximum = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > maximum) {
                maximum = array3[i];
            }
        }

        //QUESTİON3.3
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]+" ");
        } System.out.println("");
        //QUESTİON3.4
        int howmany = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == 8) {
                howmany += 1;
            }
        }
        System.out.println("the number 8 is " + howmany + " times in the array");
    }
}
