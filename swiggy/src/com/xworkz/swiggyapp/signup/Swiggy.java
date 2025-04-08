package com.xworkz.swiggyapp.signup;
import com.xworkz.swiggyapp.userdata.SwiggyUserDto;
public class Swiggy {

        public boolean userSignUp(SwiggyUserDto user) {
            return userValidation(user);
        }

        public boolean userValidation(SwiggyUserDto user) {
            boolean isEmailValid = false;
            boolean isPhoneValid = false;
            boolean isPasswordValid = false;
            boolean isNameValid = false;
            boolean isLocationValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email. Please enter a valid email ID.");
            }

            if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
                isPhoneValid = true;
            } else {
                System.out.println("Invalid Phone Number. Please provide a 10-digit number.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password. It should be 8-16 characters long.");
            }

            if (user.getName() != null && user.getName().length() > 0 && user.getName().length() <= 45) {
                isNameValid = true;
            } else {
                System.out.println("Invalid Name. Please enter a valid name.");
            }

            if (user.getLocation() != null && !user.getLocation().isEmpty()) {
                isLocationValid = true;
            } else {
                System.out.println("Invalid Location. Please provide your location.");
            }

            return isEmailValid && isPhoneValid && isPasswordValid && isNameValid && isLocationValid;
        }
    }


