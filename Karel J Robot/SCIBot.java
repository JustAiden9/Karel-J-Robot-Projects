
/**
 * This SCIBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;

public class SCIBot extends Robot {

  public SCIBot(int street, int avenue, Direction direction, int beepers) {
    super(street, avenue, direction, beepers);
  }

  public void exploreWorld() {
    for (int i = 0; i < 8; i++) 
    { 
      
       
        move();
        turnLeft();
      if (frontIsClear()) {
        move();
        //boolean isSmall = isSmallRoom();
        //System.out.println("Is the room small? " + isSmall);
        if (isSmallRoom()) {
          putBeeper();
        }
        exitRoom();
      }
      else
        {
            turnRight();
        }
    }
}

  private void moveIntoRoom() {
    
    move();
    
  }

  private void exitRoom() {
    turnRight();
    turnRight();
    move();
    turnLeft();
  }

  private boolean isSmallRoom() {
    turnLeft();
    boolean wallOnLeft = !frontIsClear();
    turnRight();
    boolean wallInFront = !frontIsClear();
    turnRight();
    boolean wallOnRight = !frontIsClear();
    turnLeft(); 
    return wallOnLeft && wallInFront && wallOnRight;
  }

  public void turnRight() {
    for (int i = 0; i < 3; i++) {
      turnLeft();
    }
  }
}