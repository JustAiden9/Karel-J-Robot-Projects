
/**
 * This WallWalkerBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */

import kareltherobot.*;

public class WallWalkerBot extends Robot {

    public WallWalkerBot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    public void turnRight() {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }

    public boolean rightIsClear() {
        turnRight();
        boolean isClear = frontIsClear();
        turnLeft(); 
        return isClear;
    }

    public void followWallRight() {
        if (frontIsClear() && !rightIsClear())
            {  move();
            }
            if (!frontIsClear()&& !rightIsClear())
            {

                turnLeft();
            }
        while (rightIsClear()) {
            {
                turnRight();
                move();
            }
            while(rightIsClear() && (frontIsClear()))
            {    turnRight();
                move();
            }
        }
    }

}