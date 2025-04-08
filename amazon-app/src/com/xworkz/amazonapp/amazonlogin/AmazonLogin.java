package com.xworkz.amazonapp.amazonlogin;

import com.xworkz.amazonapp.amazon.AmazonDto;


public class AmazonLogin {

    private String emailId;

    public boolean  signIn(AmazonDto amazonDto){

    boolean isSignIn = false;
        boolean userValidated = userProfileValidate(amazonDto);
        if(userValidated == true)
            isSignIn = true ;
        else System.out.println("User is not registered ..Try again later");
        return isSignIn;
    }

    public  boolean userProfileValidate(AmazonDto amazonDto)
    {
        boolean userValid = false;
        boolean isemailIdValid = false;
        boolean isphoneNumber = false;
        boolean isfullName = false;
        boolean ispassWord = false;
        boolean isconfirmPassword = false;

//emailId
        String emailId = amazonDto.getEmailId();
        if(emailId != null && !emailId.isEmpty()){
            isemailIdValid = true;
        }
        else{
            System.out.println("EmailId is invalid");
        }

//phoneNumber
        String phoneNumber = amazonDto.getPhoneNumber();
        if(phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() > 0 && phoneNumber.length() == 10){
            isphoneNumber = true;
        }
        else{
            System.out.println("Please give the right number");
        }

//fullName
        String fullName = amazonDto.getFullName();
        if(fullName != null && !fullName.isEmpty() && fullName.length() >= 3){
            isfullName = true;
        }
        else{
            System.out.println("fullName is invalid");
        }

//password
        String password = amazonDto.getPassword();
        if(password != null && !password.isEmpty() && password.length() >= 8 ){
            ispassWord = true;
        }
        else{
            System.out.println("Password is incorrect... please enter correct password");
        }

//confirmPassword
        String confirmPassword = amazonDto.getConfirmPassword();
        if(confirmPassword != null && !confirmPassword.isEmpty() && confirmPassword.length() == password.length()){
            isconfirmPassword = true;
            System.out.println("password is matching");
        }
        else{
            System.out.println("Password is not matching.. please enter correct password");
        }

        if(isemailIdValid == true && isphoneNumber == true && isfullName == true && ispassWord == true && isconfirmPassword == true){
            userValid = true;
        }
        return userValid;
    }
}

