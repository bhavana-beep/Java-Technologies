package com.xworkz.passportapp;
import com.xworkz.passportapp.constants.CpvLocation;
import com.xworkz.passportapp.constants.Location;
import com.xworkz.passportapp.passport.PassportDto;
import com.xworkz.passportapp.generatepassport.Passport;
public class PassportRunner
{
    public static void main(String args[])
    {
        PassportDto user1=new PassportDto();
        user1.setCpvLocation(CpvLocation.PASSPORT_OFFICE);
        user1.setDcdrLocation(Location.BANGLORE);
        user1.setGivenName("Baba");
        user1.setSurName("Ram Dev");
        user1.setDob("12-12-1890");
        user1.setEmail("baba@gmail.com");
        user1.setIsEmailLoginSame(true);
        user1.setLoginId("baba@gmail.com");
        user1.setPassword("baba@123");
        user1.setConfirmPassword("baba@123");
        user1.setHintQues("Your favorite color");
        user1.setHintAns("Pink");
        user1.setCaptcha("DNBGC123");

        Passport validateUser1=new Passport();
       if(validateUser1.validateUser(user1))
           System.out.println("User Registration Successfull");
       else
           System.out.println("User Registration Unsuccessfull");





    }
}
