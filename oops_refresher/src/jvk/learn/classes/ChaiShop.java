package jvk.learn.classes;

public class ChaiShop {
	String branchName;
	int cupsSold;
	int pricePerCup;
	
	public ChaiShop(String branchName, int cupsSold, int price) {
		this .branchName = branchName;
		this.cupsSold=cupsSold;
		this.pricePerCup = price;
		
	}
	
	
	public ChaiShop() {
		
	}
	
	public void revenueGenerated() {
		System.out.println("revneue geenerated for this branch is:"+ cupsSold*pricePerCup+" rupees");
	}
	
	public void orderChai() {
		cupsSold+=1;
	}


	public void chaiFunction() {
		System.out.println("Chai shop :"+branchName);
		System.out.println("cups sold shop :"+cupsSold);
		System.out.println("price of sold cups :"+pricePerCup);
		
		revenueGenerated();

	}
	
	public void chaiFunction(String name) {
		System.out.println("Chai shop lo function "+name);
	}
	
	 

}


