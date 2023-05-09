// This program was written on May 3rd, 2023 by Alexandra Krasney

/**
 * Pseudocode: 
 * 
 * Note: All classes described below will have 'Krasney' appended to their names
 * 
 * 1) Create the abstract payroll class, establish its properties, the getters and setters
 * of said properties, and constructors
 * 2) Create methods that handle the majority of possible exceptions that could arise \
 * in the methods that were established in the previous step 
 */


public class AssignNo18KrasneyMain {
    public static void main(String[] args) {
        // To demonstrate the conversion constructor of the HourlyEmployee class 
        HourlyEmployeeKrasney test = new HourlyEmployeeKrasney("Yoda", "748", "Swamp-dwelling green thing", 3.45, 28);
        System.out.println(test.toString());
        
        // These statements are to make the output of the program more readable
        System.out.println("\n");
        
        // To demonstrate the copy constructor of the HourlyEmployee class 
        HourlyEmployeeKrasney test2 = new HourlyEmployeeKrasney(test);
        System.out.println(test2.toString());
        
        System.out.println("\n");
        
        // To demonstrate the conversion constructor of the SalariedEmployee class
        SalariedEmployeeKrasney test3 = new SalariedEmployeeKrasney("Darth Vader", "8484", "Professional attack dog", 1);
        System.out.println(test3.toString());
        
        System.out.println("\n");
        
        // To show that classes test2 and test3 are not equal to each other
        System.out.println(test2.equals(test3)); // <-- Should print out false 
        
        System.out.println("\n");
        
        // To show that the getPay() of both subclasses work 
        
        // To show that the getPay() method of the SalariedEmployee class works 
        System.out.println("Average weekly pay of " + test3.getName() + ": $" + String.format("%.2f", test3.getPay()));
        
        System.out.println("\n");
        
        // To show that the getPay() of the HourlyEmployee class works 
        HourlyEmployeeKrasney test4 = new HourlyEmployeeKrasney("Palpatine", "00001","The Big Cheese", 1000000, 168); 
        System.out.println("Average weekly pay of " + test4.getName() + ": $" + String.format("%.2f", test4.getPay()));
        
        // To show that entering a string with a non-numerical character within it as the value of an object of either
        // of the subclass's ID property will cause an exception (It should print out a sentence that says that the 
        // ID property string has non-numerical characters)
        SalariedEmployeeKrasney test5 = new SalariedEmployeeKrasney("Uriel Rakarth", "666", "What Palpatine dreams of being", 1000000000);
    
    }   
}



/**
 * Sources: 
 * 
 * https://www.geeksforgeeks.org/how-to-check-if-string-contains-only-digits-in-java/
 * https://www.tutorialkart.com/java/how-to-check-if-string-contains-only-digits-in-java/#gsc.tab=0
 * https://stackoverflow.com/questions/45921034/same-exception-type-with-different-error-message
 * https://rollbar.com/blog/most-common-java-exceptions/
 * https://javarevisited.blogspot.com/2013/02/add-leading-zeros-to-integers-Java-String-left-padding-example-program.html#axzz818Jz825n
 * https://www.javatpoint.com/java-class-getname-method
 * https://chortle.ccsu.edu/java5/Notes/chap52/ch52_3.html
 * https://stackoverflow.com/questions/16620354/difference-between-null-and-empty-string
 * https://www.w3schools.com/java/java_switch.asp
 * https://www.baeldung.com/java-switch-pattern-matching
 * https://www.tutorialspoint.com/replace-one-string-with-another-string-with-java-regular-expressions#:~:text=To%20replace%20one%20string%20with,expression%20and%20String%20after%20replacement.
 */