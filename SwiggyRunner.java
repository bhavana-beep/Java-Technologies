class SwiggyRunner
{
	public static void main(String delivery[])
	{
	   double foodPrice= Swiggy.takeOrder("Chicken Burger");
	   System.out.println("The Food price of Chicken Burger is"+ foodPrice);
	   double quantity= Swiggy.takeOrder("Chicken Burger", 4);
	   System.out.println("The Food price of Chicken Burger with "+quantity+"is"+ "Chicken Burger");
	}
}
	