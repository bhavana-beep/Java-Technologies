class NewShoesRunner
{
	public static void main(String shoe[])
	{
		NewShoes shoe1 = new NewShoes();
		shoe1.id = 187;
		System.out.println("The Shoe id is "+shoe1.id);
		
		shoe1.brand = "Nike";
		System.out.println("The Shoe brand is "+shoe1.brand );
		
		shoe1.genderType = "MEN";
		System.out.println("The Shoe gender type is "+shoe1.genderType);
		
		shoe1.price = 2799.0;
		System.out.println("The Shoe price is "+shoe1.price);
		
		shoe1.size = "10";
		System.out.println("The cloth price is "+shoe1.size);
		
		shoe1.color = "BLACK";
		System.out.println("The cloth color is "+shoe1.color);
		System.out.println();
		
		
		
		
		NewShoes shoe2 = new NewShoes();
		shoe2.id = 135;
		System.out.println("The Shoe id is "+shoe2.id);
		
		shoe2.brand = "Adidas";
		System.out.println("The Shoe brand is "+shoe2.brand );
		
		shoe2.genderType = "WOMEN";
		System.out.println("The Shoe gender type is "+shoe2.genderType);
		
		shoe2.price = 3299.0;
		System.out.println("The Shoe price is "+shoe2.price);
		
		shoe2.size = "8";
		System.out.println("The cloth price is "+shoe2.size);
		
		shoe2.color = "PINK";
		System.out.println("The cloth color is "+shoe2.color);
		
	}
}
	
	