/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arhan
 */
public class Rectangle {
    private double length;
    private double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Alanı hesaplayan metot
    public double calculateArea() {
        return this.length * this.width;
    }

    // Çevreyi hesaplayan metot
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

}
