class BlinkItRunner
{
	public static void main(String delivery[])
	{
	   double foodPrice= BlinkIt.blinkOrder("Habanero Flour Tortilla Wraps");
	   System.out.println("The Food price of Habanero Flour Tortilla Wraps is"+ foodPrice);
	   double qty= BlinkIt.blinkOrder("Habanero Flour Tortilla Wraps",3);
	   System.out.println("The total Food price of Habanero Flour Tortilla Wraps "+qty);
	}
}
	