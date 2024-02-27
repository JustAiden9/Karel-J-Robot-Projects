
/**
 * This PairBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public class PairBot extends MyBot
{ 
    public PairBot(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void mid()
    {
        move();
        pickBeeper();
    }
    public void center()
    {
        turnAround();
        move3();
    }
    public void middle() 
        {
        for (int i = 0; i < 7; i++) {
            mid();
        }
    }
    public void middle2() 
        {
        for (int i = 0; i < 3; i++) {
            mid();
        }
    }
    public void sides()
    {
        middle2();
        center();
        middle2();
        center();
    }
    public void place()
    {
        putBeeper();
        turnRight();
        movePut();
        centerMid();
        movePut();
        centerMid();
        turnRight();
        movePut();
        centerMid();
        movePut();
    }
    public void centerMid()
    {
        turnAround();
        move();
    }
    public void home()
    {
        turnAround();
        move();
        turnLeft();
        move3();
        turnAround();
    }
}