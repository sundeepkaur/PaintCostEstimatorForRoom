/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_part4;

import java.text.NumberFormat;

/**
 *
 * @author kaurs
 */
public class Room {

    private WallWithWindow walWithWindow;
    private WallWithDoor wallWithDoor;
    private Wall wallList[];
    private int count;
    private Ceiling ceiling;
    private Paint paintList[];
    private int paintCount;
    private Labor labor;
    public static double gallonsOfPaintForWall;
    public static double gallonsOfPaintForDoorWindow;
    public static double gallonsOfPaintForCeiling;
    public static double totalGallons;
    public static double totalCostToPaint;
    public static double totalEstimate;

    public Room() {
        wallList = new Wall[2];
        paintList = new Paint[3];
        count = 0;
        paintCount = 0;
    }

    public void addPaint(Paint paint) throws AddPaintException {
        if (paintCount < paintList.length) {
            paintList[paintCount++] = paint;
        } else {
            throw new AddPaintException("Cannnot Add - List is full");
        }
    }

    public void addWall(Wall wall) throws AddWallException {
        if (count < wallList.length) {
            wallList[count++] = wall;
        } else {
            throw new AddWallException("Cannnot Add - List is full");
        }
    }

    public WallWithWindow getWalWithWindow() {
        return walWithWindow;
    }

    public void setWalWithWindow(WallWithWindow walWithWindow) {
        this.walWithWindow = walWithWindow;
    }

    public WallWithDoor getWallWithDoor() {
        return wallWithDoor;
    }

    public void setWallWithDoor(WallWithDoor wallWithDoor) {
        this.wallWithDoor = wallWithDoor;
    }

    public Wall[] getWallList() {
        return wallList;
    }

    public void setWallList(Wall wall) {
        wallList[count] = wall;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Labor getLabor() {
        return labor;
    }

    public void setLabor(Labor labor) {
        this.labor = labor;
    }

    public double getCostToPaintWalls(Paint wallPaintData) {
        double wallArea = 0;
        for (int i = 0; i < count; i++) {
            wallArea = wallArea + wallList[i].getArea();
        }
        gallonsOfPaintForWall = (wallArea + this.walWithWindow.getWallAreaWithoutWindow() + this.wallWithDoor.getWallAreaWithoutDoor()) / wallPaintData.getCoverageArea();
        double totalCostRequiredToPaintWalls = gallonsOfPaintForWall * wallPaintData.getPricePerGallon();
        return totalCostRequiredToPaintWalls;
    }

    public double getCostToPaintCeiling(Paint ceilingPaintData) {
        gallonsOfPaintForCeiling = ceiling.getArea() / ceilingPaintData.getCoverageArea();
        double totalCostRequiredToPaintCeiling = gallonsOfPaintForCeiling * ceilingPaintData.getPricePerGallon();
        return totalCostRequiredToPaintCeiling;
    }

    public double getCostToPaintDoorWindow(Paint doorWinPaintData) {
        gallonsOfPaintForDoorWindow = (this.walWithWindow.getWindowArea() + this.wallWithDoor.getDoorArea()) / doorWinPaintData.getCoverageArea();
        double totalCostRequiredToPaintDoorWindow = gallonsOfPaintForDoorWindow * doorWinPaintData.getPricePerGallon();
        return totalCostRequiredToPaintDoorWindow;
    }

    public double getTotalCostRequiredToPaint(Paint wallPaintData, Paint ceilingPaintData, Paint doorWinPaintData) {
        double totalCostRequiredToPaint = this.getCostToPaintCeiling(ceilingPaintData) + this.getCostToPaintDoorWindow(doorWinPaintData) + this.getCostToPaintWalls(wallPaintData);
        return totalCostRequiredToPaint;
    }

    public double getTotalLaborCost() {
        totalGallons = gallonsOfPaintForWall + gallonsOfPaintForDoorWindow + gallonsOfPaintForCeiling;
        double totalLaborCost = totalGallons * labor.getNumberOfHours() * labor.getHourlyRate();
        return totalLaborCost;
    }

    public double getTotalEstimateToPaintRoom(double costToPaintWalls, double costToPaintCeiing, double costToPaintDoorWindow) {
        totalCostToPaint = costToPaintWalls + costToPaintCeiing + costToPaintDoorWindow;
        totalEstimate = this.getTotalLaborCost() + totalCostToPaint;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String totalEstimateToPaintYourRoomFormatted = currency.format(totalEstimate);
        return totalEstimate;
    }

    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String totalPaintCostFormatted = currency.format(totalCostToPaint);
        String totalLabourCostFormatted = currency.format(this.getTotalLaborCost());
        String totalEstimateToPaintYourRoomFormatted = currency.format(totalEstimate);

        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(0);
        String totalPaintGallonsFormatted = number.format(totalGallons);

        NumberFormat numberHours = NumberFormat.getNumberInstance();
        numberHours.setMaximumFractionDigits(2);
        String totalLabourHoursFormatted = numberHours.format((totalGallons) * labor.getNumberOfHours());
        return "----------------------------------------\n" + "\"Below is the Estimate To Paint Your Room :\n" + "Total Gallons of paint required: " + totalPaintGallonsFormatted
                + "\nTotal Labour hours required: " + totalLabourHoursFormatted + "\nTotal Paint cost is: " + totalPaintCostFormatted + "\nTotal Labour charges are: " + totalLabourCostFormatted
                + "\nTotal Estimate Cost to paint your room is: " + totalEstimateToPaintYourRoomFormatted + "\n----------------------------------------";
    }

}
