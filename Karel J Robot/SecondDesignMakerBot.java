
/**
 * This SecondDesignMakerBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;
class SecondDesignMakerBot extends DesignMakerBot {
    SecondDesignMakerBot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }
    void coolEight() {
        putBeeper();
        move();
        putBeeper();
        turnRight();
    }
}
