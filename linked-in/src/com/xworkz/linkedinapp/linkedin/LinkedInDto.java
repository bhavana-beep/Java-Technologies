package com.xworkz.linkedinapp.linkedin;

public class LinkedInDto {
        private String username;
        private String fullName;
        private String email;
        private String password;
        private String confirmPassword;
        private long contactNumber;

        // Setters
        public void setUsername(String username) {
            this.username = username;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }

        public void setContactNumber(long contactNumber) {
            this.contactNumber = contactNumber;
        }

        // Getters
        public String getUsername() {
            return username;
        }

        public String getFullName() {
            return fullName;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public String getConfirmPassword() {
            return confirmPassword;
        }

        public long getContactNumber() {
            return contactNumber;
        }
    }


