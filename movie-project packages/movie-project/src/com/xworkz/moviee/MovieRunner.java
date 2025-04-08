package com.xworkz.moviee;
import com.xworkz.moviee.movie.Movie;
import com.xworkz.moviee.producer.Producer;
import com.xworkz.moviee.actor.Actor;
public class MovieRunner
{
    public static void main(String args[]) {
        Movie movie1 = new Movie();
        movie1.movieId = 1;
        movie1.movieName = "Sarathi";
        Producer producers[] = new Producer[1];
        Producer producer = new Producer();
        producer.producerId = 1;
        producer.producerName = "XYZ";
        Actor actors[] = new Actor[1];
        Actor actor = new Actor();
        actor.actorId = 1;
        actor.actorName = "Darshan";
        actor.experience = 10;
        actors[0] = actor;
        producer.actors = actors;
        producers[0] = producer;
        movie1.producers = producers;
        movie1.getMovieInfo();
    }


}
