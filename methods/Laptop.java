class Laptop {
	public static void main(String []args) {
		printModel();	
		Laptop.printModel();
	
		printModel("gg");
	}
	static void printModel () {
		System.out.println("Easy to carry");
		System.out.println("store information");
		System.out.println("game");
}
 static void printModel(String model) {
		System.out.println( model + " Easy to carry");
		System.out.println( model + " store information");
		System.out.println( model + " game");
}
}
