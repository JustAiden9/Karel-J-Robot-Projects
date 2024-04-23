
/**
 * This FlowerPlanterBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;

public class FlowerPlanterBot extends Robot {
    public FlowerPlanterBot(int s, int a, Direction d, int b) {
        super(s, a, d, b);
    }

    // MAIN START METHOD
    public void harvestFlowers() {
        repeatROWS();
    }

    // METHOD TO TEST FOR BEEPERS AND PLANT IF NEEDED
    public void beeperTestScript() {
        if (!nextToABeeper()) {  // Check if no beeper is present
            putBeeper();         // Plant a beeper if not present
        }
        move();                  // Move to the next corner
    }

    // EXTRA CODE
    public void leftRow() {
        for (int i = 0; i < 5; i++) {
            beeperTestScript();
        }
        leftUP();
    }

    public void rightRow() {
        for (int i = 0; i < 5; i++) {
            beeperTestScript();
        }
        rightUP();
    }

    public void repeatROWS() {
        for (int i = 0; i < 2; i++) {  // Repeat for two rows
            leftRow();
            rightRow();
        }
        leftRow();  // Last row
    }

    public void leftUP() {
        turnLeft();
        move();
        turnLeft();
    }

    public void rightUP() {
        turnRight();
        move();
        turnRight();
    }

    public void turnRight() {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }
}

