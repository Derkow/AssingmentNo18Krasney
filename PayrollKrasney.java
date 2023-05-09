// This file was written on May 3rd, 2023, by Alexandra Krasney

public abstract class PayrollKrasney {
    // Properties of this class will be of private access level, as the instructions for 
    // this assignment called for this class to have getter and setter methods for its 
    // properties. Thus, given that this program will only interact with the main program of 
    // this assignment and the classes that are derived from itself, it seems inefficent to
    // have setter and getter methods which retrieve the properties. Hence, in order to have
    // a practical justification for their existence, the properties of this class will be 
    // private in access 
    private String Name = "";
    private String ID = "";
    private String jobTitle = "";
    
    // To create the method that discerns whether or not the value of the ID property of this
    // class and its derived descendants is valid or not. Is of the protected access level as
    // constructors of this class and its descendents will use this method; using it in the 
    // getID() method would cause too much strain for the computer, as getters are some of the
    // most frequently used methods in programming. The Name and jobTitle properties will not
    // have a method that specifically validates their value to see if it conforms to an 
    // actual job or name, as such methods will also cause too much strain for the computer, 
    // given the sheer amount of possible job titles and names in existence.
    protected String numCheck(String allegedID) {
        try {
            // To see if the value of the ID number is composed of only numbers
            boolean numCheckResult = allegedID.matches("[0-9]+");
            String verifiedID; 
            if (numCheckResult == true) {
                // To then check to see if the string consists of five characters or less
                try {
                    if ((allegedID.length()) <= 5) {
                        // The if block immediately down below this comment is to add zeros
                        // to the ID property, such that, if the ID property of an object
                        // of this class had the value of "93", and if it was called upon 
                        // to be printed, it would print "00093" instead of "93". Also, the 
                        // reason as for why the if block directly below is not a switch 
                        // statement: Java's apparent inability to have the condition of a
                        // switch statement be an expression
                        if ((5 - allegedID.length()) == 1) {
                            allegedID = allegedID.replaceAll(allegedID, "0" + allegedID);
                        }
                        else if ((5 - allegedID.length()) == 2) {
                            allegedID = allegedID.replaceAll(allegedID, "00" + allegedID);
                        }
                        else if ((5 - allegedID.length()) == 3) {
                            allegedID = allegedID.replaceAll(allegedID, "000" + allegedID);
                        }
                        else if ((5 - allegedID.length()) == 4) {
                            allegedID = allegedID.replaceAll(allegedID, "0000" + allegedID);
                        } else {
                            
                        }
                    }
                    else if (allegedID.equals("0") || allegedID.equals('0')) {
                        throw new IllegalArgumentException("ID is of the default constructor, and thereby needs no verifying");
                    }
                    else {
                        throw new IllegalArgumentException("ID contains too many numbers");
                    }
                }
                
                catch (IllegalArgumentException iae2) {
                    System.out.println(iae2.getMessage());
                    System.exit(0);
                }
            }
            else if (numCheckResult == false) {
                throw new IllegalArgumentException("ID contains non-numerical characters");
            }
            else if (allegedID.equals("")) {
                throw new  IllegalArgumentException("ID contains no characters at all");
            }  
            else {
                // To cover the possibility that the the value of this property is null
                throw new NullPointerException("No value is assigned to the ID property"
                + " of this object");
            }
        }
        
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage()); 
            System.exit(0);
        }
        catch (NullPointerException npe ) {
            System.out.println(npe.getMessage());
            System.exit(0);
        }
         
        return allegedID;
    }
    
    // To create the accessors and mutators for the above properties 
    
    public String getName() {
        return this.Name;
    }
    
    public void setName(String newName) {
        this.Name = newName;
    }
    
    public String getID() {
        return this.ID;
    }
    
    // Checking for validity will be inbuilt to the ID property's setter method, as such a thing 
    // will reduce the amount of code needing to be written
    public void setID(String newID) {
        this.ID = this.numCheck(newID);
    }
    
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String newJobTitle) {
        this.jobTitle = newJobTitle;
    }
    
    // The default, conversion and copy constructors for this class 
    
    // The default constructor -- does not check for the validity of the ID value, due to 
    // said value being inherently determined 
    public PayrollKrasney() {
        this.Name = "";
        this.ID = "00000";
        this.jobTitle = "";
    }
    
    // The conversion constructor -- numCheck() will be used here
    public PayrollKrasney(String newName, String newID, String newJobTitle) {
        this.setName(newName);
        this.setID(this.numCheck(newID));
        this.setJobTitle(newJobTitle);
    }
    
    // The copy constructor -- numCheck() will not be used here, as the ID value itself
    // has been presumably checked already
    public PayrollKrasney(PayrollKrasney other) {
        this.setName(other.getName()); 
        this.setID(other.getID());
        this.setJobTitle(other.getJobTitle());
    }
    
    // To create the abstract getPay() method for this class. Will output a double instead of
    // an integer, as one's salary (which I am assuming is in US dollars) is rarely ever a 
    // whole number, especially after tax
    public abstract double getPay();
    
    // The abstract toString method
    public abstract String toString();
    
    // Is also abstract
    public boolean equals(PayrollKrasney other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        else {
            // Does not matter, the equals method of the subclasses of this class will override this method
            return true;
        }
    }
}