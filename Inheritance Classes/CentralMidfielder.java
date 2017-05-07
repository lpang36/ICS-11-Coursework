public class CentralMidfielder extends Midfielder
{
	//constructors invoke midfielder constructors using super keyword
	public CentralMidfielder (String a)
	{
		super (a);
		pos = "Central Midfielder";
	}
	
	public CentralMidfielder (String a, String b)
	{
		super (a,b);
		pos = "Central Midfielder";
	}
	
	public CentralMidfielder (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Central Midfielder";
	}
	
	 //train method is inherited from Midfielder class
}
