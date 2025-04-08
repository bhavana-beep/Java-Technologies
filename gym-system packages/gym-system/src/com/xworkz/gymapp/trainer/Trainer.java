package com.xworkz.gymapp.trainer;
import com.xworkz.gymapp.trainee.Trainee;
public class Trainer
{
    public int trainerId;
    public String trainerName;
    public int experience;
    public Trainee trainees[];


    public void getTrainerInfo()
    {
        System.out.println("Trainer Id : "+trainerId);
        System.out.println("Trainer Name : "+trainerName);
        System.out.println("Trainer experience : "+experience);
        for(Trainee trainee:trainees)
             trainee.getTraineeInfo();


    }
}
