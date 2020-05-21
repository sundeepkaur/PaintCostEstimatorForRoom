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
public class WallWithWindow extends Wall {

    private Window window;

    public WallWithWindow(double width, double height) {
        super(width, height);
    }

    public Window getWindow() {
        return this.window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public double getWindowArea() {
        return window.getArea();
    }

    public double getWallAreaWithoutWindow() {
        return super.getArea() - this.getWindowArea();
    }

    public double getTotalArea() {
        return this.getWallAreaWithoutWindow() + this.getWindowArea();
    }

    @Override
    public String toString() {
        return "WallWithWindow{ " + super.toString() + "\n" + this.window.toString() + "\nWallAreaWithoutWindow " + this.getWallAreaWithoutWindow() + " sqft,  TotalArea = " + this.getTotalArea() + " sqft }";
    }
}
