public class AttackingMidfielder extends Midfielder
{
	//constructors invoke midfielder constructors using super keyword
	public AttackingMidfielder (String a)
	{
		super (a);
		pos = "Attacking Midfielder";
	}
	
	public AttackingMidfielder (String a, String b)
	{
		super (a,b);
		pos = "Attacking Midfielder";
	}
	
	public AttackingMidfielder (String a, String b, int c, int d, int e, int f, int g, int h)
	{
		super (a,b,c,d,e,f,g,h);
		pos = "Attacking Midfielder";
	}
	
	//overrides midfielder train method
	public void train ()
	{
		dri+=3;
		pas+=2;
		sho+=1;
	}	
}
