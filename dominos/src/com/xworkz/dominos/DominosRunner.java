package com.xworkz.dominos;
import com.xworkz.dominos.userdata.DominosUserDto;
import com.xworkz.dominos.signup.Dominos;
public class DominosRunner
{

        public static void main(String[] args) {
            DominosUserDto user1 = new DominosUserDto();
            user1.setEmail("pizza.lover@dominos.com");
            user1.setPhoneNumber("9876543210");
            user1.setPassword("Dominos@2025");
            user1.setFullName("Rahul Sharma");
            user1.setDeliveryAddress("MG Road, Pune");

            Dominos dominos = new Dominos();
            if (dominos.userSignUp(user1)) {
                System.out.println("Dominos Registration Successful!");
            } else {
                System.out.println("Dominos Registration Failed!");
            }
        }
    }


