package arraysProper;

public class Exercise2 {
	public static void main(String[] args) 
	{
		int[] numsArray;
		
		numsArray = new int[10];
		
		for(int i = 0; i < numsArray.length; i++) 
		{
			numsArray[i] = i;
			
			System.out.println(numsArray[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < numsArray.length; i++) 
		{
			numsArray[i] = i;
			
			System.out.println(numsArray[i] * 10);
		}
		System.out.println();
	}
}
