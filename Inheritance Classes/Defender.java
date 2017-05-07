public class Defender extends SoccerPlayer
{
	//constructors invoke soccerplayer constructors using super keyword
	public Defender (String a)
	{
		super (a);
		pos = "Defender";
	}
	
	public Defender (String a, String b)
	{
		super (a,b);
		pos = "Defender";
	}
	
	public Defender (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Defender";
	}
	
	//implements abstract train method
	public void train ()
	{
		def+=3;
		str+=3;
	}	
}