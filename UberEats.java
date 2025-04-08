class UberEats
{                                      
	public static double uberOrder(String foodName)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Thatte Idli")
		{
		  foodPrice = 350.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Masala Fried Idli")
		{
		  foodPrice = 280.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Rice Idli")
		{
		  foodPrice = 70.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Veggies Idli")
		{
		  foodPrice = 199.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Finger Fried Idli")
		{
		  foodPrice = 110.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Idli Pepper Fry")
		{
		  foodPrice = 150.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chocolate Idli")
		{
		  foodPrice = 80.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mushroom Fry Idli")
		{
		  foodPrice = 40.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "French Fry Idli")
		{
		  foodPrice = 140.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Fry Idli")
		{
		  foodPrice = 210.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Biryani")
		{
		  foodPrice = 170.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kebab Platter")
		{
		  foodPrice = 790.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Classic Maggi")
		{
		  foodPrice = 200.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Peri Peri Potato Rice Bowl")
		{
		  foodPrice = 290.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Fish Curry")
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
		
		
		else if(foodName == "Dal Makhani")
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
	
	
	
	
	
	
	public static double uberOrder(String foodName, int quantity)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Thatte Idli")
		{
		  foodPrice = 350.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Masala Fried Idli")
		{
		  foodPrice = 280.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Rice Idli")
		{
		  foodPrice = 70.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Veggies Idli")
		{
		  foodPrice = 199.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Finger Fried Idli")
		{
		  foodPrice = 110.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Idli Pepper Fry")
		{
		  foodPrice = 150.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chocolate Idli")
		{
		  foodPrice = 80.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mushroom Fry Idli")
		{
		  foodPrice = 40.00* quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "French Fry Idli")
		{
		  foodPrice = 140.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Fry Idli")
		{
		  foodPrice = 210.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Biryani")
		{
		  foodPrice = 170.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kebab Platter")
		{
		  foodPrice = 790.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Classic Maggi")
		{
		  foodPrice = 200.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Peri Peri Potato Rice Bowl")
		{
		  foodPrice = 290.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Fish Curry")
		{
		  foodPrice = 260.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "California Burrito")
		{
		  foodPrice = 220.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Samosa")
		{
		  foodPrice = 100.00* quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Dal Khichdi")
		{
		  foodPrice = 160.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Biryani")
		{
		  foodPrice = 220.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Kebab")
		{
		  foodPrice = 210.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Butter Masala")
		{
		  foodPrice = 260.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mutton Biryani")
		{
		  foodPrice = 320.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chole Bhature")
		{
		  foodPrice = 190.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Gobi Manchurian")
		{
		  foodPrice = 160.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Butter Chicken")
		{
		  foodPrice = 340.00 * quantity;
		  return foodPrice;
		}
		
		else if(foodName == "Fish Curry")
		{
		  foodPrice = 360.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Hakka Noodles")
		{
		  foodPrice = 230.00* quantity;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer Butter Masala")
		{
		  foodPrice = 260.00 * quantity;
		  return foodPrice;
		}
		
		else if(foodName == "Malai Kofta")
		{
		  foodPrice = 280.00 * quantity;
		  return foodPrice;
		}
		
		else if(foodName == "Aloo Paratha")
		{
		  foodPrice = 160.00 * quantity;
		  return foodPrice;
		}
		
		else if(foodName == "Chicken Tikka Masala")
		{
		  foodPrice = 290.00 * quantity;
		  return foodPrice;
		}
		
		else if(foodName == "Mutton Rogan Josh")
		{
		  foodPrice = 360.00 * quantity;
		  return foodPrice;
		}
		
		else if(foodName == "Veg Thali")
		{
		  foodPrice = 240.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Shawarma")
		{
		  foodPrice = 200.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pasta Alfredo")
		{
		  foodPrice = 360.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Veg Sandwich")
		{
		  foodPrice = 170.00 * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Dal Makhani")
		{
		  foodPrice = 180.00 * quantity;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer Tikka")
		{
		  foodPrice = 290.00 * quantity;
		  return foodPrice;
		}
		
		else if(foodName == "Falafel Wrap")
		{
		  foodPrice = 220.00 * quantity * quantity;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mango Lassi")
		{
		  foodPrice = 140.00* quantity;
		  return foodPrice;
		}
		
		else
		System.out.println("The Food item is not found");
	     return foodPrice;
	}
}
		