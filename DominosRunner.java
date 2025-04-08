class DominosRunner
{
	public static void main(String pizzaDelivery[])
	{
	   double foodPrice= Dominos.pizzaOrder("Double Cheese Margherita Pizza");
	   System.out.println("The Food price of Double Cheese Margherita Pizza is"+ foodPrice);
	   double quantity= Dominos.pizzaOrder("Double Cheese Margherita Pizza", 4);
	   System.out.println("The Food price of Double Cheese Margherita Pizza with "+quantity+"is "+ "Double Cheese Margherita Pizza");
	}
}
	