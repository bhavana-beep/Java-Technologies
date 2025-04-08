class Dominos
{                                      
	public static double pizzaOrder(String itemName)
	{
		double foodPrice= 0.0;
		
		if(itemName == "Farmhouse Pizza")
		{
		  foodPrice = 210.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Double Cheese Margherita Pizza")
		{
		  foodPrice = 250.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Peppy Paneer Pizza")
		{
		  foodPrice = 170.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Veg Extravaganza Pizza")
		{
		  foodPrice = 339.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Mexican Green Wave Pizza")
		{
		  foodPrice = 450.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Deluxe Veggie Pizza")
		{
		  foodPrice = 500.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Veggie Paradise Pizza")
		{
		  foodPrice = 380.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Paneer Makhani Pizza")
		{
		  foodPrice = 40.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Indi Tandoori Paneer Pizza")
		{
		  foodPrice = 340.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Achari Do Pyaza Pizza")
		{
		  foodPrice = 810.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Moroccan Spice Pasta Pizza - Veg")
		{
		  foodPrice = 370.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Cheese n Corn Pizza")
		{
		  foodPrice = 290.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Fresh Veggie Pizza Paneer & Onion Pizza")
		{
		  foodPrice = 290.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Peri Peri Potato Rice Bowl")
		{
		  foodPrice = 230.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Paneer and Potato Rice Bowl")
		{
		  foodPrice = 260.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Pepper Barbecue Chicken Pizza")
		{
		  foodPrice = 420.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Sausage Pizza")
		{
		  foodPrice = 160.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Golden Delight Pizza")
		{
		  foodPrice = 260.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Non-Veg Supreme Pizza")
		{
		  foodPrice = 240.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Dominator Pizza")
		{
		  foodPrice = 210.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Indi Chicken Tikka Pizza")
		{
		  foodPrice = 360.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Pepperoni Pizza")
		{
		  foodPrice = 320.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Peri-Peri Chicken Pizza")
		{
		  foodPrice = 290.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Moroccan Spice Pasta Pizza - Non-Veg")
		{
		  foodPrice = 320.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Classic Veg Pizza")
		{
		  foodPrice = 340.00;
		  return foodPrice;
		}
		
		else if(itemName == "Onion Pizza")
		{
		  foodPrice = 360.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Capsicum Pizza")
		{
		  foodPrice = 230.00;
		  return foodPrice;
		}
		
		else if(itemName == "Paneer & Capsicum Pizza")
		{
		  foodPrice = 260.00;
		  return foodPrice;
		}
		
		else if(itemName == "Cheesy Pizza")
		{
		  foodPrice = 280.00;
		  return foodPrice;
		}
		
		else if(itemName == "Classic Non-Veg Pizza")
		{
		  foodPrice = 160.00;
		  return foodPrice;
		}
		
		else if(itemName == "Chicken Tikka Pizza")
		{
		  foodPrice = 290.00;
		  return foodPrice;
		}
		
		else if(itemName == "Chicken Sausage Pizza")
		{
		  foodPrice = 360.00;
		  return foodPrice;
		}
		
		else if(itemName == "Choco Lava Cake")
		{
		  foodPrice = 240.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Potato Cheese Shots")
		{
		  foodPrice = 200.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Parcel")
		{
		  foodPrice = 360.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Taco Mexicana Non-Veg")
		{
		  foodPrice = 220.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Veg Parcel")
		{
		  foodPrice = 40.00;
		  return foodPrice;
		}
		
		else if(itemName == "Taco Mexicana Veg")
		{
		  foodPrice = 220.00;
		  return foodPrice;
		}
		
		else if(itemName == "Stuffed Garlic Bread")
		{
		  foodPrice = 240.00;
		  return foodPrice;
		}
		
		
		else if(itemName == "Garlic Breadsticks")
		{
		  foodPrice = 230.00;
		  return foodPrice;
		}
		
		else
		System.out.println("The Food item is not found");
	     return foodPrice;
	}
	
		
		
		
		
		
		
		
		public static double pizzaOrder(String itemName, int qty)
	{
		double foodPrice= 0.0;
		
		if(itemName == "Farmhouse Pizza")
		{
		  foodPrice = 210.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Double Cheese Margherita Pizza")
		{
		  foodPrice = 250.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Peppy Paneer Pizza")
		{
		  foodPrice = 170.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Veg Extravaganza Pizza")
		{
		  foodPrice = 339.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Mexican Green Wave Pizza")
		{
		  foodPrice = 450.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Deluxe Veggie Pizza")
		{
		  foodPrice = 500.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Veggie Paradise Pizza")
		{
		  foodPrice = 380.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Paneer Makhani Pizza")
		{
		  foodPrice = 40.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Indi Tandoori Paneer Pizza")
		{
		  foodPrice = 340.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Achari Do Pyaza Pizza")
		{
		  foodPrice = 810.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Moroccan Spice Pasta Pizza - Veg")
		{
		  foodPrice = 370.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Cheese n Corn Pizza")
		{
		  foodPrice = 290.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Fresh Veggie Pizza Paneer & Onion Pizza")
		{
		  foodPrice = 290.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Peri Peri Potato Rice Bowl")
		{
		  foodPrice = 230.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Paneer and Potato Rice Bowl")
		{
		  foodPrice = 260.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Pepper Barbecue Chicken Pizza")
		{
		  foodPrice = 420.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Sausage Pizza")
		{
		  foodPrice = 160.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Golden Delight Pizza")
		{
		  foodPrice = 260.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Non-Veg Supreme Pizza")
		{
		  foodPrice = 240.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Dominator Pizza")
		{
		  foodPrice = 210.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Indi Chicken Tikka Pizza")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Pepperoni Pizza")
		{
		  foodPrice = 320.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Peri-Peri Chicken Pizza")
		{
		  foodPrice = 290.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Moroccan Spice Pasta Pizza - Non-Veg")
		{
		  foodPrice = 320.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Classic Veg Pizza")
		{
		  foodPrice = 340.00* qty;
		  return foodPrice;
		}
		
		else if(itemName == "Onion Pizza")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Capsicum Pizza")
		{
		  foodPrice = 230.00 * qty;
		  return foodPrice;
		}
		
		else if(itemName == "Paneer & Capsicum Pizza")
		{
		  foodPrice = 260.00 * qty;
		  return foodPrice;
		}
		
		else if(itemName == "Cheesy Pizza")
		{
		  foodPrice = 280.00 * qty;
		  return foodPrice;
		}
		
		else if(itemName == "Classic Non-Veg Pizza")
		{
		  foodPrice = 160.00 * qty;
		  return foodPrice;
		}
		
		else if(itemName == "Chicken Tikka Pizza")
		{
		  foodPrice = 290.00 * qty;
		  return foodPrice;
		}
		
		else if(itemName == "Chicken Sausage Pizza")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		else if(itemName == "Choco Lava Cake")
		{
		  foodPrice = 240.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Potato Cheese Shots")
		{
		  foodPrice = 200.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Chicken Parcel")
		{
		  foodPrice = 360.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Taco Mexicana Non-Veg")
		{
		  foodPrice = 220.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Veg Parcel")
		{
		  foodPrice = 40.00 * qty;
		  return foodPrice;
		}
		
		else if(itemName == "Taco Mexicana Veg")
		{
		  foodPrice = 220.00 * qty;
		  return foodPrice;
		}
		
		else if(itemName == "Stuffed Garlic Bread")
		{
		  foodPrice = 240.00 * qty;
		  return foodPrice;
		}
		
		
		else if(itemName == "Garlic Breadsticks")
		{
		  foodPrice = 230.00 * qty;
		  return foodPrice;
		}
		
		else
		System.out.println("The Food item is not found");
	     return foodPrice;
	}
}