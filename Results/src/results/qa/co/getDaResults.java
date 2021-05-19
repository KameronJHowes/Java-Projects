package results.qa.co;

public class getDaResults 
{
	public static double Physics = 130;
	public static double Chemistry = 100;
	public static double Biology = 130;
	public static double total = Physics + Chemistry + Biology;
	;
	public static double percentage;
	
	public static void displayResults() {
		System.out.println("Physics: " + Physics);
		System.out.println("Chemistry: " + Chemistry);
		System.out.println("Biology: " + Biology);
		
		
		System.out.println("\nTotal: " + total);
	}
	public static double displayExamOverall() {
		return percentage = total * 100 / 450;
	}
	
	
	
	public static void main (String[] args) 
	{
		getDaResults.displayResults();
		
		System.out.println(getDaResults .displayExamOverall());
	}
}
