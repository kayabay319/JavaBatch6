package com.syntax.class19;

public class Recap {

	Recap () {
		System.out.println("Constructor with no arguments");
	}
	Recap (int num) {
		System.out.println("constructor with 1 parameter");
	}
	
	
	public static void main(String[] args) {
		
		Recap obj = new Recap(2);
		//Recap obj = new Recap("Hi"); CE; Constructor is undefined
		
	}
}