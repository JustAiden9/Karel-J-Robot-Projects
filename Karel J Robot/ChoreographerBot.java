import kareltherobot.*;
import java.awt.Color;
public class ChoreographerBot extends MyBot
{
    public ChoreographerBot(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    private MyBot bot2 = new MyBot(5, 6, South, infinity, Color.red);
    private MyBot bot3 = new MyBot(6, 5, North, infinity, Color.red);
    private MyBot bot4 = new MyBot(6, 6, East, infinity, Color.blue);
    public void plantMain()
    {
        laneOne();
        laneTwo();
        goHome();
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
    public void goHome()
    {
        move3();
        turnRight();
        move();
        turnRight();
        move3();
    }
    
    public void move()
    {
        super.move();
        bot2.move();
        bot3.move();
        bot4.move();
    }
    public void turnLeft()
    {
        super.turnLeft();
        bot2.turnLeft();
        bot3.turnLeft();
        bot4.turnLeft();
    }
    public void putBeeper()
    {
        super.putBeeper();
        bot2.putBeeper();
        bot3.putBeeper();
        bot4.putBeeper();
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnAround()
    {
        turnRight();
        turnRight();
    }
    public void putMove2()
    {
        putMove();
        putMove();
    }
    public void putRightMove()
    {
        putBeeper();
        turnRight();
        move();
    
    }
    public void putMove()
    {
        putBeeper();
        move();
    }
    public void move3()
    {
        move();
        move();
        move();
    }
}
