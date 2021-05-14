package com.qa.Calculator;

import java.util.Scanner; //<-- super useful, scans primitive inputs 
import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		int num1; // First # to be entered by user will be read using input.nextint
		int num2;
		String operator; // Should take in the operator as a string ex. "+", "-" etc.

		Scanner input = new Scanner(System.in); // instance of this scanner to run

		System.out.println("operand"); //asking for first #, basically console.writeline from C#.
		num1 = input.nextInt(); // Should read the users input
		System.out.println("other number please"); //asking for second # 
		num2 = input.nextInt(); //read input again 

		Scanner op = new Scanner(System.in); //Scanner should be able to read the primitive inputs we'll be getting from the user 

		System.out.println("operation pls (use + - * /");
		operator = op.next();
		
		// bunch of ifs now bc im too lazy to loop rn and i like ugly code apparently 
		
		
		
		if (operator.equals ("+")) //if they put + we want to add so 
			
		{
			System.out.println("Answer =" + (num1 + num2));
		}
		 
		else if (operator.equals ("-"))	//Repeat What we did for addition but for subtraction
		{
			System.out.println("Answer =" + (num1 - num2)); 
		}
		else if (operator.equals ("/")) //same thing 
			
		{
			System.out.println("Answer =" + (num1 / num2));
		}
		else if (operator.equals ("*")) //same thing 
			
		{
			System.out.println("Answer =" + (num1 * num2));
		}
	}
}
