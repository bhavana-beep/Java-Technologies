class IcecreamsRunner
{
	public static void main(String ice[])
	{
		Icecreams ice1 = new Icecreams();
		ice1.id = 34;
		System.out.println("The Icereams id is "+ice1.id);
		
		ice1.brand = "Amul Icereams";
		System.out.println("The Icereams brand is "+ice1.brand );
		
		ice1.price = 40.0;
		System.out.println("The Icereams price is "+ice1.price);
		
		ice1.flavour = "Chocolate";
		System.out.println("The Icereams price is "+ice1.flavour);
		
		ice1.type = "Candy";
		System.out.println("The Icereams color isc"+ice1.type);
		System.out.println();
		
		
		
		
		Icecreams ice2 = new Icecreams();
		ice2.id = 23;
		System.out.println("The Icereams id is"+ice2.id);
		
		ice2.brand = "Arun Icecreams";
		System.out.println("The Icereams brand is"+ice2.brand );
		
		ice2.price = 60.0;
		System.out.println("The Icereams price is"+ice2.price);
		
		ice2.flavour = "Chocolate";
		System.out.println("The Icereams price is"+ice2.flavour);
		
		ice2.type = "Candy";
		System.out.println("The Icereams color is"+ice2.type);
		System.out.println();
	}
}