package jvk.learn.constructors;

public class DefaultConstructor {
	
	
	String name;
	int modelVersion;
	
	public static void main(String[] args) {
		DefaultConstructor car = new DefaultConstructor();
		System.out.println(car.name);
		System.out.println(car.modelVersion);
		
//If you don’t define any constructor in your class, Java provides a default constructor automatically.
//It has no parameters and initializes the object with default values (e.g., 0 for integers, null for objects). 
	}

}
