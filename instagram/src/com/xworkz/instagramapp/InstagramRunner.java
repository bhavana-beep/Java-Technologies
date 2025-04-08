package com.xworkz.instagramapp;
import com.xworkz.instagramapp.userdata.UserDataDto;
import com.xworkz.instagramapp.signup.Instagram;

public class InstagramRunner
{
    public static void main(String[] args)
    {
        UserDataDto user1=new UserDataDto();
        user1.setEmail("Baba@gmail.com");
        user1.setDob("12-12-1890");
        user1.setName("Baba Ram Dev");
        user1.setUserName("Baba");
        user1.setPassword("Baba@123");

        Instagram user=new Instagram();
        if(user.userSignUp(user1))
            System.out.println("User Registration Successfull");
        else
            System.out.println("User Registration Unsuccessfull");

    }

}
