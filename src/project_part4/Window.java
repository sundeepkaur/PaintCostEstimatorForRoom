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
public class Window extends Rectangle {

    public Window() {

    }

    public Window(double width, double height) {
        super(width, height);
    }

    @Override
    public String toString() {
        return "Window{" + " Width = " + super.getLength() + " ft,   Height = " + super.getWidth() + " ft,    WindowArea = " + super.getArea() + " sqft }";
    }

}
