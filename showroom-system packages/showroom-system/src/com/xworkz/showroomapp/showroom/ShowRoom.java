package com.xworkz.showroomapp.showroom;
import com.xworkz.showroomapp.manager.Manager;
public class ShowRoom
{
    public int showRoomId;
    public String showRoomName;
    public String location;
    public Manager managers[];


    public void getShowRoomInfo()
    {

        System.out.println("ShowRoom Id : "+showRoomId);
        System.out.println("ShowRoom Name : "+showRoomName);
        System.out.println("ShowRoom location : "+location);
        System.out.print("ShowRoom Managers : ");

        for(Manager manager:managers)
            manager.getManagerInfo();



    }
}
