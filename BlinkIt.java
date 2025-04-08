class BlinkIt
{                                      
	public static double blinkOrder(String foodName)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Daawat Hyderabadi Biryani Kit")
		{
		  foodPrice = 450.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Habanero Flour Tortilla Wraps")
		{
		  foodPrice = 900.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Haldiram's Minute Khana Pao Bhaji")
		{
		  foodPrice = 450.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "iD Fresh Sambar (Heat & Eat)")
		{
		  foodPrice = 380.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Meaty Story American Chicken Popcorn")
		{
		  foodPrice = 389.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Fried Rice")
		{
		  foodPrice = 180.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Idli with Sambar")
		{
		  foodPrice = 165.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Lays")
		{
		  foodPrice = 35.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kova")
		{
		  foodPrice = 670.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kaju Barfi 1/2")
		{
		  foodPrice = 700.00;
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
	
	
	
	
	
	
	
	
	
	
	public static double blinkOrder(String foodName, int qty)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Daawat Hyderabadi Biryani Kit")
		{
		  foodPrice = 450.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Habanero Flour Tortilla Wraps")
		{
		  foodPrice = 900.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Haldiram's Minute Khana Pao Bhaji")
		{
		  foodPrice = 450.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "iD Fresh Sambar (Heat & Eat)")
		{
		  foodPrice = 380.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Meaty Story American Chicken Popcorn")
		{
		  foodPrice = 389.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Fried Rice")
		{
		  foodPrice = 180.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Idli with Sambar")
		{
		  foodPrice = 165.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Lays")
		{
		  foodPrice = 35.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kova")
		{
		  foodPrice = 670.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kaju Barfi 1/2")
		{
		  foodPrice = 700.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chilli Chicken")
		{
		  foodPrice = 170.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Non veg Kebab Platter")
		{
		  foodPrice = 290.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Rice Bowl")
		{
		  foodPrice = 240.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Peri Peri Mashroom Roll")
		{
		  foodPrice = 230.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer and Potato Rice Bowl")
		{
		  foodPrice = 260.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "California Burrito")
		{
		  foodPrice = 220.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Samosa")
		{
		  foodPrice = 100.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Dal Khichdi")
		{
		  foodPrice = 160.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Biryani")
		{
		  foodPrice = 220.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Kebab fry")
		{
		  foodPrice = 210.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Guntoor Chicken")
		{
		  foodPrice = 260.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mutton Biryani combo")
		{
		  foodPrice = 320.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chole Bhature")
		{
		  foodPrice = 190.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Veg ball Manchurian")
		{
		  foodPrice = 160.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Andhra chilli chicken")
		{
		  foodPrice = 340.00* qty;
		  return foodPrice;
		}
		
		else if(foodName == "Bangda Fish")
		{
		  foodPrice = 360.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Hakka Noodles")
		{
		  foodPrice = 230.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer Butter Masala")
		{
		  foodPrice = 260.00* qty;
		  return foodPrice;
		}
		
		else if(foodName == "Malai Kofta")
		{
		  foodPrice = 280.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Aloo Paratha")
		{
		  foodPrice = 160.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Chicken Tikka Masala")
		{
		  foodPrice = 290.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Mutton Rogan Josh")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Veg Thali")
		{
		  foodPrice = 240.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Shawarma")
		{
		  foodPrice = 200.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Speheti")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Veg Sandwich")
		{
		  foodPrice = 170.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken cheese Burger")
		{
		  foodPrice = 180.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer Fried Rice")
		{
		  foodPrice = 290.00* qty;
		  return foodPrice;
		}
		
		else if(foodName == "Chicken beast roll")
		{
		  foodPrice = 220.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mashroom roll")
		{
		  foodPrice = 140.00 * qty;
		  return foodPrice;
		}
		
		else
		System.out.println("The Food item is not found");
	     return foodPrice;
	}
}
		