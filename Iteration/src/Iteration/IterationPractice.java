package Iteration;

public class IterationPractice {
	 static int getTheSum(int number)
	    {    
	        int sum = 0;
	          
	        while (number != 0)
	        {
	            sum = sum + number % 10;
	            number = number/10;
	        }
	      
	    return sum;
	    }
	  
	   
	    public static void main(String[] args)
	    {
	        int number = 999;
	  
	        System.out.println(getTheSum(number));
	    }
	}

