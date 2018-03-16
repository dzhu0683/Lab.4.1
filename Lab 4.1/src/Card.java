
public class Card 
{
	int[] deck = new int[52];
	String [] suit = {"Diamond", "Clubs", "Hearts", "Spades"};
	String [] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public Card(String rank, String suit, int value)
	{
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = i;
		}
	}

	public int[] getDeck() {
		return deck;
	}

	public void setDeck(int[] deck) {
		this.deck = deck;
	}

	public String[] getSuit() {
		return suit;
	}

	public void setSuit(String[] suit) {
		this.suit = suit;
	}

	public String[] getRank() {
		return rank;
	}

	public void setRank(String[] rank) {
		this.rank = rank;
	}
}
