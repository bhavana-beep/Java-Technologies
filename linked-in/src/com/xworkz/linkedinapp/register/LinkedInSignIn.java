package com.xworkz.linkedinapp.register;
import com.xworkz.linkedinapp.linkedin.LinkedInDto;

public class LinkedInSignIn {

        public boolean startSession(LinkedInDto dto) {
            boolean isLoggedIn = false;

            boolean userStatus = checkUserData(dto);
            if (userStatus) {
                isLoggedIn = true;
                System.out.println("Successfully signed in to LinkedIn!");
            } else {
                System.out.println("Login failed! Please check your details.");
            }

            return isLoggedIn;
        }

        public boolean checkUserData(LinkedInDto dto) {
            boolean isValid = false;

            boolean usernameOk = false;
            boolean fullNameOk = false;
            boolean emailOk = false;
            boolean passwordOk = false;
            boolean confirmOk = false;
            boolean phoneOk = false;

            String username = dto.getUsername();
            if (username != null && !username.isEmpty()) {
                usernameOk = true;
            } else {
                System.out.println("Username cannot be empty");
            }

            String name = dto.getFullName();
            if (name != null && !name.isEmpty() && name.length() >= 3) {
                fullNameOk = true;
            } else {
                System.out.println("Full name is not valid");
            }

            String email = dto.getEmail();
            if (email != null && email.contains("@")) {
                emailOk = true;
            } else {
                System.out.println("Invalid email");
            }

            String pass = dto.getPassword();
            if (pass != null && pass.length() >= 6) {
                passwordOk = true;
            } else {
                System.out.println("Password should be minimum 6 characters");
            }

            String confirm = dto.getConfirmPassword();
            if (confirm != null && confirm.equals(pass)) {
                confirmOk = true;
            } else {
                System.out.println("Password and confirm password do not match");
            }

            long phone = dto.getContactNumber();
            if (String.valueOf(phone).length() == 10) {
                phoneOk = true;
            } else {
                System.out.println("Invalid contact number");
            }

            if (usernameOk && fullNameOk && emailOk && passwordOk && confirmOk && phoneOk) {
                isValid = true;
            }

            return isValid;
        }
    }


