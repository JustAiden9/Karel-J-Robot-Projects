
/**
 * This PlantingField class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;
public abstract class BeeperRowLayer extends MyBot {
    public BeeperRowLayer(int street, int avenue, Direction direction, int beepers, Color color) {
        super(street, avenue, direction, beepers, color);
    }

    public abstract void putBeepers();

    public void layBeepers() {
        for(int i = 1; i <= 4; i++) {
            move();
            putBeepers();
        }
    }
}

