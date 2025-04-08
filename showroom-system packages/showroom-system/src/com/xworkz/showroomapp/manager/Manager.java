package com.xworkz.showroomapp.manager;
import com.xworkz.showroomapp.staff.Staff;
public class Manager
{
    public int managerId;
    public String mangerName;
    public int noOfStaff;
    public Staff staffs[];
    public String address;


    public void getManagerInfo()
    {
        System.out.println("Manager Id : "+managerId);
        System.out.println("Manager Name : "+mangerName);
        System.out.println("Number of Staffs : "+noOfStaff);
        System.out.println("Manager address : "+address);
        for(Staff staff:staffs)
            staff.getStaffInfo();




    }
}
