//abstract class
//SoccerPlayer will never be directly implemented
//all soccer players require a position to play in, which is specific to SoccerPlayer's subclasses
///general structure for reference:
//SoccerPlayer
    //Forward
        //Striker
        //Winger
    //Midfielder
        //CentralMidfielder
        //DefensiveMidfielder
        //AttackingMidfielder
        //WideMidfielder
    //Defender
        //CenterBack
        //FullBack
public abstract class SoccerPlayer
{
    //basic facts
    private String name; //players don't change names, no reason for other classes to access or modify this
    protected String club;
    protected String pos; //position
    //rating stats
    //protected so subclasses' train methods can access and modify these stats
    protected int spd; //speed
    protected int str; //strength
    protected int sho; //shooting
    protected int dri; //dribbling
    protected int pas; //passing
    protected int def; //defending
    //maximum stats limited to 100
    //public access as this is a constant
    public static final int MAX_LIMIT = 100;

    //overloaded constructors
    //inherited by subclasses using super keyword
    public SoccerPlayer (String a)
    {
        name = a;
        club = "No club";
        spd = 60; str = 60; sho = 60; dri = 60; pas = 60; def = 60;
    }
    
    public SoccerPlayer (String a, String b)
    {
        name = a;
        club = b;
        spd = 60; str = 60; sho = 60; dri = 60; pas = 60; def = 60;
    }
    
    public SoccerPlayer (String a, String b, int c, int d, int e, int f, int g, int h)
    {
        name = a;
        club = b;
        spd = c; str = d; sho = e; dri = f; pas = g; def = h;
    }
    
    //implicit inheritance from object class
    public String toString ()
    {
        //display name of player and club
        return name+", "+pos+" for "+club;
    }
    
    public String stats()
    {
        //limits maximum stats values to MAX_LIMIT
        //this is a constant set at 100
        if (spd>MAX_LIMIT) spd = MAX_LIMIT;
        if (str>MAX_LIMIT) str = MAX_LIMIT;
        if (sho>MAX_LIMIT) sho = MAX_LIMIT;
        if (dri>MAX_LIMIT) dri = MAX_LIMIT;
        if (pas>MAX_LIMIT) pas = MAX_LIMIT;
        if (def>MAX_LIMIT) def = MAX_LIMIT;
        //display list of stats
        return "Speed: "+spd+"\nStrength: "+str+"\nShooting: "+sho+"\nDribbling: "+dri+"\nPassing: "+pas+"\nDefending: "+def;
    }

    //abstract method
    //is implemented by subclasses
    //method is intended to improve specific stats each time it is called
    //depending on the soccer player's position, different stats need to be improved
    //therefore each subclass has its own specific implementation of train
    public abstract void train();
}
