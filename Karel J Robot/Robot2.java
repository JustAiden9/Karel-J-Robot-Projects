
/**
 * This Robot2 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public class Robot2 extends MyBot
{
    public Robot2(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void start2() 
    {
        move3();
            putBeeper();
            turnAround();
            move3();
            turnAround();
    }
}