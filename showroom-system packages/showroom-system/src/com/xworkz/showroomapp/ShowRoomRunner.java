package com.xworkz.showroomapp;

import com.xworkz.showroomapp.manager.Manager;
import com.xworkz.showroomapp.showroom.ShowRoom;
import com.xworkz.showroomapp.staff.Staff;

public class ShowRoomRunner
{
    public static void main(String args[]) {
        ShowRoom showroom1 = new ShowRoom();
        showroom1.showRoomId = 1;
        showroom1.showRoomName="TATA";
        showroom1.location="Banglore";
        Manager managers[]=new Manager[1];
        Manager manager=new Manager();
        manager.managerId=1;
        manager.mangerName="Ram";
        manager.noOfStaff=1;
        manager.address="Banglore";
        Staff staffs[]=new Staff[1];
        Staff staff=new Staff();
        staff.staffId=1;
        staff.staffName="Rakesh";
        staff.experience=3;
        staff.salary=13000.00;
        staff.address="Banglore";
        staffs[0]=staff;
        manager.staffs=staffs;
        managers[0]=manager;
        showroom1.managers=managers;
        showroom1.getShowRoomInfo();
    }

}
