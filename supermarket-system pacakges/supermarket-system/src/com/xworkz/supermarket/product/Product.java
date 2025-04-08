package com.xworkz.supermarket.product;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Product
{
    public int productId;
    public String productName;
    public double price;
    public String ingredients[];



    public void getProductInfo()
    {
        System.out.println("Product Id : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("Product price : "+price);
        System.out.println("Ingredients for "+productName+" are ");
        for(String ingredient:ingredients)
            System.out.print(ingredient+" ");



    }

}
