package com.xworkz.snapdealapp.snapdeal;

public class SnapDealDto {

        private String emailId ;
        private long mobileNumber ;
        private String name ;
        private String dob;
        private String passWord;

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setMobileNumber(long mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public long getMobileNumber() {
            return mobileNumber;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getDob() {
            return dob;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }

        public String getPassWord() {
            return passWord;
        }
    }


