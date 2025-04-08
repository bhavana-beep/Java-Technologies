package com.xworkz.bobworldapp.signup;
import com.xworkz.bobworldapp.userdata.BobWorldUserDto;
public class BobWorld
{

        public boolean userSignUp(BobWorldUserDto user) {
            return userValidation(user);
        }

        public boolean userValidation(BobWorldUserDto user) {
            boolean isEmailValid = false;
            boolean isMobileValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;
            boolean isAadharValid = false;
            boolean isAccountTypeValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email");
            }

            if (user.getMobileNumber() != null && user.getMobileNumber().matches("\\d{10}")) {
                isMobileValid = true;
            } else {
                System.out.println("Invalid Mobile Number: Must be 10 digits.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: At least 8 characters required.");
            }

            if (user.getFullName() != null && !user.getFullName().isEmpty()) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name");
            }

            if (user.getAadharNumber() != null && user.getAadharNumber().matches("\\d{12}")) {
                isAadharValid = true;
            } else {
                System.out.println("Invalid Aadhar Number: Must be 12 digits.");
            }

            if (user.getAccountType() != null &&
                    (user.getAccountType().equalsIgnoreCase("Savings") ||
                            user.getAccountType().equalsIgnoreCase("Current"))) {
                isAccountTypeValid = true;
            } else {
                System.out.println("Invalid Account Type: Must be 'Savings' or 'Current'");
            }

            return isEmailValid && isMobileValid && isPasswordValid && isFullNameValid && isAadharValid && isAccountTypeValid;
        }
    }


