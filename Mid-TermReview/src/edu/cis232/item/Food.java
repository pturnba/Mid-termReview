package edu.cis232.item;

public class Food extends Item{
	protected int value;
	
	public Food(String name, int value){
		super(name);
		this.value = value;
	}
	
	public void digest(){
		System.out.printf("You digested %d value of %s.%n", value, getName());
	}
}
