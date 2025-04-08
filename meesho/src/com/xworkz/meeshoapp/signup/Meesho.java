package com.xworkz.meeshoapp.signup;
import com.xworkz.meeshoapp.userdata.MeeshoUserDto;
public class Meesho
{

        public boolean userSignUp(MeeshoUserDto user) {
            return userValidation(user);
        }

        public boolean userValidation(MeeshoUserDto user) {
            boolean isEmailValid = false;
            boolean isPhoneValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;
            boolean isBusinessNameValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: Please provide a valid email.");
            }

            if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
                isPhoneValid = true;
            } else {
                System.out.println("Invalid Phone Number: Must be 10 digits.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Must be between 8 and 16 characters.");
            }

            if (user.getFullName() != null && user.getFullName().length() > 0 && user.getFullName().length() <= 50) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name: Please enter your name.");
            }

            if (user.getBusinessName() != null && !user.getBusinessName().isEmpty()) {
                isBusinessNameValid = true;
            } else {
                System.out.println("Invalid Business Name: Please provide your business/store name.");
            }

            return isEmailValid && isPhoneValid && isPasswordValid && isFullNameValid && isBusinessNameValid;
        }
    }


