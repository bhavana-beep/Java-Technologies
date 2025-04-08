class PetRunner
{
	public static void main(String petMania[])
	{
		Pet pet = new Pet();
		
		pet.id = 1;
		System.out.println("The pet id is"+pet.id);
		
		pet.name = "Joe";
		System.out.println("The pet name is"+pet.name);
		
		pet.type = "Dog";
		System.out.println("The pet type of is"+pet.type);
		
		pet.gender = "Female";
		System.out.println("The pet gender is"+pet.gender);
		
		pet.breed = "Retriver";
		System.out.println("The pet breed is"+pet.breed);
		
		pet.age = 2;
		System.out.println("The pet age is"+pet.age);
		
		pet.price = 16000.0;
		System.out.println("The pet price is"+pet.price);
		
		pet.color = "White";
		System.out.println("The pet color is"+pet.color);
		
		
		
		Pet anotherPet	= new Pet();
		anotherPet.id = 9;
		System.out.println("The pet id is"+anotherPet.id);
		
		anotherPet.name = "Tommy";
		System.out.println("The pet name is"+anotherPet.name);
		
		anotherPet.type = "Dog";
		System.out.println("The pet type of is"+anotherPet.type);
		
		anotherPet.gender = "male";
		System.out.println("The pet gender is"+anotherPet.gender);
		
		anotherPet.breed = "Pitbull";
		System.out.println("The pet breed is"+anotherPet.breed);
		
		anotherPet.age = 1;
		System.out.println("The pet age is"+anotherPet.age);
		
		anotherPet.price = 13000.0;
		System.out.println("The pet price is"+anotherPet.price);
		
		anotherPet.color = "brown";
		System.out.println("The pet color is"+anotherPet.color);
		
		
	}
}
	
	