package com.xworkz.myntraapp.myntralogin;

import com.xworkz.myntraapp.myntra.MyntraDto;

public class MyntraLogin {

        public boolean logIn(MyntraDto myntraDto)
        {
            boolean isLogin = false;

            boolean row = validUserProfile(myntraDto);
            if(row == true)
                isLogin = true ;
            else System.out.println("User is not registered ..Try again later");
            return isLogin;

        }

        public  boolean validUserProfile(MyntraDto myntraDto)
        {
            boolean validUser = false;
            boolean isphoneNumber = false;
            boolean isfullName = false;
            boolean isemailId = false;
            boolean isgender = false;
            boolean isdob = false;
            boolean islocation = false;


//phoneNumber
            double phoneNumber = myntraDto.getPhoneNumber();
            if(phoneNumber != 0.0 ){
                isphoneNumber = true;
            }
            else{
                System.out.println("Invalid phoneNumber");
            }

//fullName
            String fullName = myntraDto.getFullName();
            if(fullName != null && !fullName.isEmpty() && fullName.length() > 3 ){
                isfullName = true;
            }
            else{
                System.out.println("please provide valid fullName");
            }

//emailId
            String emailId = myntraDto.getEmailId();
            if(emailId != null && !emailId.isEmpty() ){
                isemailId = true;
            }
            else{
                System.out.println("please provide valid emailId");
            }

//gender

            if(myntraDto.getGender() != null){
                isgender = true;
            }
            else{
                System.out.println("please provide proper gender");
            }

//dob
            String dob = myntraDto.getDob();
            if(dob != null && !dob.isEmpty() ){
                isdob = true;
            }
            else{
                System.out.println("please enter correct dob");
            }

//location
            String location = myntraDto.getLocation();
            if(location != null && !location.isEmpty() ){
                islocation = true;
            }
            else{
                System.out.println("Invalid location");
            }

            if(isphoneNumber == true && isfullName == true  && isemailId == true && isgender == true && isdob == true && islocation == true){
                validUser = true;
            }
            return validUser;
        }
    }

