package com.xworkz.moviee.producer;
import com.xworkz.moviee.actor.Actor;
public class Producer
{
    public int producerId=1;
    public String producerName="HariKrishna";
    public Actor actors[];
    public void getProducerInfo()
    {
        System.out.println("Producer Id : "+producerId);
        System.out.println("Producer Name : "+producerName);
        System.out.print("Actors:");

        for(Actor actor:actors)
            actor.getActorInfo();
    }

}
