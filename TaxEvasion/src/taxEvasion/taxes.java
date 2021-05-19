package taxEvasion;

public class taxes {
	public static int taxPercentage(int salary) {
		int result = 0;

		if (salary >= 45000)
			result = 25;
		else if (salary >= 30000)
			result = 20;
		else if (salary >= 20000)
			result = 15;
		else if (salary >= 15000)
			result = 10;
		
		return result;

	}
	public static float salaryAfterTax(int salary) 
	{
		float percentage = (float)taxPercentage(salary) * .01f;
		float amtTaxed = percentage *(float)salary;
		return (float)salary - amtTaxed;
	}
	
}
