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
public class Door extends Rectangle {

    public Door() {
        super();
    }

    public Door(double width, double height) {
        super(width, height);
    }

    @Override
    public String toString() {
        return "Door{" + " Width = " + super.getLength() + " ft,   Height = " + super.getWidth() + " ft,     DoorArea = " + super.getArea() + " sqft }";
    }

}
