package edu.cis232.item;

public class Turkey extends Food {
	
	public Turkey(){
		super("Turkey", 100);
	}
	
	public void digest(){
		System.out.println("Eating a turkey gave you full health!");
	}
}
