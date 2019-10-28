package rnaStructuring;

import java.util.ArrayList;

public class Strand
{
	public ArrayList<Base> bases = new ArrayList<Base>();
	
	public Strand() 
	{
		initRNAString("ACCGGUAGU");
	}
	
	public Strand(String bases) 
	{
		initRNAString(bases);
	}
	
	public static void optimizePairings(Base a, Base b) 
	{
		if () 
		{}
	}
	
	public void initRNAString(String bases) 
	{
		// for each base go through and make a new instance of Base and add it to bases
		// C - G
		// T - A
		for (int i = 0; i < bases.length(); i++) 
		{
			Base newBase = new Base(bases.charAt(i));
			this.bases.add(i, newBase);
		}
	}

	public ArrayList<Base> getBases()
	{
		return bases;
	}

	public void setBases(ArrayList<Base> bases)
	{
		this.bases = bases;
	}
	
	
}
