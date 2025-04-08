package com.xworkz.facebookapp;
import com.xworkz.facebookapp.userdata.FaceBookUserDto;
import com.xworkz.facebookapp.signup.FaceBook;
public class FaceBookRunner
{


        public static void main(String[] args) {
            FaceBookUserDto user1 = new FaceBookUserDto();
            user1.setEmail("friend@facebook.com");
            user1.setPhoneNumber("9123456789");
            user1.setPassword("FbConnect@2024");
            user1.setFullName("Akhil Reddy");
            user1.setDateOfBirth("10-05-2000");

            FaceBook facebook = new FaceBook();
            if (facebook.userSignUp(user1)) {
                System.out.println("Facebook Registration Successful!");
            } else {
                System.out.println("Facebook Registration Failed!");
            }
        }
    }


