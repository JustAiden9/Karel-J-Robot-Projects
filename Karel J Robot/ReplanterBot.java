
/**
 * This ReplanterBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
/**
 * This Replanter class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;

public class ReplanterBot extends Robot {

    public ReplanterBot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    public void replant() {
        while(nextToABeeper()) {
            pickBeeper();
        }
        while(frontIsClear()) {
            moveToNextCorner();
            adjustBeepers();
        }
    }

    private void moveToNextCorner() {
        move();
        turnLeft();
        move();
        turnRight();
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void adjustBeepers() {
        if(nextToABeeper()) {
            pickAndPlantOne();
        } else {
            move();
            if(nextToABeeper()) {
                pickAndPlantOne();
            } else {
                move();
                if(nextToABeeper()) {
                    pickAndPlantOne();
                } else {
                    move();
                }
            }
        }
        turnAround();
    }

    private void pickAndPlantOne() {
        pickBeeper();
        move();
        putBeeper();
    }

    private void turnAround() {
        turnLeft();
        turnLeft();
    }
}
