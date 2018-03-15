import java.util.ArrayList;

public class Deck 
{
	ArrayList <Card> unDelt;
	public Deck(String [] rank, String [] suit, int[] value)
	{
		for(int i = 0; i < rank.length; i++) 
		{
			for(int j = 0; j < suit.length; j++)
			{
				unDelt.add(new Card(rank[i], suit[i], value[i]));
			}
		}
	}

}
