
/**
 * This DiaHCode class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class DiaHBot extends MyBot
{ 
    public DiaHBot(int s, int a, Direction d, int b)
    {
        super(s,a,d,b);
    }
    public void left()
    {
        turnLeft();
        move();
        turnRight();
        move();
        pickBeeper();
    }
    public void midOne()
    {
        move();
        pickBeeper();
        turnRight();
        move();
        turnLeft();
    }
    public void midTwo()
    {
        move();
        pickBeeper();
        turnLeft();
        move();
        turnRight();
    }
    public void lastStrech()
    {
        move();
        pickBeeper();
        turnRight();
        move();
        turnLeft();
    }
    public void movePick()
    {
        move();
        pickBeeper();
    }
    public void GETBACK()
    {
        turnRight();
        moveThree();
        turnRight();
        moveThree();
        turnRight();
        move();
    }
    public void moveThree()
    {
        move();
        move();
        move();
    }
    public void movePickRight()
    {
        movePick();
        move();
        turnRight();
    }
    public void moveRight()
    {
        move();
        turnRight();
    }
    public void moveLeft()
    {
        move();
        turnLeft();
    }
        public void leftExtra() 
        {
        for (int i = 0; i < 3; i++) {
            left();
        }
    }
            public void midOneExtra() 
        {
        for (int i = 0; i < 3; i++) {
            midOne();
        }
    }
            public void midTwoExtra() 
        {
        for (int i = 0; i < 3; i++) {
            midTwo();
        }
    }
            public void lastStrechExtra() 
        {
        for (int i = 0; i < 4; i++) {
            lastStrech();
        }
    }
}
