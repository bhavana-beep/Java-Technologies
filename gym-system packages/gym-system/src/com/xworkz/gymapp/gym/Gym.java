package com.xworkz.gymapp.gym;
import com.xworkz.gymapp.trainer.Trainer;
public class Gym
{

    public int gymId;
    public String gymName;
    public String location;
    public Trainer trainers[];
    public void getGymInfo()
    {

        System.out.println("Gym Id : "+gymId);
        System.out.println("Gym Name : "+gymName);
        System.out.println("Gym Location : "+location);
        for(Trainer trainer:trainers)
            trainer.getTrainerInfo();


    }
}
