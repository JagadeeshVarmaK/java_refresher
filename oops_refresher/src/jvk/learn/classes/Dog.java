package jvk.learn.classes;

public class Dog {
	
	String name;  //properties
	String breed;
	
	void bark() {
		System.out.println(name+" is barking");  //behaviour
	}
	
	
	public static void main(String[] args) {
		Dog dog1 = new Dog(); 
		dog1.name = "Rocky";
		dog1.breed = "German Shepherd";

		dog1.bark(); // Output: Rocky is barking!
	}
	
	

}
