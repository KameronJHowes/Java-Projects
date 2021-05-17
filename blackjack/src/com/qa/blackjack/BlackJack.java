package com.qa.blackjack;

public class BlackJack {
	static void play(int card, int card2) {
		 if (card > 21 && card2 > 21) 
			{
				System.out.println("No winners");
			}
		 else if(card > 0 && card < 21 && card > card2) 
		{
			System.out.println(card + " wins");
		} 
		else if (card2 > 0 && card2 < 21 && card2 > card) 
		{
			System.out.println(card2 + " wins");
		}
		else if (card > 21) 
		{
		System.out.println(card2 + " wins");	
		}
		else if (card2 > 21) 
		{
			System.out.println(card + " wins");
		}
		
	}

	public static void main(String[] args) 
	{
		play(12, 13);
		play(13, 12);
		play(22, 22);
		play(2, 22);
	}
}

