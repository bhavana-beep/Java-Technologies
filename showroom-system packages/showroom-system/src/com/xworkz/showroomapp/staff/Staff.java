package com.xworkz.showroomapp.staff;

public class Staff
{
    public int staffId;
    public String staffName;
    public double salary;
    public String address;
    public int experience;

    public void getStaffInfo()
    {
        System.out.println("Staff Id : "+staffId);
        System.out.println("Staff Name : "+staffName);
        System.out.println("Staff salary : "+salary);
        System.out.println("Staff address : "+address);
        System.out.println("Staff experience : "+experience);


    }
}
