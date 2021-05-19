package stringManipulatonExercises;

public class StringManipEx1 {
	static String string1 = "yesterday it was raining";
	static String string2 = "today it is sunny";
	static String mySubString1 = string2.substring(0, 11);
	static String mySubString2 = string1.substring(16, 24);

	static void newSentence(String string1, String string2) {
		System.out.println(string2.toUpperCase() + ", " + string1.toUpperCase());
		;
	}
	
	static void vrtclWrds(String string1, String string2) 
	{
		for(int i = 0; i <string1.length(); i++) 
		{
			if(i == 4) 
			{
				System.out.println("help");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(string2.toUpperCase() + ", " + string1.toUpperCase());
		;
		System.out.println(mySubString1.toUpperCase() + mySubString2.toUpperCase());
	}
}
