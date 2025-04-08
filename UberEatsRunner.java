class UberEatsRunner
{
	public static void main(String delivery[])
	{
	   double foodPrice= UberEats.uberOrder("Veggies Idli");
	   System.out.println("The Food price of Veggies Idli is"+ foodPrice);
	   double quantity= UberEats.uberOrder("Veggies Idli",3);
	   System.out.println("The Food price of Veggies Idli with "+quantity+"is"+ "Chicken Burger");
	}
}
	