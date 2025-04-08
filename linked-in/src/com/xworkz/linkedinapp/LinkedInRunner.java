package com.xworkz.linkedinapp;
import com.xworkz.linkedinapp.linkedin.LinkedInDto;
import com.xworkz.linkedinapp.register.LinkedInSignIn;

public class LinkedInRunner {
        public static void main(String[] args) {

            LinkedInDto user = new LinkedInDto();
            user.setUsername("harshitha123");
            user.setFullName("Harshitha Shree");
            user.setEmail("harshitha@linkedin.com");
            user.setPassword("linkedInPass1");
            user.setConfirmPassword("linkedInPass1");
            user.setContactNumber(9876543210L);

            LinkedInSignIn login = new LinkedInSignIn();
            boolean result = login.startSession(user);

        }
    }


