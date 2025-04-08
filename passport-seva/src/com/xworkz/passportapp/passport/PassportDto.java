package com.xworkz.passportapp.passport;
import com.xworkz.passportapp.constants.*;
public class PassportDto
{
    private CpvLocation cpvLocation;
    private Location dcdrLocation;
    private String givenName;
    private String surName;
    private String dob;
    private String email;
    private boolean isEmailLoginSame;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQues;
    private String hintAns;
    private String captcha;

    public PassportDto()
    {
    }
    public void setCpvLocation(CpvLocation location)
    {
        cpvLocation=location;
    }
    public CpvLocation getCpvLocation()
    {
        return cpvLocation;
    }

    public void setDcdrLocation(Location location)
    {
        dcdrLocation=location;
    }
    public Location getDcdrLocation()
    {
        return dcdrLocation;
    }

    public void setGivenName(String name)
    {
        givenName=name;
    }
    public String getGivenName()
    {
        return givenName;
    }

    public void setSurName(String name)
    {
        surName=name;
    }
    public String getSurName()
    {
        return surName;
    }
    public  void setDob(String dob)
    {
        this.dob=dob;
    }
    public String getDob()
    {
        return dob;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setIsEmailLoginSame(boolean isSame)
    {
        isEmailLoginSame=isSame;
    }
    public boolean getIsEmailLoginSame()
    {
        return isEmailLoginSame;
    }

    public void setLoginId(String loginId)
    {
        this.loginId=loginId;
    }
    public String getLoginId()
    {
        return loginId;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return password;
    }

    public void setConfirmPassword(String confirmPassword)
    {
        this.confirmPassword=confirmPassword;
    }
    public String getConfirmPassword()
    {
        return confirmPassword;
    }

    public void setHintQues(String hintQues)
    {
        this.hintQues=hintQues;
    }
    public String getHintQues()
    {
        return hintQues;
    }

    public void setHintAns(String hintAns)
    {
        this.hintAns=hintAns;
    }
    public String getHintAns()
    {
        return hintAns;
    }

    public void setCaptcha(String captcha)
    {
        this.captcha=captcha;
    }
    public String getCaptcha()
    {
        return captcha;
    }
}
