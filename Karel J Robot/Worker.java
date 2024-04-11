
/**
 * This Worker class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public abstract class Worker extends UrRobot
{
    public Worker(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void start()
    {
        
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move2()
    {
        move();
        move();
    }
    public void putMove5() {
        for (int i = 0; i < 5; i++) {
            putBeeper();
            move();
        }
    }
    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }
    public void move5() {
        for (int i = 0; i < 5; i++) {
            move();
        }
    }
    public void move8() {
        for (int i = 0; i < 8; i++) {
            move();
        }
    }
    public void move6() {
        for (int i = 0; i < 6; i++) {
            move();
        }
    }
    public void move3()
    {
        for (int i = 0; i < 3; i++) {
            move();
        }
    }
    public void putMove3()
    {
        for (int i = 0; i < 3; i++) {
            putBeeper();
            move();
        }
    }
    public void putMove2()
    {
        for (int i = 0; i < 2; i++) {
            putBeeper();
            move();
        }
    }
    public void movePut()
    {
        move();
        putBeeper();
    }
    public void move4()
    {
        for (int i = 0; i < 4; i++) {
            move();
        }
    }
    public void roofREPR()
    {
        for (int i = 0; i < 5; i++) {
        move();
        turnLeft();
        move();
        putBeeper();
        turnRight();
        }
    }
    public void roofREPL()
    {
        for (int i = 0; i < 5; i++) {
        move();
        turnRight();
        move();
        putBeeper();
        turnLeft();
        }
    }
    public void move9()
    {
        for (int i = 0; i < 9; i++) {
        move();
        
        }
    }
    public void windows()
    {
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
    }
}