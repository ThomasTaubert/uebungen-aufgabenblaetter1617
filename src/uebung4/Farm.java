package uebung4;

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
		
		System.out.println(cow2.getName()+cow2.getHungry());
		cow2.hunger();
		System.out.println(cow2.getName()+cow2.getHungry());
		farmer1.feedCow(cow2);
		System.out.println(cow2.getName()+cow2.getHungry());
		
		cow3.giveBirth("Bernhard");
//		System.out.println(calf1.getName());
		
	}

}
