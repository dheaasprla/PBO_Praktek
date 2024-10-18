package StudiKasus1;

//***********************************************************************************//
//  StaffMember.java             Author : Lewis/Loftus
//
// Represents the generic staff member.
//***********************************************************************************//

public abstract class StaffMember
{
    protected String name;
    protected String address;
    protected String phone;

    //-------------------------------------------------------------------------------
    //Stets up a staff member using the specified information.
    //-------------------------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        this.name = eName;
        this.address = eAddress;
        this.phone = ePhone;
    }

    //-------------------------------------------------------------------------------
    //Return a string including the basic employee information.
    //-------------------------------------------------------------------------------
    public String toString(){
        String result = "Name: " + name + "\n";

        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
    }

    //-------------------------------------------------------------------------------
    //Return a string including the basic employee information.
    //-------------------------------------------------------------------------------
    public abstract double pay();
}