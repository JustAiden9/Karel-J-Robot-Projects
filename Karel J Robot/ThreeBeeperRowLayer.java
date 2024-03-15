
/**
 * This ThreeBeeperRowLayer class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;
public class ThreeBeeperRowLayer extends BeeperRowLayer {
    public ThreeBeeperRowLayer(int street, int avenue, Direction direction, int beepers, Color color) {
        super(street, avenue, direction, beepers, color);
    }

    @Override
    public void putBeepers() {
        putBeeper();
        putBeeper();
        putBeeper();
    }
}
