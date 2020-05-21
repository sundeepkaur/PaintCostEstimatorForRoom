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
public class Wall extends Rectangle {

    public Wall() {
        super();
    }

    public Wall(double width, double height) {
        super(width, height);
    }

    @Override
    public String toString() {
        return "Wall{" + " Width = " + super.getLength() + " ft,    Height = " + super.getWidth() + " ft,    SideWallArea = " + super.getArea() + " sqft }";
    }

}
