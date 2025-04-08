class FoodPanda
{                                      
	public static double pandaOrder(String foodName)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Chips & Crisps")
		{
		  foodPrice = 350.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Nachos")
		{
		  foodPrice = 280.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Del Monte Black Sliced Olives")
		{
		  foodPrice = 70.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Noodles")
		{
		  foodPrice = 199.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Frozen Veg Snacks")
		{
		  foodPrice = 110.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pasta")
		{
		  foodPrice = 150.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Instant Mixes")
		{
		  foodPrice = 80.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Vada")
		{
		  foodPrice = 40.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Dum Biryani")
		{
		  foodPrice = 140.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Butter Naan")
		{
		  foodPrice = 210.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Garlic Naan")
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
	
	
	
	
	
	
	
	
	public static double pandaOrder(String foodName, int qty)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Chips & Crisps")
		{
		  foodPrice = 350.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Nachos")
		{
		  foodPrice = 280.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Del Monte Black Sliced Olives")
		{
		  foodPrice = 70.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Noodles")
		{
		  foodPrice = 199.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Frozen Veg Snacks")
		{
		  foodPrice = 110.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pasta")
		{
		  foodPrice = 150.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Instant Mixes")
		{
		  foodPrice = 80.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Masala Vada")
		{
		  foodPrice = 40.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Dum Biryani")
		{
		  foodPrice = 140.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Butter Naan")
		{
		  foodPrice = 40.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Garlic Naan")
		{
		  foodPrice = 60.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Tandoori Platter")
		{
		  foodPrice = 490.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Crispy Paneer Rice Bowl")
		{
		  foodPrice = 240.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Peri Peri Mc Fries")
		{
		  foodPrice = 230.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer and Tomato Rice Bowl")
		{
		  foodPrice = 260.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Burrito")
		{
		  foodPrice = 220.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Veg Stuffed Samosa")
		{
		  foodPrice = 100.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Dal Chapati")
		{
		  foodPrice = 100.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Biryani")
		{
		  foodPrice = 220.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Tandoori")
		{
		  foodPrice = 210.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Grill Chicken")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Fish Biryani")
		{
		  foodPrice = 320.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Puri Bhaji")
		{
		  foodPrice = 190.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Manchurian")
		{
		  foodPrice = 260.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Babycorn Chilly")
		{
		  foodPrice = 340.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Chicken Pepper dry")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken masala")
		{
		  foodPrice = 230.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Chicken 65")
		{
		  foodPrice = 260.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Babycorn pepery dry")
		{
		  foodPrice = 280.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Aloo Manchurian")
		{
		  foodPrice = 160.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Infused Chicken")
		{
		  foodPrice = 290.00  * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Fried Chicken")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Parota")
		{
		  foodPrice = 240.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Rumali Roti")
		{
		  foodPrice = 200.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pasta Alfredo")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chocolate Sandwich")
		{
		  foodPrice = 170.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Veg loaded Burger")
		{
		  foodPrice = 180.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer fry")
		{
		  foodPrice = 290.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Bhendi fry")
		{
		  foodPrice = 220.00  * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Potato Wedges")
		{
		  foodPrice = 140.00  * qty;
		  return foodPrice;
		}
		
		else
		System.out.println("The Food item is not found");
	     return foodPrice;
	}
	
}
		