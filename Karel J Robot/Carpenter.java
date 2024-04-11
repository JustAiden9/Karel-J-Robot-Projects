
/**
 * This Carpenter class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import java.awt.Color;
import kareltherobot.*;
class Carpenter extends Worker {
    public Carpenter(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void carpenter() 
    {
        turnRight();
        move2();
        turnLeft();
        putMove5();
        turnAround();
        move5();
        turnRight();
        move8();
        turnRight();
        putMove5();
        turnAround();
        move5();
        turnLeft();
        move6();
        turnLeft();
    }
}
