import java.util.ArrayList;

public class Deck 
{
	ArrayList <Card> unDealt;
	ArrayList <Card> Dealt;

	public Deck(String [] rank, String [] suit, int[] value)
	{
		for(int i = 0; i < rank.length; i++) 
		{
			for(int j = 0; j < suit.length; j++)
			{
				unDealt.add(new Card(rank[i], suit[i], value[i]));
			}
		}
	}
	
	public boolean isEmpty()
	{
		if(unDealt.size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public int size()
	{
		return this.unDealt.size();
	}
	
	public Card deal()
	{
		Card x = unDealt.remove(0);
		Dealt.add(x);
		return x;
	}
	
	public void shuffle()
	{
		int x = unDealt.size();	
		for(int y = x - 1; y >= 0; y--)
		{
			int a = (int)(Math.random()*(x-1));
			Card temp = unDealt.get(y);
			unDealt.set(y, unDealt.get(a));
			unDealt.set(a, temp);
		}
	}
}
