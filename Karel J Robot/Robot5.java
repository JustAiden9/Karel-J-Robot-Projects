
/**
 * This Robot5 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public class Robot5 extends MyBot
{
    public Robot5(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void start5()
    {
        movePut();
        move4();
        putBeeper();
        turnAround();
        move5();
        turnAround();
    }
}
