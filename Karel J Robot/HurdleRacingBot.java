
/**
 * This HurdleRacingBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class HurdleRacingBot extends Robot {
public HurdleRacingBot(int s, int a, Direction d, int b) {
        super(s,a,d,b);
    }
    public void hurdleRace() 
    {
        for (int i = 0; i < 12; i++) {
            while (frontIsClear()) {
                if (nextToABeeper()) {
                    pickBeeper();
                    turnOff();
                    return; // Exit the method if a beeper is picked up
                }
                move();
                if (nextToABeeper()) {
                    pickBeeper();
                    turnOff();
                    return; // Exit the method if a beeper is picked up after moving
                }
            }
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }
}
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    }
