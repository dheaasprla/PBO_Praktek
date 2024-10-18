package StudiKasus1;

//***********************************************************************************//
//  Employee.java             Author : Lewis/Loftus
//
// Represents a general paid employee.
//***********************************************************************************//

public class Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    //-------------------------------------------------------------------------------
    //Stets up an employee with specified information.
    //-------------------------------------------------------------------------------
    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
}
    //-------------------------------------------------------------------------------
    //Return information about an employee as a string.
    //-------------------------------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }

    //-------------------------------------------------------------------------------
    //Return the pay rate for this employee.
    //-------------------------------------------------------------------------------
    public double pay()
    {
        return payRate;
    }
}
