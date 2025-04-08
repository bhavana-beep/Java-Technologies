package com.xworkz.wikipediaapp;

import com.xworkz.wikipediaapp.wikipedia.WikiPediaDto;
import com.xworkz.wikipediaapp.login.WikipediaLogIn;

public class WikiPediaRunner {


        public static void main(String[] args) {

            WikiPediaDto wikiUser = new WikiPediaDto();
            wikiUser.setEmail("wiki.user@example.com");
            wikiUser.setUserName("wikiHarshi123");
            wikiUser.setUserPassword("Harshi@123");
            wikiUser.setRetypePassword("Harshi@123");
            wikiUser.setPreferredLanguage("English");

            WikipediaLogIn login = new WikipediaLogIn();
            boolean loginResult = login.processLogin(wikiUser);


        }
    }


