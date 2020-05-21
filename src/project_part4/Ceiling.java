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
public class Ceiling extends Wall {

    public Ceiling() {
        super();
    }

    public Ceiling(double length, double width) {
        super(length, width);
    }

    @Override
    public String toString() {
        return "Ceiling{" + " Length = " + super.getLength() + " ft,    Width = " + super.getWidth() + " ft,    CeilingArea = " + super.getArea() + " sqft }";
    }

}
