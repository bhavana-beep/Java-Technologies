package com.xworkz.gymapp;
import com.xworkz.gymapp.gym.Gym;
import com.xworkz.gymapp.trainer.Trainer;
import com.xworkz.gymapp.trainee.Trainee;
public class GymRunner
{
    public static void main(String args[])
    {
        Gym gym =new Gym();
        gym.gymId=1;
        gym.gymName="Fit";
        gym.location="Banglore";
        Trainer trainers[]=new Trainer[1];
        Trainer trainer=new Trainer();
        trainer.trainerId=1;
        trainer.trainerName="Ram";
        trainer.experience=3;
        Trainee trainees[]=new Trainee[1];
        Trainee  trainee=new Trainee();
        trainee.traineeId=1;
        trainee.traineeName="Sookshma";
        trainee.address="Banglore";
        trainees[0]=trainee;
        trainer.trainees=trainees;
        trainers[0]=trainer;
        gym.trainers=trainers;
        gym.getGymInfo();


    }
}
