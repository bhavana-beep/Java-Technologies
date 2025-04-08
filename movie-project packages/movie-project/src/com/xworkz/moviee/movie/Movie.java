package com.xworkz.moviee.movie;
import com.xworkz.moviee.producer.Producer;
import com.xworkz.moviee.actor.Actor;

public class Movie 
{
    public int movieId;
    public String movieName;
    public Producer producers[];

    
    
    public void getMovieInfo()
    {
        System.out.println("Movie Id : "+movieId);
        System.out.println("Movie Name : "+movieName);
        System.out.print("Producers : ");
        for(Producer producer:producers)
            producer.getProducerInfo();

        
        
        
        
    }
}
