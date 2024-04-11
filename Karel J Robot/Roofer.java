
/**
 * This Roofer class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
// Roofer class
import java.awt.Color;
import kareltherobot.*;
class Roofer extends Worker {
    public Roofer(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void roofer() 
    {
        turnRight();
        move();
        turnLeft();
        move4();
        turnRight();
        movePut();
        turnLeft();
        roofREPR();
        turnAround();
        move5();
        turnRight();
        move5();
        turnRight();
        putBeeper();
        roofREPL();
        turnAround();
        move9();
        turnLeft();
        move3();
        turnLeft();
    }
}
