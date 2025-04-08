class ZeptoRunner
{
	public static void main(String delivery[])
	{
	   double foodPrice= Zepto.zeptoOrder("Cold Coffee");
	   System.out.println("The Food price of Cold Coffee is"+ foodPrice);
	   double qty= Zepto.zeptoOrder("Cold Coffee", 2);
	   System.out.println("The Food price of Cold Coffee is"+ "Cold Coffee");
	}
}
	
	