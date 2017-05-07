public class DefensiveMidfielder extends Midfielder
{
	//constructors invoke midfielder constructors using super keyword
	public DefensiveMidfielder (String a)
	{
		super (a);
		pos = "Defensive Midfielder";
	}
	
	public DefensiveMidfielder (String a, String b)
	{
		super (a,b);
		pos = "Defensive Midfielder";
	}
	
	public DefensiveMidfielder (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Defensive Midfielder";
	}
	
	//overrides midfielder train method
	public void train ()
	{
		def+=3;
		str+=2;
		pas+=1;
	}	
}
