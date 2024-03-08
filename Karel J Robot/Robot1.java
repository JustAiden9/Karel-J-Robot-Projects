
/**
 * This Robot1 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public class Robot1 extends MyBot
{
    public Robot1(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void start1() 
    {
        movePut5();
        turnAround();
        move5();
        turnAround();
    }
}
