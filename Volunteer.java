package StudiKasus1;

//***********************************************************************************//
//  Volunteer.java             Author : Lewis/Loftus
//
// Represents a staff member that works as a volunteer.
//***********************************************************************************//

public class Volunteer extends StaffMember
{
    //-------------------------------------------------------------------------------
    //Stets up a staff volunteer using the specified information.
    //-------------------------------------------------------------------------------
    public Volunteer(String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone);
    }

    //-------------------------------------------------------------------------------
    //Returs a zero pay value for this volunteer.
    //-------------------------------------------------------------------------------
    public double pay()
    {
        return 0.0;
    }
}