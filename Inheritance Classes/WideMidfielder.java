public class WideMidfielder extends Midfielder
{
	//constructors invoke midfielder constructors using super keyword
	public WideMidfielder (String a)
	{
		super (a);
		pos = "Wide Midfielder";
	}
	
	public WideMidfielder (String a, String b)
	{
		super (a,b);
		pos = "Wide Midfielder";
	}
	
	public WideMidfielder (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Wide Midfielder";
	}
	
	//overrides midfielder train method
	public void train ()
	{
		spd+=3;
		dri+=2;
		pas+=1;
	}	
}

