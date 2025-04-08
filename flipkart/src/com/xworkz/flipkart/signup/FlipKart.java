package com.xworkz.flipkart.signup;
import com.xworkz.flipkart.userdata.FlipKartUserDto;
public class FlipKart
{

        public boolean userSignUp(FlipKartUserDto user) {
            return userValidation(user);
        }

        public boolean userValidation(FlipKartUserDto user) {
            boolean isEmailValid = false;
            boolean isPhoneValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;
            boolean isAddressValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: Please provide a valid email address.");
            }

            if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
                isPhoneValid = true;
            } else {
                System.out.println("Invalid Phone Number: It must be 10 digits.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Length should be 8–16 characters.");
            }

            if (user.getFullName() != null && !user.getFullName().isEmpty() && user.getFullName().length() <= 50) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Name: Please enter a valid full name.");
            }

            if (user.getShippingAddress() != null && !user.getShippingAddress().isEmpty()) {
                isAddressValid = true;
            } else {
                System.out.println("Invalid Shipping Address: Cannot be empty.");
            }

            return isEmailValid && isPhoneValid && isPasswordValid && isFullNameValid && isAddressValid;
        }
    }


