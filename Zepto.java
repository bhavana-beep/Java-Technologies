class Zepto
{                                      
	public static double zeptoOrder(String foodName)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Lassi")
		{
		  foodPrice = 150.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Cold Coffee")
		{
		  foodPrice = 500.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Watermelon Juice")
		{
		  foodPrice = 110.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Oreo Shake")
		{
		  foodPrice = 230.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pineapple Ice Cream")
		{
		  foodPrice = 270.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Ras Malai")
		{
		  foodPrice = 150.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Idli with Sambar")
		{
		  foodPrice = 80.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Vada")
		{
		  foodPrice = 40.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pongal")
		{
		  foodPrice = 140.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mysore Pak 1/2 kg")
		{
		  foodPrice = 210.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Ragi Mudde")
		{
		  foodPrice = 70.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kebab Platter")
		{
		  foodPrice = 290.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Crispy Mushroom Rice Bowl")
		{
		  foodPrice = 240.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Peri Peri Potato Rice Bowl")
		{
		  foodPrice = 230.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer and Potato Rice Bowl")
		{
		  foodPrice = 260.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "California Burrito")
		{
		  foodPrice = 220.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Samosa")
		{
		  foodPrice = 100.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Dal Khichdi")
		{
		  foodPrice = 160.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Biryani")
		{
		  foodPrice = 220.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Kebab")
		{
		  foodPrice = 210.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Butter Masala")
		{
		  foodPrice = 260.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mutton Biryani")
		{
		  foodPrice = 320.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chole Bhature")
		{
		  foodPrice = 190.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Gobi Manchurian")
		{
		  foodPrice = 160.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Butter Chicken")
		{
		  foodPrice = 340.00;
		  return foodPrice;
		}
		
		else if(foodName == "Fish Curry")
		{
		  foodPrice = 360.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Hakka Noodles")
		{
		  foodPrice = 230.00;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer Butter Masala")
		{
		  foodPrice = 260.00;
		  return foodPrice;
		}
		
		else if(foodName == "Malai Kofta")
		{
		  foodPrice = 280.00;
		  return foodPrice;
		}
		
		else if(foodName == "Aloo Paratha")
		{
		  foodPrice = 160.00;
		  return foodPrice;
		}
		
		else if(foodName == "Chicken Tikka Masala")
		{
		  foodPrice = 290.00;
		  return foodPrice;
		}
		
		else if(foodName == "Mutton Rogan Josh")
		{
		  foodPrice = 360.00;
		  return foodPrice;
		}
		
		else if(foodName == "Veg Thali")
		{
		  foodPrice = 240.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Shawarma")
		{
		  foodPrice = 200.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pasta Alfredo")
		{
		  foodPrice = 360.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Veg Sandwich")
		{
		  foodPrice = 170.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Burger")
		{
		  foodPrice = 180.00;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer Tikka")
		{
		  foodPrice = 290.00;
		  return foodPrice;
		}
		
		else if(foodName == "Falafel Wrap")
		{
		  foodPrice = 220.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mango Lassi")
		{
		  foodPrice = 140.00;
		  return foodPrice;
		}
		
		else
		System.out.println("The Food item is not found");
	     return foodPrice;
	}
	
	
	
	
	
	
	
	
	public static double zeptoOrder(String foodName, int qty)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Lassi")
		{
		  foodPrice = 150.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Cold Coffee")
		{
		  foodPrice = 500.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Watermelon Juice")
		{
		  foodPrice = 110.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Oreo Shake")
		{
		  foodPrice = 230.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pineapple Ice Cream")
		{
		  foodPrice = 270.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Ras Malai")
		{
		  foodPrice = 150.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Idli with Sambar")
		{
		  foodPrice = 80.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Vada")
		{
		  foodPrice = 40.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pongal")
		{
		  foodPrice = 140.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mysore Pak 1/2 kg")
		{
		  foodPrice = 210.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Ragi Mudde")
		{
		  foodPrice = 70.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kebab Platter")
		{
		  foodPrice = 290.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Crispy Mushroom Rice Bowl")
		{
		  foodPrice = 240.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Peri Peri Potato Rice Bowl")
		{
		  foodPrice = 230.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer and Potato Rice Bowl")
		{
		  foodPrice = 260.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "California Burrito")
		{
		  foodPrice = 220.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Samosa")
		{
		  foodPrice = 100.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Dal Khichdi")
		{
		  foodPrice = 160.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Biryani")
		{
		  foodPrice = 220.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Kebab")
		{
		  foodPrice = 210.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Butter Masala")
		{
		  foodPrice = 260.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mutton Biryani")
		{
		  foodPrice = 320.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chole Bhature")
		{
		  foodPrice = 190.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Gobi chilli Manchurian")
		{
		  foodPrice = 160.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Ghee Roast")
		{
		  foodPrice = 340.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Anjal Fish")
		{
		  foodPrice = 360.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Hakka Sheswaan Noodles")
		{
		  foodPrice = 230.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer Mashroom Butter Masala")
		{
		  foodPrice = 260.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Stuffed Garlic bread")
		{
		  foodPrice = 280.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Aloo Mutter Paneer")
		{
		  foodPrice = 160.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Sabudhaan Vada")
		{
		  foodPrice = 290.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Mutton Ghee Roast")
		{
		  foodPrice = 360.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Non Veg Thali")
		{
		  foodPrice = 240.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Jumbo Chicken Shawarma")
		{
		  foodPrice = 200.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pasta Alfredo")
		{
		  foodPrice = 360.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Sandwich")
		{
		  foodPrice = 170.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "MC Chicken Burger")
		{
		  foodPrice = 180.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Vada pav")
		{
		  foodPrice = 290.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Misel vada pav")
		{
		  foodPrice = 220.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Badam milk")
		{
		  foodPrice = 140.00  * qty;
		  return foodPrice;
		}
		
		else
		System.out.println("The Food item is not found");
	     return foodPrice;
	}
	
}
		
		
		