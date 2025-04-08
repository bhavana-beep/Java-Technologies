class ClothesRunner
{
	public static void main(String dress[])
	{
		Clothes clothType1 = new Clothes();
		clothType1.id = 23;
		System.out.println("The cloth id is"+clothType1.id);
		
		clothType1.brand = "H&M";
		System.out.println("The cloth brand is"+clothType1.brand );
		
		clothType1.type = "T-shirt";
		System.out.println("The cloth type is"+clothType1.type);
		
		clothType1.material = "Cotton";
		System.out.println("The cloth material is"+clothType1.material );
		
		clothType1.price = 799.0;
		System.out.println("The cloth price is"+clothType1.price);
		
		clothType1.size = "MEDIUM";
		System.out.println("The cloth price is"+clothType1.size);
		
		clothType1.color = "RED";
		System.out.println("The cloth color is"+clothType1.color);
		
		
		Clothes clothType2 = new Clothes();		
		clothType2.id = 65;
		System.out.println("The cloth id is"+clothType2.id);
		
		clothType2.brand = "ZARA";
		System.out.println("The cloth brand is"+clothType2.brand );
		
		clothType2.type = "Dress";
		System.out.println("The cloth type is"+clothType2.type);
		
		clothType2.material = "Lenin";
		System.out.println("The cloth material is"+clothType2.material );
		
		clothType2.price = 999.0;
		System.out.println("The cloth price is"+clothType2.price);
		
		clothType2.size = "SMALL";
		System.out.println("The cloth price is"+clothType2.size);
		
		clothType2.color = "BLUE";
		System.out.println("The cloth color is"+clothType2.color);
		
	}
}
	
	