package com.xworkz.bobworldapp.userdata;

public class BobWorldUserDto
{

        private String email;
        private String mobileNumber;
        private String password;
        private String fullName;
        private String aadharNumber;
        private String accountType;

        public BobWorldUserDto() {
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setAadharNumber(String aadharNumber) {
            this.aadharNumber = aadharNumber;
        }

        public String getAadharNumber() {
            return aadharNumber;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public String getAccountType() {
            return accountType;
        }
    }


