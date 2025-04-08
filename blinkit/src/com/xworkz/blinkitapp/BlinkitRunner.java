package com.xworkz.blinkitapp;
import com.xworkz.blinkitapp.userdata.BlinkitUserDto;
import com.xworkz.blinkitapp.signup.Blinkit;
public class BlinkitRunner
{

        public static void main(String[] args) {
            BlinkitUserDto user1 = new BlinkitUserDto();
            user1.setEmail("quickgroceries@blinkit.com");
            user1.setPhoneNumber("9001122334");
            user1.setPassword("Blinkit@2025");
            user1.setFullName("Sneha Verma");
            user1.setDeliveryAddress("JP Nagar, Bangalore");

            Blinkit blinkit = new Blinkit();
            if (blinkit.userSignUp(user1)) {
                System.out.println("Blinkit Registration Successful!");
            } else {
                System.out.println("Blinkit Registration Failed!");
            }
        }
    }


