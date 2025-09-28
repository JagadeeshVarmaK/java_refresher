package jvk.learn.classes;
class Driver{
	
	public static void main(String[] args) {
		ChaiShop branch1 = new ChaiShop(); // to execute this line we need to place a default constructor
		branch1.branchName = "BahubaliAdda";
		branch1.cupsSold = 5;
		
		
		branch1.chaiFunction();
		branch1.chaiFunction("method overloaded\n");
		
		ChaiShop branch2 = new ChaiShop("tea Kadai", 100, 10);
		branch2.chaiFunction();
		branch2.orderChai();
		System.out.println("\n");
		branch2.chaiFunction();

	}
	
	
}