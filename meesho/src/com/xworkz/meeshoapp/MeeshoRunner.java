package com.xworkz.meeshoapp;
import com.xworkz.meeshoapp.userdata.MeeshoUserDto;
import com.xworkz.meeshoapp.signup.Meesho;
public class MeeshoRunner
{

        public static void main(String[] args) {
            MeeshoUserDto user1 = new MeeshoUserDto();
            user1.setEmail("seller@meesho.com");
            user1.setPhoneNumber("9876543210");
            user1.setPassword("SellNow@2024");
            user1.setFullName("Sneha Kapoor");
            user1.setBusinessName("Sneha Fashion Hub");

            Meesho meesho = new Meesho();
            if (meesho.userSignUp(user1)) {
                System.out.println("Meesho Registration Successful!");
            } else {
                System.out.println("Meesho Registration Failed!");
            }
        }
    }


