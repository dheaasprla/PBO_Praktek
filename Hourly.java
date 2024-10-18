package StudiKasus1;

//***********************************************************************************//
//  Horly.java             Author : Lewis/Loftus
//
//Demonstrates polymorphism via inheritance.
//***********************************************************************************//
public class Hourly extends Employee {
    private int hoursWorked;

    //-------------------------------------------------------------------------------
    // Sets up this hourly employee using the specified information.
    //-------------------------------------------------------------------------------
    public Hourly(String eName, String eAddress, String ePhone, String socsecNumber, double rate) {
        super(eName, eAddress, ePhone, socsecNumber, rate);
        hoursWorked = 0;
    }
    //-------------------------------------------------------------------------------
    // AAds the specified number of hours to this employee's
    //Accumulated hours.
    //-------------------------------------------------------------------------------
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    //-------------------------------------------------------------------------------
    // Computes and return the pay for this hourly employee.
    //-------------------------------------------------------------------------------
    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    //-------------------------------------------------------------------------------
    //Return information about this hourly employee as a string.
    //-------------------------------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result +=  "\nCurrent hours: " + hoursWorked;

        return result;
    }
}
