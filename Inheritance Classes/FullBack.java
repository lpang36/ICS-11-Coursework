public class FullBack extends Defender
{
	//constructors invoke defender constructors using super keyword
	public FullBack (String a)
	{
		super (a);
		pos = "Fullback";
	}
	
	public FullBack (String a, String b)
	{
		super (a,b);
		pos = "Fullback";
	}
	
	public FullBack (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Fullback";
	}
	
	//overrides defender train method
	public void train ()
	{
		def+=2;
		spd+=2;
		str+=1;
		dri+=1;
	}	
}
