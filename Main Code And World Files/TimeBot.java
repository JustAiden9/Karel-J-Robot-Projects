
/**
 * This TimeBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;
public class TimeBot extends MyBot
{ 
    public TimeBot(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void displayZero()
    {
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
    }
    public void displayOne()
    {
        turnLeft();
        move();
        putBeeper();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
    }
    public void displayTime(int hour, int minute) {
        displayNumber(hour / 10); // Display tens digit of hour
        move();
        putBeeper(); // Colon
        move();
        displayNumber(hour % 10); // Display units digit of hour
        move();
        move();
        displayNumber(minute / 10); // Display tens digit of minute
        move();
        putBeeper(); // Colon
        move();
        displayNumber(minute % 10); // Display units digit of minute
    }
    private void displayNumber(int number) {
        switch (number) {
            case 0:
                displayZero();
                break;
            case 1:
                displayOne();
                break;
            // ... case statements for other numbers ...
            default:
                throw new RuntimeException("Invalid number: " + number);
        }
    }
}
