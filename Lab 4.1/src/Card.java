
public class Card 
{
	private int value;
	private String suit;
	private String rank;

	public int getValue() 
	{
		return value;
	}

	public void setValue(int value) 
	{
		this.value = value;
	}

	public String getSuit() 
	{
		return suit;
	}

	public void setSuit(String suit) 
	{
		this.suit = suit;
	}

	public String getRank() 
	{
		return rank;
	}

	public void setRank(String rank) 
	{
		this.rank = rank;
	}
	
	public Card(String rank, String suit, int value)
	{
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}
	
	public boolean equals(Card otherCard)
	{
		if (otherCard.getValue() == this.value)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return this.rank + " of " + this.suit + ", current value: " + this.value;
	}
}
