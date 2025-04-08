class OlaFoods
{                                      
	public static double olaOrder(String foodName)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Pani Puri")
		{
		  foodPrice = 100.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Bhel Puri")
		{
		  foodPrice = 180.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kachori")
		{
		  foodPrice = 129.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Margherita Pizza")
		{
		  foodPrice = 299.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pav Bhaji")
		{
		  foodPrice = 110.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Fried Rice")
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
		  foodPrice = 870.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pongal")
		{
		  foodPrice = 140.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chaat")
		{
		  foodPrice = 210.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Classic Maggi")
		{
		  foodPrice = 70.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kebab veg Platter")
		{
		  foodPrice = 290.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Gulab Jamun")
		{
		  foodPrice = 240.00;
		  return foodPrice;
		}
		
		
		else if(foodName == "Peri Peri Fries")
		{
		  foodPrice = 190.00;
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
	
	
	
	
	
	
	
	
	public static double olaOrder(String foodName, int qty)
	{
		double foodPrice= 0.0;
		
		if(foodName == "Pani Puri")
		{
		  foodPrice = 100.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Bhel Puri")
		{
		  foodPrice = 180.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kachori")
		{
		  foodPrice = 129.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Margherita Pizza")
		{
		  foodPrice = 299.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Pav Bhaji")
		{
		  foodPrice = 110.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Fried Rice")
		{
		  foodPrice = 150.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Idli with Sambar")
		{
		  foodPrice = 180.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "bonda soup")
		{
		  foodPrice = 270.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Sweet Pongal")
		{
		  foodPrice = 140.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Papdi Chaat")
		{
		  foodPrice = 210.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Classic Maggi")
		{
		  foodPrice = 70.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Kebab veg Platter")
		{
		  foodPrice = 290.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Gulab Jamun")
		{
		  foodPrice = 240.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Peri Peri Fries")
		{
		  foodPrice = 190.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer and Potato Rice Bowl")
		{
		  foodPrice = 260.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "California Burrito")
		{
		  foodPrice = 220.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Samosa")
		{
		  foodPrice = 100.00 * qty;
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
		
		
		else if(foodName == "Chicken Kebab")
		{
		  foodPrice = 210.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Paneer Butter Masala")
		{
		  foodPrice = 260.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mutton Biryani")
		{
		  foodPrice = 320.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chole Bhature")
		{
		  foodPrice = 190.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Gobi Manchurian")
		{
		  foodPrice = 160.00* qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Butter Chicken Roast")
		{
		  foodPrice = 340.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Tava Fish ")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Hakka Noodles")
		{
		  foodPrice = 230.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer Butter Masala")
		{
		  foodPrice = 260.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Malai Kofta Mashroom stuffed")
		{
		  foodPrice = 280.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Aloo Paratha with curd")
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
		
		
		else if(foodName == "Pasta Alfredo")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Veg Sandwich")
		{
		  foodPrice = 170.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Chicken Burger")
		{
		  foodPrice = 180.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Paneer Tikka")
		{
		  foodPrice = 290.00 * qty;
		  return foodPrice;
		}
		
		else if(foodName == "Falafel Wrap")
		{
		  foodPrice = 220.00 * qty;
		  return foodPrice;
		}
		
		
		else if(foodName == "Mango Lassi")
		{
		  foodPrice = 140.00 * qty;
		  return foodPrice;
		}
		
		else
		System.out.println("The Food item is not found");
	     return foodPrice;
	}
}
		