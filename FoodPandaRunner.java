class FoodPandaRunner
{
	public static void main(String delivery[])
	{
	   double foodPrice= FoodPanda.pandaOrder("Nachos");
	   System.out.println("The Food price of Nachos is"+ foodPrice);
	   double qty= FoodPanda.pandaOrder("Nachos",3);
	   System.out.println("The Total Food price of Nachos is"+ qty);
	}
}
	