package com.xworkz.youtubeapp;
import com.xworkz.youtubeapp.youtube.YouTubeDto;
import com.xworkz.youtubeapp.loginuser.YouTubeLogIn;

public class YouTubeRunner {


        public static void main(String[] args) {

            YouTubeDto user = new YouTubeDto();
            user.setUserEmail("creator@example.com");
            user.setChannelName("TechWithHarshitha");
            user.setPassword("youtube123");
            user.setConfirmPassword("youtube123");
            user.setMobile(9876543210L);

            YouTubeLogIn login = new YouTubeLogIn();
            boolean result = login.startSignIn(user);

        }
    }


