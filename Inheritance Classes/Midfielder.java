public class Midfielder extends SoccerPlayer
{
	//constructors invoke soccerplayer constructors using super keyword
	public Midfielder (String a)
	{
		super (a);
		pos = "Midfielder";
	}
	
	public Midfielder (String a, String b)
	{
		super (a,b);
		pos = "Midfielder";
	}
	
	public Midfielder (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Midfielder";
	}
	
	//implements abstract train method
	public void train ()
	{
		dri+=2;
		pas+=2;
		def+=2;
	}	
}