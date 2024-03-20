
/**
 * This ChoreographerBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;

public class ChoreographerBot extends MyBot
{
    public ChoreographerBot(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }

    public ChoreographerBot d = new ChoreographerBot(5, 6, South, infinity, Color.red);
        
    public ChoreographerBot f = new ChoreographerBot(6, 5, North, infinity, Color.red);
        
    public ChoreographerBot c = new ChoreographerBot(6, 6, East, infinity, Color.blue);
        
    public void letsGo()
    {
        d.fivefive();
        f.fivefive();
        c.fivefive();
    }
    public void fivefive()
    {
        laneOne();
        laneTwo();
        move3();
        goHome();
    }
}
