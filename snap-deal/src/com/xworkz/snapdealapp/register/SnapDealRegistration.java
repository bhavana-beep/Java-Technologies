package com.xworkz.snapdealapp.register;

import com.xworkz.snapdealapp.snapdeal.SnapDealDto;

public class SnapDealRegistration {

  public boolean registration(SnapDealDto snapDealDto) {
      boolean isRegister = false;

      boolean ref = userRegistrationValidation(snapDealDto);
      if (ref == true)
          isRegister = true;
      else
          System.out.println("user registration not success...Try again later");
      return isRegister;
  }

        public static boolean userRegistrationValidation(SnapDealDto snapDealDto ) {
            boolean validUser = false;
            boolean isemailId = false;
            boolean ismobileNumber = false;
            boolean isname = false;
            boolean isdob = false;
            boolean ispassWord = false;

//emailId
            String emailId = snapDealDto.getEmailId();
            if(emailId != null && !emailId.isEmpty()){
                isemailId = true;
            }
            else{
                System.out.println("Invalid emailId");
            }

//mobileNumber
            double mobileNumber = snapDealDto.getMobileNumber();
            if(mobileNumber != 0.0 ){
                ismobileNumber = true;
            }
            else{
                System.out.println("mobileNumber is incorrect");
            }

//name
            String  name = snapDealDto.getName();
            if(name != null && !name.isEmpty() && name.length() > 3){
                isname = true;
            }
            else{
                System.out.println("Name is not correct");
            }

//dob
            String dob = snapDealDto.getDob();
            if(dob != null && !dob.isEmpty()){
                isdob = true;
            }
            else{
                System.out.println("Incorect dob");
            }

//passWord
            String passWord = snapDealDto.getPassWord();
            if(passWord != null && !passWord.isEmpty() && passWord.length() >8){
                ispassWord = true;
            }
            else{
                System.out.println("Incorrect passWord");
            }

            if(isemailId == true && ismobileNumber == true && isname == true && isdob == true && ispassWord == true){
                validUser = true;
            }
            return validUser;
        }
    }

