class OlaFoodsRunner
{
	public static void main(String delivery[])
	{
	   double foodPrice= OlaFoods.olaOrder("Mango Lassi");
	   System.out.println("The Food price of Mango Lassi is"+ foodPrice);
	   double qty= OlaFoods.olaOrder("Mango Lassi",7);
	   System.out.println("The Food price of Mango Lassi with "+qty+"is"+"Mango Lassi" );
	}
}
	