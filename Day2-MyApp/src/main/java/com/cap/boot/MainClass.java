package com.cap.boot;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("My Application");
		SalesClass obj=new SalesClass();
		obj.display();
		greetings();
	}

	private static void greetings() {
		System.out.println("Hello!");
		System.out.println("Good morning!");
		System.out.println("Greetings !");
		System.out.println("this statement is only in branch-1");
		
		System.out.println("this statement is only in branch-2");
		System.out.println("this statement is only in branch-2 nest statement");
	}

}
