package com.xworkz.ajioapp;
import com.xworkz.ajioapp.userdata.AjioUserDto;
import com.xworkz.ajioapp.signup.Ajio;
public class AjioRunner
{

        public static void main(String[] args) {
            AjioUserDto user = new AjioUserDto();
            user.setEmail("fashionista@ajio.com");
            user.setMobileNumber("9876543210");
            user.setPassword("Ajio@2025");
            user.setFullName("Ananya Rao");
            user.setGender("Female");

            Ajio ajio = new Ajio();
            if (ajio.userSignUp(user)) {
                System.out.println("Ajio Registration Successful!");
            } else {
                System.out.println("Ajio Registration Failed!");
            }
        }
    }


