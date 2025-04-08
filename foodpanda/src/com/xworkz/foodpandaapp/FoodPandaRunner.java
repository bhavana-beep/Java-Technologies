package com.xworkz.foodpandaapp;
import com.xworkz.foodpandaapp.userdata.FoodPandaUserDto;
import com.xworkz.foodpandaapp.signup.FoodPanda;
public class FoodPandaRunner
{

        public static void main(String[] args) {
            FoodPandaUserDto user1 = new FoodPandaUserDto();
            user1.setEmail("hungrybear@foodpanda.com");
            user1.setPhoneNumber("9012345678");
            user1.setPassword("PandaEats@2024");
            user1.setFullName("Ankita Joshi");
            user1.setAddress("Koramangala, Bangalore");

            FoodPanda foodpanda = new FoodPanda();
            if (foodpanda.userSignUp(user1)) {
                System.out.println("Foodpanda Registration Successful!");
            } else {
                System.out.println("Foodpanda Registration Failed!");
            }
        }
    }


