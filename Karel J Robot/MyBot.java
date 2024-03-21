
/**
 * This MyBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public class MyBot extends UrRobot
{
    public MyBot(int s, int a, Direction d, int b)
    {
        super(s,a,d,b);
    }
    public MyBot(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnRightMove()
    {
        turnRight();
        move();
    }
    public void movePut()
    {
        move();
        putBeeper();
    }
    public void turnAround()
    
    {
        turnRight();
        turnRight();
    }
    public void move2()
    {
        move();
        move();
    }
    public void move3()
    {
        move();
        move();
        move();
    }
    public void pmove()
    
    {
        move();
        pickBeeper();
    }
    public void fancy()
    
    {
        turnLeft();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
    }
    public void better()
    
    {
        turnRight();
        move2();
        turnRight();
        move2();
        turnRight();
        move2();
        turnRight();
        move2();
    }
    public void t2()

    {
        turnLeft();
        move2();
        turnLeft();
        move2();
    }
    public void moveMile()
    
    {
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
    }
    public void moveBackward()
    {
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnRight();
        turnRight();
    }
    public void moveKiloMile() {
        for (int i = 0; i < 1000; i++) {
            moveMile();
        }
    }
    public void turnRightMove2() {
        for (int i = 0; i < 2; i++) {
            turnRightMove();
        }
    }
    public void movePut5() {
        for (int i = 0; i < 5; i++) {
            movePut();
        }
    }
    public void movePutMove3() {
        for (int i = 0; i < 3; i++) {
            movePut();
            move();
        }
    }
    public void putLeft()
    {
        putBeeper();
        turnLeft();
    }
    public void leftMove4()
    {
        turnLeft();
        move4();
    }
    public void lside()
        {
            turnLeft();
            move();
            turnRight();
            move();
            putBeeper();
    }
    public void inside()
    {
        putBeeper();
        move();
        turnLeft();
        move();
        putBeeper();
        turnRight();
        move();
        turnLeft();
        move();
        putBeeper();
    }
    public void lsidex()
    {
        lside();
        lside();
        lside();
    }
    public void updown()
    {
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        turnLeft();
        move();
        putBeeper();
    }
    public void insidex()
    {
        inside();
    }
    public void home()
    {
        turnRight();
        move4();
        turnRight();
        move();
        move();
        move();
        turnRight();
    }
    public void move4()
    {
        move();
        move();
        move();
        move();
    }
    public void move5()
    {
        move();
        move();
        move();
        move();
        move();
    }
    public void move6()
    {
        move();
        move();
        move();
        move();
        move();
        move();
    }
    public void moveR()
    {
        move();
        turnRight();
    }
    public void putMove()
    {
        putBeeper();
        move();
    }
    public void putMove3() {
        for (int i = 0; i < 3; i++) {
            putMove();
        }
    }
    public void putMove2() {
        for (int i = 0; i < 2; i++) {
            putMove();
        }
    }
    public void putRightMove()
    {
        putBeeper();
        turnRight();
        move();
    }
    public void goHome() 
    {
        move3();
        turnRight();
        move();
        turnRight();
        move3();
    }
    public void laneOne()
    {
        putMove3();
        putRightMove();
    }
    public void laneTwo()
    {
        turnRight();
        putMove2();
        putBeeper();
        turnAround();
    }
}
