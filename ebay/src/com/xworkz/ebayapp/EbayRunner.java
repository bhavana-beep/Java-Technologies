package com.xworkz.ebayapp;

import com.xworkz.ebayapp.ebay.EbayDto;
import com.xworkz.ebayapp.ebayregistration.EbayRegister;

public class EbayRunner {
    public static void main(String[] args) {

        EbayDto ebayDto = new EbayDto();
        ebayDto.setFirstName("Baba");
        ebayDto.setLastName("Singh");
        ebayDto.setEmail("babaaa56@gmail.com");
        ebayDto.setPassWord("bahsjkk808");

        EbayRegister ebayRegister = new EbayRegister();
        boolean isValid = ebayRegister.register(ebayDto);

        if (isValid == true) {
            System.out.println("Registration successful");
        } else {
            System.out.println("Registration unsuccessful");

        }

    }
}
