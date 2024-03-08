
/**
 * This Robot3 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public class Robot3 extends MyBot
{
    public Robot3(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void start3()
    {
        movePutMove3();
        turnAround();
        move6();
        turnAround();
    }
}
