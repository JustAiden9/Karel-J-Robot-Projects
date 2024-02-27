
/**
 * This TellTimeBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class TellTimeBot extends MyBot
{ 
    public TellTimeBot(int s, int a, Direction d, int b)
    {
        super(s,a,d,b);
    }
    public void start()
    {
        turnRight();
    }
    public void one()
    {
        turnRight();
        move();
        turnAround();
        movePutR();
        turnAround();
        move4();
        turnLeft();
        move();
    }
    public void two()
    {
        movePutR2();
        turnAround();
        move3();
        turnRight();
        moveR();
        move();
        putBeeper();
        twoHelp();
        turnRight();
        twoHelp();
        movePut();
        move();
        turnLeft();
        movePut();
        movePut();
        move();
        turnLeft();
        move();
        putBeeper();
        move4();
        turnLeft();
        move5();
    }
    public void twoHelp()
    {
        move();
        turnLeft();
        move();
        putBeeper();
    }
    public void three()
    {
        PutMoveR2();
        turnLeft();
        PutMoveR();
        turnAround();
        move();
        turnRight();
        PutMoveR2();
        turnAround();
        move2();
        turnLeft();
        movePut();
        movePut();
        turnLeft();
        movePutR3();
        turnAround();
        move4();
        turnRight();
        move4();
        turnLeft();
    }
    public void four()
    {
        move2();
        turnRight();
        move();
        turnAround();
        movePutR();
        turnAround();
        move2();
        turnRight();
        movePut();
        movePut();
        turnRight();
        movePut();
        movePut();
        turnAround();
        move4();
        turnLeft();
        move3();
    }
    public void five()
    {
        movePutR2();
        turnLeft();
        movePutR3();
        turnLeft();
        movePutR6();
        turnRight();
        movePutR3();
        turnRight();
        movePutR6();
        move();
        turnRight();
        move4();
        turnLeft();
    }
    public void six()
    {
        movePutR2();
        turnLeft();
        movePutR3();
        turnLeft();
        movePutR6();
        turnRight();
        movePutR3();
        turnAround();
        move2();
        movePut();
        turnAround();
        move3();
        turnRight();
        movePut();
        move3();
        turnRight();
        move4();
        turnLeft();
    }
    public void seven()
    {
        sevenHelpR();
        turnLeft();
        PutMove();
        putBeeper();
        turnLeft();
        movePutR3();
        turnLeft();
        move4();
        turnLeft();
        move4();
    }
    public void zero()
    {
        movePutR2();
        turnLeft();
        movePutR2();
        turnLeft();
        movePutR6();
        turnLeft();
        movePutR6();
        move();
        turnLeft();
        move4();
    }
    public void eight()
    {
        movePutR2();
        turnLeft();
        movePutR2();
        turnLeft();
        movePutR6();
        turnLeft();
        movePutR6();
        turnAround();
        move();
        turnRight();
        movePutR3();
        move();
        turnRight();
        move2();
        turnLeft();
        move();
    }
    public void nine()
    {
        movePutR2();
        turnLeft();
        movePutR2();
        turnLeft();
        movePutR6();
        turnLeft();
        movePutR3();
        turnLeft();
        movePutR6();
        turnRight();
        move2();
        turnLeft();
        move();
    }
    public void mid()
    {
        move();
        turnLeft();
        move();
        putBeeper();
        move2();
        putBeeper();
        turnAround();
        move3();
        turnLeft();
        move();
    }
    public void sevenHelp()
    {
        move();
        turnLeft();
        putBeeper();
        move();
        turnRight();
    }
    public void PutMove()
    {
        putBeeper();
        move();
    }
    public void back33()
    {
        turnAround();
        move4();
        turnRight();
    }
    public void sevenHelpR() {
        for (int i = 0; i < 3; i++) {
            sevenHelp();
        }
    }
    public void movePutR() {
        for (int i = 0; i < 5; i++) {
            movePut();
        }
    }
    public void PutMoveR() {
        for (int i = 0; i < 3; i++) {
            PutMove();
        }
    }
    public void PutMoveR2() {
        for (int i = 0; i < 2; i++) {
            PutMove();
        }
    }
    public void movePutR6() {
        for (int i = 0; i < 3; i++) {
            movePut();
        }
    }
    public void movePutR2() {
        for (int i = 0; i < 4; i++) {
            movePut();
        }
    }
    public void movePutR3() {
        for (int i = 0; i < 2; i++) {
            movePut();
        }
    }
}
