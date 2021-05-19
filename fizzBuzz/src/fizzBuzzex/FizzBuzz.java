package fizzBuzzex;

public class FizzBuzz {
	public static void main(String[] args) {
		Fizzybuzzy(5);
		Fizzybuzzy(15);
		Fizzybuzzy(9);
	}
	
	public static void Fizzybuzzy(double number) 
	{
		if(number % 3 == 0 && number % 5 == 0) 
		{
			System.out.println("FizzBuzz");
		}else if (number % 5 == 0) 
		{
			System.out.println("Buzz");
		}else if(number % 3 ==0) 
		{
			System.out.println("Fizz");
		}
	}
}
