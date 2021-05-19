package com.qa.classConstructors;

public class Person {
	// Attributes

	public String name;
	public int age;
	public String gender;
	public boolean isAlive;
	
	//Constructor
	public Person(String name, int age, String gender) 
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void read(Book book) 
	{
		System.out.println(this.name + " is reading" + " " + book );
	}
	public boolean isAlive() 
	{
		return isAlive;
	}
	public String speak(String msg) 
	{
		return this.name + " says:" + msg;
	}
	public static void main (String[] args) 
	{
		Person person1 = new Person("John Smith", 29, "M");
		Book book1 = new Book("Moby Dick", "Herman Melville", 327);
		
		person1.read(book1);
	}
}
