package com.xworkz.googleapp;

import com.xworkz.googleapp.google.GoogleDto;
import com.xworkz.googleapp.googlesignin.GoogleSignIn;

public class GoogleRunner {

        public static void main(String[] args) {

            GoogleDto googleDto = new GoogleDto();
            googleDto.setEmail("anuup123@gmail.com");
            googleDto.setPhoneNumber("9876543210");
            googleDto.setUsername("Anup123");
            googleDto.setPassword("Anupama123");
            googleDto.setConfirmPassword("Anupama123");

            GoogleSignIn googleSignIn = new GoogleSignIn();
            boolean result = googleSignIn.attemptLogin(googleDto);

            if (result) {
                System.out.println("Login successful ");
            } else {
                System.out.println("Login failed ");
            }
        }
    }


