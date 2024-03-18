
/**
 * This DesignMakerBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;
abstract class DesignMakerBot extends MyBot {
    DesignMakerBot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    abstract void coolEight();

    void makeDesign() {
        for(int i = 1; i <=4; i++) {
            move();
            coolEight();
        }
    }
}

