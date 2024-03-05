
/**
 * This GardenerBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class GardenerBot extends MyBot
{
    public GardenerBot(int s, int a, Direction d, int b)
    {
        super(s,a,d,b);
    }
    public void goToStart()
    {
        move2();
        turnRight();
        move4();
        turnLeft();
    }
    public void plantQuadrant()
    {
        move2();
        putLeft();
        move3();
        turnRightMove2();
    }
    public void goHome()
    {
        leftMove4();
        turnLeft();
        move2();
        turnAround();
    }
}

