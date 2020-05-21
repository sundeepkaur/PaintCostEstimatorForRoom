/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_part4;

/**
 *
 * @author kaurs
 */
public class Rectangle {

    private double length;
    private double width;
    private double area;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.setWidth(width);
        this.setLength(length);
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

    public double getArea() {
        setArea();
        return area;
    }

    private void setArea() {
        this.area = this.getLength() * this.getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" + " Length = " + this.getLength() + " ft,   Width = " + this.getWidth() + " ft,   Area = " + this.getArea() + " sqft}";
    }

}
