package com.Review08.Abstraction2;

public class Walnut extends Fruit implements Crackable { //it can have more implements but only one extends 

	public Walnut(String color) {
		super(color);
	}

    @Override
    public void crack() {
    	System.out.println("Let`s crack the walnut");
    }

    @Override
    public void eat() {
	    System.out.println("Let`s eat the walnut");

	
}
    
}
