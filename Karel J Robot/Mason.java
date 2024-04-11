
/**
 * This Mason class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import java.awt.Color;
import kareltherobot.*;
class Mason extends Worker {
    public Mason(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void mason() 
    {
        turnRight();
        move3();
        turnLeft();
        putMove2();
        turnRight();
        putMove2();
        turnRight();
        putMove2();
        putBeeper();
        turnRight();
        move5();
        turnRight();
        move4();
        turnRight();
        move2();
        windows();
        turnAround();
        move3();
        turnRight();
        move();
        turnLeft();
        windows();
        turnLeft();
        move5();
        turnRight();
        move3();
        turnRight();
    }
}
