
import kareltherobot.*;

public class MazeWalkerBot extends Robot {

    public MazeWalkerBot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }
      public void mazeWalker() {
        while (!facingEast()) {
            turnLeft();
        }
        while (!nextToABeeper()) {
            if(!frontIsClear()) {
                turnLeft();
            } else {
                move();
                turnRight();
                if(frontIsClear()) {
                    move();
                    turnRight();
                    if(frontIsClear()) {
                        move();
                    } else {
                        turnLeft();
                    }
                } else {
                    turnLeft();
                }
            }
        }
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
