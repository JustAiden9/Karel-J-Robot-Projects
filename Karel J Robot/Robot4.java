
/**
 * This Robot4 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public class Robot4 extends MyBot
{
    public Robot4(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void start4() 
    {
        movePut();
        turnAround();
        move();
        turnAround();
    }
}
