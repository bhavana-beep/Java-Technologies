package com.xworkz.supermarket;
import com.xworkz.supermarket.supermarket.Supermarket;
import com.xworkz.supermarket.section.Section;
import com.xworkz.supermarket.product.Product;
public class SupermarketRunner
{
    public static void main(String args[])
    {
        Supermarket market=new Supermarket();
         market.supermarketId=1;
         market.supermarketName="Vishal Mart";
         market.location="banglore";
         market.noOfSections=1;
         Section sections[]=new Section[1];
         Section section1=new Section();
         section1.sectionId=1;
         section1.sectionName="Ice Cream";
         section1.noOfProducts=1;
         Product products[]=new Product[1];
         Product p1=new Product();
         p1.productId=1;
         p1.productName="Straberry IceCream";
         p1.price=50.00;
         String ingredients[]={"milk","strawberry"};
         p1.ingredients=ingredients;
         products[0]=p1;
         section1.products=products;
         sections[0]=section1;
         market.sections=sections;
         market.getSupermarketInfo();

    }
}
