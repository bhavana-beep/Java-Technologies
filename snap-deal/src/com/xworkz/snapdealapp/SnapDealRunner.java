package com.xworkz.snapdealapp;

import com.xworkz.snapdealapp.register.SnapDealRegistration;
import com.xworkz.snapdealapp.snapdeal.SnapDealDto;

public class SnapDealRunner {
    public static void main(String[] args) {


        SnapDealDto snapDealDto = new SnapDealDto();
        snapDealDto.setEmailId("john567@gmail.com");
        snapDealDto.setMobileNumber(3456789090L);
        snapDealDto.setName("John Smith");
        snapDealDto.setDob("08-02-2001");
        snapDealDto.setPassWord("john07%809");

        SnapDealRegistration snapDealRegistration = new SnapDealRegistration();
        boolean msg = snapDealRegistration.userRegistrationValidation(snapDealDto);

        if(msg == true)
            System.out.println("Registration Successful");
        else
            System.out.println("Registration unsuccessful");
    }
}
