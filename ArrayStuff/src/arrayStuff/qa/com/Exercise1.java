package arrayStuff.qa.com;

public class Exercise1 {
	public static int[] arrayNums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	public static void showValues(int num) 
	{
		System.out.println(num);
	}

	public static void main(String args[]) {

		{
			for(int num : arrayNums) 
			{
				showValues(num);
			}
		}
	}
}