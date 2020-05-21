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
public class Labor {

    private double hourlyRate;
    private double numberOfHours;

    public Labor() {
        super();
    }

    public Labor(double hourlyRate, double numberOfHours) throws RangeException {
        this.setHourlyRate(hourlyRate);
        this.setNumberOfHours(numberOfHours);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) throws RangeException {
        if (hourlyRate != 20) {
            throw new RangeException("Error! Entered value for hourly rate should be equal to  " + 20 + " hours only");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) throws RangeException {
        this.validate(numberOfHours);
        this.numberOfHours = numberOfHours;
    }

    public void validate(double value) throws RangeException {
        if (value <= 7) {
            throw new RangeException("Error! Entered value for number of hours should be higher than " + 7 + " hours ie within 8 to 10");
        }
        if (value > 10) {
            throw new RangeException("Error! Entered value for number of hours should be lower than " + 10 + " hours ie within 8 to 10");
        }
    }

    @Override
    public String toString() {
        return "Labor{" + "HourlyRate = " + this.getHourlyRate() + ", NumberOfHours = " + this.getNumberOfHours() + '}';
    }

}
