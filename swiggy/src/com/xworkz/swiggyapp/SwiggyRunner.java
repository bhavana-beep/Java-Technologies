package com.xworkz.swiggyapp;
import com.xworkz.swiggyapp.userdata.SwiggyUserDto;
import com.xworkz.swiggyapp.signup.Swiggy;
public class SwiggyRunner
{

        public static void main(String[] args) {
            SwiggyUserDto user1 = new SwiggyUserDto();
            user1.setEmail("customer@swiggy.com");
            user1.setPhoneNumber("8080808080");
            user1.setPassword("SwiggyFood@2024");
            user1.setName("Ravi Kumar");
            user1.setLocation("Indiranagar, Bangalore");

            Swiggy swiggy = new Swiggy();
            if (swiggy.userSignUp(user1)) {
                System.out.println("Swiggy Registration Successful!");
            } else {
                System.out.println("Swiggy Registration Failed!");
            }
        }


}
