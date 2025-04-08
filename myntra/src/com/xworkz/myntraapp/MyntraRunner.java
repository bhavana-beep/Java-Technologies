package com.xworkz.myntraapp;

import com.xworkz.myntraapp.constants.Gender;
import com.xworkz.myntraapp.myntra.MyntraDto;
import com.xworkz.myntraapp.myntralogin.MyntraLogin;

public class MyntraRunner {
    public static void main(String[] args) {


        MyntraDto myntraDto = new MyntraDto();
        myntraDto.setPhoneNumber(562851890L);
        myntraDto.setFullName("Prithiv");
        myntraDto.setEmailId("priii56@gmail.com");
        myntraDto.setGender(Gender.MALE);
        myntraDto.setDob("09-05-2000");
        myntraDto.setLocation("Bangalore");

        MyntraLogin myntraLogin = new MyntraLogin();
        boolean isValid = myntraLogin.logIn(myntraDto);

        if (isValid == true) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login unsuccessful");

        }
    }
    }

