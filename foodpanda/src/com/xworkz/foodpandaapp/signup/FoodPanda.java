package com.xworkz.foodpandaapp.signup;
import com.xworkz.foodpandaapp.userdata.FoodPandaUserDto;
public class FoodPanda
{

        public boolean userSignUp(FoodPandaUserDto user) {
            return userValidation(user);
        }

        public boolean userValidation(FoodPandaUserDto user) {
            boolean isEmailValid = false;
            boolean isPhoneValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;
            boolean isAddressValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: Please enter a valid email.");
            }

            if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
                isPhoneValid = true;
            } else {
                System.out.println("Invalid Phone Number: It must be 10 digits.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Length should be between 8 and 16 characters.");
            }

            if (user.getFullName() != null && !user.getFullName().isEmpty() && user.getFullName().length() <= 50) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name: Cannot be empty.");
            }

            if (user.getAddress() != null && !user.getAddress().isEmpty()) {
                isAddressValid = true;
            } else {
                System.out.println("Invalid Address: Please provide your delivery address.");
            }

            return isEmailValid && isPhoneValid && isPasswordValid && isFullNameValid && isAddressValid;
        }
    }

