public class Forward extends SoccerPlayer
{
    //constructors invoke soccerplayer constructors using super keyword
	public Forward (String a)
	{
		super (a);
		pos = "Forward";
	}
	
	public Forward (String a, String b)
	{
		super (a,b);
		pos = "Forward";
	}
	
	public Forward (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Forward";
	}
	
	//implements abstract train method
	public void train ()
	{
		sho+=3;
		str+=3;
	}	
}