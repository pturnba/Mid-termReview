package edu.cis232.item;

public class Pie extends Food {

	public Pie() {
		super("Apple Pie", 100);
	}
	
	public void digest(){
		System.out.println("Eating Apple pie gave you full health!");
	}

}
