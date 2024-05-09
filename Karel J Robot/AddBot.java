
/**
 * This AddBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;

public class AddBot extends Robot {

  public AddBot(int street, int avenue, Direction direction, int beepers) {
    super(street, avenue, direction, beepers);
  }
  
  public void addColumn() {
        while (nextToABeeper()) {
            pickBeeper();
            move();
        }
    }

    public void findColumnSum() {
        while (anyBeepersInBeeperBag()) {
            putBeeper();
        }
        move();
        turnOff();
    }
}