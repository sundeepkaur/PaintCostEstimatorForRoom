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
public class WallWithDoor extends Wall {

    private Door door;

    public WallWithDoor() {
        super();
    }

    public WallWithDoor(double width, double height) {
        super(width, height);
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public double getDoorArea() {
        return door.getArea();
    }

    public double getWallAreaWithoutDoor() {
        return super.getArea() - this.getDoorArea();
    }

    public double getTotalArea() {
        return this.getWallAreaWithoutDoor() + this.getDoorArea();
    }

    @Override
    public String toString() {
        return "WallWithDoor{ " + super.toString() + "\n" + this.door.toString() + "\nWallAreaWithoutDoor " + this.getWallAreaWithoutDoor() + " sqft,  TotalArea = " + this.getTotalArea() + " sqft }";
    }

}
