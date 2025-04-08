package com.xworkz.netflixapp;
import com.xworkz.netflixapp.netflix.NetflixDto;
import com.xworkz.netflixapp.signin.NetflixUserSignin;

public class NetFlixRunner {
        public static void main(String[] args) {

            NetflixDto user = new NetflixDto();
            user.setUserId("netflixuser2025");
            user.setUserName("Harshitha");
            user.setEmail("harshitha@netflix.com");
            user.setPassword("netflix@2025");
            user.setConfirmPassword("netflix@2025");
            user.setMobileNumber(9876543210L);

            NetflixUserSignin login = new NetflixUserSignin();
            boolean status = login.attemptLogin(user);

            System.out.println("Login status: " + status);
        }
    }


