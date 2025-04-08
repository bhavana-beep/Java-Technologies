package com.xworkz.passportapp.generatepassport;

import com.xworkz.passportapp.passport.PassportDto;

public class Passport
{
    public boolean registerUser(PassportDto passportDto)
    {

        if(validateUser(passportDto))
            return true;
        else
            return false;

    }
    public boolean validateUser(PassportDto dto)
    {
        boolean isUserValid=false;
        boolean isDcdrLocation=false;
        boolean isCpvLocationValid=false;
        boolean isNameValid=false;
        boolean isSurNameValid=false;
        boolean isDobValid=false;
        boolean isEmailValid=false;
        boolean isLoginSameAsEmailValid=false;
        boolean isLoginValid=false;
        boolean isPasswordValid=false;
        boolean isConfirmPasswordValid=false;
        boolean isHintQuesValid=false;
        boolean isHintAnsValid=false;
        boolean isCaptchaValid=false;

        if(dto.getDcdrLocation()!=null)
        {
            isDcdrLocation=true;
        }
        else {
            System.out.println("Please select one of the field of DCDR Location");
        }

        if(dto.getCpvLocation()!=null)
        {
            isCpvLocationValid=true;
        }
        else {
            System.out.println("Please select the one of the field of CPVLocation");
        }

        if(dto.getGivenName()!=null&&dto.getGivenName().length()>0&&dto.getGivenName().length()<=45)
        {
            isNameValid=true;
        }
        else {
            System.out.println("Please provide a valid Name");
        }

        if(dto.getSurName()!=null && dto.getSurName().length()>0 && dto.getSurName().length()<=45)
        {
            isSurNameValid=true;
        }
        else
        {
            System.out.println("SurName Invalid Please provide a valid Surname");
        }

        if(dto.getDob()!=null)
        {
            isDobValid=true;
        }
        else {
            System.out.println("DOB Invalid Pleas provide a Valid DOB");
        }

        if(dto.getEmail()!=null)
        {
            isEmailValid=true;
        }
        else {
            System.out.println("Invalid Email Please provide a valid emailId");
        }

        if(dto.getIsEmailLoginSame() || dto.getIsEmailLoginSame()==false)
        {
            isLoginSameAsEmailValid=true;
        }
        else {
            System.out.println("Please select whether email is same as login");
        }

        if(dto.getLoginId()!=null)
        {
            isLoginValid=true;
        }
        else {
            System.out.println("Invalid Login Id please provide a valid login Id");
        }

        if(dto.getPassword()!=null && dto.getPassword().length()>=8 && dto.getPassword().length()<=16)
        {
            isPasswordValid=true;
        }
        else {
            System.out.println("Invalid Password Please provide a vadid password");
        }
        if(dto.getConfirmPassword()!=null && dto.getConfirmPassword().length()>=8 && dto.getConfirmPassword().length()<=16)
        {
            isConfirmPasswordValid=true;
        }
        else {
            System.out.println("Password does not Match");
        }
        if(dto.getHintQues()!=null)
        {
            isHintQuesValid=true;
        }
        else {
            System.out.println("Invalid Hint Question please provide valid Hint Question");
        }
        if(dto.getHintAns()!=null)
        {
            isHintAnsValid=true;
        }
        else {
            System.out.println("Please provide valid Hint Answer");
        }
        if(dto.getCaptcha()!=null && dto.getCaptcha().length()==8)
        {
            isCaptchaValid=true;
        }
        else {
            System.out.println("Invalid Captcha Please  enter the valid captcha");
        }
        if(isDcdrLocation && isCpvLocationValid && isNameValid && isSurNameValid && isDobValid && isEmailValid && isLoginSameAsEmailValid && isLoginValid && isPasswordValid && isConfirmPasswordValid && isHintQuesValid && isHintAnsValid && isCaptchaValid)
            isUserValid=true;
        return isUserValid;


    }

}
