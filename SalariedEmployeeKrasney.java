// This program was written on May 8th, 2023, by Alexandra Krasney

public class SalariedEmployeeKrasney extends PayrollKrasney {
    // To establish this class's unique property
    protected double annualSalary;
    
    // To establish the unique property's getter and setter method 
    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(double newSalary) {
        this.annualSalary = newSalary;
    }
    
    // To establish the default, conversion, and copy constructor for this class
    
    // The default constructor 
    public SalariedEmployeeKrasney() {
        super();
        this.setAnnualSalary(0);
    }
    
    // The conversion constructor 
    public SalariedEmployeeKrasney(String newName, String newID, String newJobTitle, double newSalary) {
        super(newName, newID, newJobTitle);
        this.setAnnualSalary(newSalary);
    }
    
    // The copy constructor 
    public SalariedEmployeeKrasney(SalariedEmployeeKrasney other) {
        super(other);
        this.setAnnualSalary(other.getAnnualSalary());
    }
    
    // To establish the getPay() method of this class. The reason why the number produced by the division of the 
    // annual salary by fifty-two is make it so that it only has two decimal places
    public double getPay() {
        return Double.valueOf(String.format("%.2f", this.getAnnualSalary()/52) );
    }
    
    // To establish the equals() method of this class
    public boolean equals(SalariedEmployeeKrasney other) {
        return this.getName().equals(other.getName()) && this.getID().equals(other.getID()) && 
        this.getJobTitle().equals(other.getJobTitle()) && this.getAnnualSalary() == other.getAnnualSalary();
    }
    
    // To establish the toString() method of this class 
    public String toString() {
        return "Name: " + this.getName() + "\nJob Title: " + this.getJobTitle() + "\nEmployee ID: " + this.getID()
        + "\nAnnual Salary: $" + this.getAnnualSalary();
    }
}