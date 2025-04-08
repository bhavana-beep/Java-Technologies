package com.xworkz.supermarket.section;
import com.xworkz.supermarket.product.Product;
public class Section
{
   public int sectionId;
    public String sectionName;
    public int noOfProducts;
   public Product products[];

   public void getSectionInfo()
   {
       System.out.println("Section Id : "+sectionId);
       System.out.println("Section Name : "+sectionName);
       System.out.println("No of products in Section  : "+noOfProducts);

       System.out.println("Products list in "+sectionName +" are ");
       for(Product product:products)
           product.getProductInfo();

   }



}
