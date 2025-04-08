package com.xworkz.supermarket.supermarket;
import com.xworkz.supermarket.section.Section;
public class Supermarket
{
   public int supermarketId;
   public String supermarketName;
   public String location;
   public int noOfSections;
   public Section sections[];

    public void getSupermarketInfo()
    {
        System.out.println("Supermarket Id : "+supermarketId);
        System.out.println("Supermarket Name : "+supermarketName);
        System.out.println("Supermarket location : "+location);
        System.out.println("No of sections in Supermarket  : "+noOfSections);

        System.out.println("Sections Info:");
        for(Section section:sections)
            section.getSectionInfo();





    }




}
