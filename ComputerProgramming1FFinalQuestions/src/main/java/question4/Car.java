/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author sozcu
 */
public class Car {
     String color;
      Wheel whells;
      static int numberofcreatedobects;

    public Car(Wheel whells) {
        this.whells = whells;
    }

    public Car(String color, Wheel whells) {
        this.color = color;
        this.whells = whells;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the whells
     */
    public Wheel getWhells() {
        return whells;
    }

    /**
     * @param whells the whells to set
     */
    public void setWhells(Wheel whells) {
        this.whells = whells;
    }

    
      
}
