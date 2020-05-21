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
public class Paint {

    private double coverageArea;
    private double pricePerGallon;
    private String paintType;

    public Paint(double coverageArea, double pricePerGallon, String paintType) throws RangeException {
        this.setCoverageArea(coverageArea);
        this.setPricePerGallon(pricePerGallon);
        this.setPaintType(paintType);
    }

    public double getCoverageArea() {
        return coverageArea;
    }

    public void setCoverageArea(double coverageArea) throws RangeException {

        if (coverageArea > 400) {
            throw new RangeException("Error! Entered value for coverage area should be less than " + 400 + " sqft.");
        }
        this.coverageArea = coverageArea;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(double pricePerGallon) throws RangeException {
        this.validate(pricePerGallon);
        this.pricePerGallon = pricePerGallon;
    }

    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    public void validate(double value) throws RangeException {
        if (value <= 20) {
            throw new RangeException("Error! Entered value for price per gallon should be higher than $ " + 20);
        }
        if (value > 45) {
            throw new RangeException("Error! Entered value for price per gallon should be lower than $ " + 45);
        }
    }

    @Override
    public String toString() {
        return "Paint{" + "CoverageArea=" + this.getCoverageArea() + ", PricePerGallon=" + this.getPricePerGallon() + ", PaintType=" + this.getPaintType() + '}';
    }

}
