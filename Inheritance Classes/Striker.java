public class Striker extends Forward
{
	//constructors invoke forward constructors using super keyword
	public Striker (String a)
	{
		super (a);
		pos = "Striker";
	}
	
	public Striker (String a, String b)
	{
		super (a,b);
		pos = "Striker";
	}
	
	public Striker (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Striker";
	}
	
	 //train method is inherited from Forward class
}
