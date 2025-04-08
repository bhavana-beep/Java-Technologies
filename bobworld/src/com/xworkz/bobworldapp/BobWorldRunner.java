package com.xworkz.bobworldapp;
import com.xworkz.bobworldapp.userdata.BobWorldUserDto;
import com.xworkz.bobworldapp.signup.BobWorld;
public class BobWorldRunner
{


        public static void main(String[] args) {
            BobWorldUserDto user = new BobWorldUserDto();
            user.setEmail("user@bobworld.com");
            user.setMobileNumber("9876543210");
            user.setPassword("BOB@1234");
            user.setFullName("Rajesh Kumar");
            user.setAadharNumber("123456789012");
            user.setAccountType("Savings");

            BobWorld bob = new BobWorld();
            if (bob.userSignUp(user)) {
                System.out.println("BOB World Registration Successful!");
            } else {
                System.out.println("BOB World Registration Failed!");
            }
        }
    }

   


