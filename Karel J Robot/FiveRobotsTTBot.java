
/**
 * This FiveRobotsTTBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public class FiveRobotsTTBot extends TellTimeBot
{
    public FiveRobotsTTBot(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void zeroMain()
    {
        move();
        turnRight();
        zero();
    }
    public void nineMain()
    {
        move();
        turnRight();
        nine();
    }
    public void midMain()
    {
        move();
        turnRight();
        mid();
    }
    public void fiveMain()
    {
        move();
        turnRight();
        five();
    }
    public void twoMain()
    {
        move();
        turnRight();
        two();
    }
}
