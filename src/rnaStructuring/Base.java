package rnaStructuring;

public class Base
{
	public char nucleotide;
	public Base pairing;
	
	public Base(char charAt)
	{
		this.nucleotide = charAt;
	}
	public char getNucleotide()
	{
		return nucleotide;
	}
	public void setNucleotide(char nucleotide)
	{
		this.nucleotide = nucleotide;
	}
	public Base getPairing()
	{
		return pairing;
	}
	public void setPairing(Base pairing)
	{
		this.pairing = pairing;
	}
	
	
}
