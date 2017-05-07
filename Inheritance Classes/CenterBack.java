public class CenterBack extends Defender
{
	//constructors invoke defender constructors using super keyword
	public CenterBack (String a)
	{
		super (a);
		pos = "Center Back";
	}
	
	public CenterBack (String a, String b)
	{
		super (a,b);
		pos = "Center Back";
	}
	
	public CenterBack (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Center Back";
	}
	
	//train method is inherited from Defender class
}
