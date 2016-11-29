package uebung4_Farm;

class Farm {
//	static int cowCounter = 0;
	
	public static void main(String[] args) {
		
		Cow cow1 = new Cow("Berta");
		Cow cow2 = new Cow("Hilde");
		Cow cow3 = new Cow("Miltank");
			
		System.out.println( cow1.getName() ); 
		System.out.println( cow2.getName() );
		System.out.println( cow3.getName() );
		
		System.out.println(Cow.cowCounter);
		System.out.println(Farmer.farmerCounter);
		
		Farmer farmer1 = new Farmer("Max");
		System.out.println(Farmer.farmerCounter);
		
		System.out.println(cow2.getName()+" Hungrig: "+cow2.isHungry());
		cow2.hunger();
		System.out.println(cow2.getName()+" Hungrig: "+cow2.isHungry());
		farmer1.feedCow(cow2);
		System.out.println(cow2.getName()+" Hungrig: "+cow2.isHungry());
		
		cow3.giveBirth("Bernhard");
		Calf calf1 = cow3.giveBirth("Bernhard");
		System.out.println(calf1.getName() +" Hungrig: "+calf1.isHungry()+" Mother: "+calf1.getMother());
		
		
	}

}
