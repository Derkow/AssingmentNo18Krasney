// This class was written on May 8th, 2023 by Alexandra Krasney

import java.util.*;
public class HourlyEmployeeKrasney extends PayrollKrasney {
    protected double wageRate;
    protected int hours; 
    
    // To establish the getters and setters of the properties established above 
    
    public double getWageRate() {
        return this.wageRate;
    }
    
    public void setWageRate(double newWageRate) {
        this.wageRate = newWageRate;
    }
    
    public int getHours() {
        return this.hours;
    }
    
    public void setHours(int newHours) {
        this.hours = newHours;
    }
    
    // To establish the default constructor of this class
    public HourlyEmployeeKrasney() {
        super();
        this.setWageRate(0);
        this.setHours(0);
    }
    
    // To establish the conversion constructor 
    public HourlyEmployeeKrasney(String newName, String newID, String newJobTitle,
    double newWageRate, int newHours) {
        super(newName, newID, newJobTitle);
        this.setWageRate(newWageRate);
        this.setHours(newHours);
    }
    
    // To establish the copy constructor 
    public HourlyEmployeeKrasney(HourlyEmployeeKrasney other) {
        super(other.getName(), other.getID(), other.getJobTitle());
        this.setWageRate(other.getWageRate());
        this.setHours(other.getHours());
    }
    
    // To establish the getPay() method of this class
    public double getPay() {
        if ((this.getHours() - 40) <= 0) {
            return this.getWageRate() * this.getHours();
        }
        else {
            return (this.getWageRate() * 40) + (this.getWageRate() * (this.getHours() - 40) * 1.5);
        
        }
    
    }
    
    // To establish the equals() method of this class
    public boolean equals(HourlyEmployeeKrasney other) {
        // Code to check whether or not that the object that is the parameter of this method is of the same class as the object that is 
        // is calling this method is unnecessary, as the equals() method of PayrollKrasney already does so. Hence, this method will be a
        // normal equals() method in terms of its structure
        return this.getName().equals(other.getName()) && 
        this.getJobTitle().equals(other.getJobTitle()) &&
        this.getID().equals(other.getID()) && 
        this.getWageRate() == other.getWageRate() &&
        this.getHours() == other.getHours();
        
    }

    // To establish the toString method of this class 
    public String toString() {
        return ("Name: " + this.getName() +"\nJob Title: " + this.getJobTitle() + "\nEmployee ID: " + this.getID() +
        "\nHours Worked: " + this.getHours() + "\nTotal pre-taxed earnings (overtime and normal time combined): " + 
        String.format("$%.2f", this.getPay()));
    
    }
}