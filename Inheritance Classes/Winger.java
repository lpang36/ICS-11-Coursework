public class Winger extends Forward
{
	//constructors invoke forward constructors using super keyword
	public Winger (String a)
	{
		super (a);
		pos = "Winger";
	}
	
	public Winger (String a, String b)
	{
		super (a,b);
		pos = "Winger";
	}
	
	public Winger (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Winger";
	}
	
	//overrides forward train method
	public void train ()
	{
		spd+=3;
		sho+=2;
		dri+=1;
	}	
}
