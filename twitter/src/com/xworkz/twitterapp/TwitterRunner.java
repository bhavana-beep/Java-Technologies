package com.xworkz.twitterapp;
import com.xworkz.twitterapp.twitter.TwitterDto;
import com.xworkz.twitterapp.signin.TwitterSignIn;

public class TwitterRunner {
        public static void main(String[] args) {

            TwitterDto user = new TwitterDto();
            user.setHandle("@harshithaDev");
            user.setDisplayName("Harshitha S");
            user.setEmail("harshitha@twitter.com");
            user.setPassword("tw33tPass");
            user.setConfirmPassword("tw33tPass");
            user.setMobileNumber(9876543210L);

            TwitterSignIn login = new TwitterSignIn();
            boolean loggedIn = login.beginSession(user);


        }
    }


