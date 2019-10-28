package rnaStructuring;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		Strand newStrand = new Strand();
		ArrayList<Base> tempBases = newStrand.getBases();
		
		for (int i = 0; i < tempBases.size(); i++) 
		{
			System.out.print(tempBases.get(i).getNucleotide());
		}
	}

}
