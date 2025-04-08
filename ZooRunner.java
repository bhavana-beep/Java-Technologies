class ZooRunner
{
	public static void main(String animals[])
	{
		Zoo tkt1 = new Zoo();
		tkt1.id = 1;
		System.out.println("The ticket id is "+tkt1.id);
		
		tkt1.name = "Mysore zoo";
		System.out.println("The name of zoo is is "+tkt1.name);
		
		tkt1.place = "Mysore";
		System.out.println("The the place of zoo is "+tkt1.place );
		
		tkt1.country = "India";
		System.out.println("The country of the is "+tkt1.country);
		
		tkt1.noOffAnimals = 200;
		System.out.println("Number of animals present in zoo is "+tkt1.noOffAnimals);
		
		tkt1.tktPriceForChild = 80.0;
		System.out.println("The pet age is "+tkt1.tktPriceForChild);
		
		tkt1.tktPriceForAdult = 180.0;
		System.out.println("The pet price is "+tkt1.tktPriceForAdult);
		

		
		
		Zoo tkt2 = new Zoo();
		tkt2.id = 2;
		System.out.println("The ticket id is "+tkt2.id);
		
		tkt2.name = "Mysore zoo";
		System.out.println("The name of zoo is is "+tkt2.name);
		
		tkt2.place = "Mysore";
		System.out.println("The the place of zoo is "+tkt2.place );
		
		tkt2.country = "India";
		System.out.println("The country of the is "+tkt2.country);
		
		tkt2.noOffAnimals = 300;
		System.out.println("Number of animals present in zoo is "+tkt2.noOffAnimals);
		
		tkt2.tktPriceForChild = 90;
		System.out.println("The pet age is "+tkt2.tktPriceForChild);
		
		tkt2.tktPriceForAdult = 160.0;
		System.out.println("The pet price is "+tkt2.tktPriceForAdult);
		
	}
}