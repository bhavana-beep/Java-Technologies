package com.xworkz.ebayapp.ebayregistration;

import com.xworkz.ebayapp.ebay.EbayDto;

public class EbayRegister {

        public boolean register(EbayDto ebayDto) {
            boolean isRegistered = false;

            boolean isValidated = validateUserRegister(ebayDto);
            if (isValidated == true)
                isRegistered = true;
            else System.out.println("User is not registered ..Try again later");
            return isRegistered;
        }


        public  boolean validateUserRegister(EbayDto ebayDto) {
            boolean validUser = false;
            boolean isFirstName = false;
            boolean isLastName = false;
            boolean isEmail = false;
            boolean isPassWord = false;

            // First Name Validation
            String firstName = ebayDto.getFirstName();
            if (firstName != null && !firstName.isEmpty() && firstName.length() > 3) {
                isFirstName = true;
            } else {
                System.out.println("Please give the proper firstName");
            }

            // Last Name Validation
            String lastName = ebayDto.getLastName();
            if (lastName != null && !lastName.isEmpty() && lastName.length() > 1) {
                isLastName = true;
            } else {
                System.out.println("Invalid lastName");
            }

            // Email Validation
            String email = ebayDto.getEmail();
            if (email != null && !email.isEmpty()) {
                isEmail = true;
            } else {
                System.out.println("Inappropriate email format");
            }

            // Password Validation
            String passWord = ebayDto.getPassWord();
            if (passWord != null && !passWord.isEmpty() && passWord.length() >= 8) {
                isPassWord = true;
            } else {
                System.out.println("Invalid passWord (must be at least 8 characters)");
            }

            // Final validation check
            if (isFirstName && isLastName && isEmail && isPassWord) {
                validUser = true;
            }

            return validUser;
        }

    }

