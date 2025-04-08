package com.xworkz.twitterapp.signin;
import com.xworkz.twitterapp.twitter.TwitterDto;

public class TwitterSignIn {

        public boolean beginSession(TwitterDto dto) {
            boolean isSessionStarted = false;

            boolean isValidUser = validateUserInfo(dto);
            if (isValidUser) {
                isSessionStarted = true;
                System.out.println("Logged in to Twitter successfully!");
            } else {
                System.out.println("Login failed. Check details and try again.");
            }

            return isSessionStarted;
        }

        public boolean validateUserInfo(TwitterDto dto) {
            boolean valid = false;

            boolean isHandleOk = false;
            boolean isNameOk = false;
            boolean isEmailOk = false;
            boolean isPassOk = false;
            boolean isConfirmOk = false;
            boolean isMobileOk = false;

            String handle = dto.getHandle();
            if (handle != null && !handle.isEmpty()) {
                isHandleOk = true;
            } else {
                System.out.println("Invalid Twitter handle");
            }

            String name = dto.getDisplayName();
            if (name != null && !name.isEmpty()) {
                isNameOk = true;
            } else {
                System.out.println("Display name cannot be empty");
            }

            String email = dto.getEmail();
            if (email != null && email.contains("@")) {
                isEmailOk = true;
            } else {
                System.out.println("Invalid email address");
            }

            String pass = dto.getPassword();
            if (pass != null && pass.length() >= 6) {
                isPassOk = true;
            } else {
                System.out.println("Password must be at least 6 characters");
            }

            String confirm = dto.getConfirmPassword();
            if (confirm != null && confirm.equals(pass)) {
                isConfirmOk = true;
            } else {
                System.out.println("Passwords do not match");
            }

            long phone = dto.getMobileNumber();
            if (String.valueOf(phone).length() == 10) {
                isMobileOk = true;
            } else {
                System.out.println("Invalid mobile number");
            }

            if (isHandleOk && isNameOk && isEmailOk && isPassOk && isConfirmOk && isMobileOk) {
                valid = true;
            }

            return valid;
        }
    }


