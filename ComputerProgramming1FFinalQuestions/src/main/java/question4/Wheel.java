/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author sozcu
 */
public class Wheel {

    String brand;
    int price;

    public void update(int price) {
        this.price = price;
    }

    public void update(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setprice(int amount) {
        this.price = price + amount;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Wheel(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Wheel() {
    }

    public Wheel(String brand) {
        this.brand = brand;
    }

}
