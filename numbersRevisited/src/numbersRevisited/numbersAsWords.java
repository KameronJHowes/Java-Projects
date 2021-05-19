package numbersRevisited;

public class numbersAsWords 
{
	public static void gimmeWord(int i) 
	{
		String[] smallerNums = new String[] {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] biggerNums = new String[] {"twenty", "thirty", "fourty","fifty","sixty","seventy", "eighty","ninety"};
		String answer = "";
		
		int firstWordOfNum = i/10;
		int secondWordOfNum = i % 10;
		
		if(i >= 20)
		{
			answer = biggerNums[firstWordOfNum - 2];
			if(secondWordOfNum != 0) 
			{
				answer = answer + " " + smallerNums[secondWordOfNum -1];
			}
			else 
				answer += smallerNums [i -1];
				System.out.println(answer);
		}
	}
	public static void main (String[] args) 
	{
		gimmeWord(77);
	}
}
