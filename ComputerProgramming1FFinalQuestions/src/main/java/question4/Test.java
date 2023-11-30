/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author sozcu
 */
public class Test {
    public static void main(String[] args) {
        Wheel whellobj= new Wheel();
        Car carobj= new Car(whellobj);
        RenaultClio reno= new RenaultClio(whellobj);
    }
}
