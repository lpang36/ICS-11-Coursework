import java.util.*;

public class SoccerPlayerTest
{
    public static void main (String[] args)
    {
        //initialize variables
        Scanner s = new Scanner (System.in);
        char c = '1';
        char d = '1';
        char e;
        String name, club;
        int f=60,g=60,h=60,i=60,j=60,k=60; //all stats set to 60 by default
        do {
            //prompt for user input of player position
            System.out.println("Create a soccer player!");
            System.out.print("What position to play? Enter 1 for forward, 2 for midfielder, 3 for defender: ");
            c = s.next().charAt(0);
            SoccerPlayer sp;
            if (c=='1')
                System.out.print("If you want to assign a more specific position, enter 1 for striker, 2 for winger. If not, enter any other key: ");
            else if (c=='2')
                System.out.print("If you want to assign a more specific position, enter 1 for central midfielder, 2 for defensive midfielder, 3 for attacking midfielder, 4 for wide midfielder. If not, enter any other key: ");
            else if (c=='3')
                System.out.print("If you want to assign a more specific position, enter 1 for center back, 2 for fullback. If not, enter any other key: ");
            d = s.next().charAt(0);
            s.nextLine();
            //prompt for user input of player name
            System.out.print("Enter the player's name: ");
            name = s.nextLine();
            //prompt for user input of player team
            System.out.print("Enter the player's club team: ");
            club = s.nextLine();
            //prompt for user input of player stats
            //if not inputted, then default set to 60
            System.out.print("Enter y to input statistics, otherwise enter any other key: ");
            e = s.next().charAt(0);
            if (e=='y')
            {
                System.out.println("Enter the following statistics in order: speed, strength, shooting, dribbling, passing, defending.");
                f = s.nextInt();
                g = s.nextInt();
                h = s.nextInt();
                i = s.nextInt();
                j = s.nextInt();
                k = s.nextInt();
            }
            //class casting and assignment of object variables
            //depending on user choices, SoccerPlayer sp is casted as various subclasses (e.g. Striker)
            //this is an example of implicit casting
            //according to https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
            if (c=='1')
            {
                if (d=='1') sp = new Striker (name, club, f,g,h,i,j,k);
                else if (d=='2') sp = new Winger (name, club, f,g,h,i,j,k);
                else sp = new Forward (name, club, f,g,h,i,j,k);
            }
            else if (c=='2')
            {
                if (d=='1') sp = new CentralMidfielder (name, club, f,g,h,i,j,k);
                else if (d=='2') sp = new DefensiveMidfielder (name, club, f,g,h,i,j,k);
                else if (d=='3') sp = new AttackingMidfielder (name, club, f,g,h,i,j,k);
                else if (d=='4') sp = new WideMidfielder (name, club, f,g,h,i,j,k);
                else sp = new Midfielder (name, club, f,g,h,i,j,k);
            }
            else 
            {
                if (d=='1') sp = new CenterBack (name, club, f,g,h,i,j,k);
                else if (d=='2') sp = new FullBack (name, club, f,g,h,i,j,k);
                else sp = new Defender (name, club, f,g,h,i,j,k);
            }
            //prompt for user input of number of times to train player
            System.out.print ("How many times do you want to train your player? ");
            int m = s.nextInt(); 
            for (int n = 0; n<m; n++)
            {
                //example of polymorphism
                //depending on the class type of sp, train does different things
                //train is an abstract class in SoccerPlayer
                //the Forward, Midfielder, and Defender subclasses implement different train methods
                //the subclasses of Forward, Midfielder, and Defender either override the train methods in their parent class or inherit them
                sp.train();
            }
            //display name, club, and stats
            //example of inheritance
            //regardless of which class type sp is, all subclasses inherit the toString and stats methods
            System.out.println (sp.toString());
            System.out.println (sp.stats());
            //prompt for user to continue (or not)
            System.out.print ("Enter n to exit, enter any other key to go again: ");
            e = s.next().charAt(0);
        }
        while (e != 'n'); //continue as long as user does not enter n
    }
}
