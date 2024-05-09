
import kareltherobot.*;

public class ACIBot extends Robot {

    public ACIBot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    public void exploreWorld() {
        for (int i = 0; i < 8; i++) {
            move();
            turnLeft();
            if (isSmallRoom()) {
                exitRoom(); 
            } else if (isLargeRoom()) {
                exitRoom();
            }
            exit();
        }
    }

    private void moveIntoRoom() {
        while (frontIsClear()) {
            move();
        }
    }

    private void exitRoom() {
        turnRight();
        turnRight();
        while (frontIsClear()) {
            putBeeper();
            move();
        }

        while (!facingNorth()) {
            turnLeft();
        }
    }

    private void exit() {
        turnRight();
        turnRight();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }

    private boolean noTop() {
        boolean wallOnTop = frontIsClear();
        return wallOnTop;
    }

private boolean isLargeRoom() {
    while (frontIsClear()) {
        move();
        turnLeft();
        boolean wallOnLeft = !frontIsClear();
        turnRight();
        turnRight();
        boolean wallOnRight = !frontIsClear();
        turnLeft();
        if (noTop()) {
            for (int i = 0; i < 8; i++) {
                if (noTop()) {
                    move();
                    turnLeft();
                    boolean holeOnLeft = frontIsClear();
                    turnRight();
                    turnRight();
                    boolean holeOnRight = frontIsClear();
                    turnLeft();
                    if (holeOnLeft || holeOnRight) {
                        return false;
                    }
                } else {
                    break;
                }
            }
        }
        return wallOnLeft && wallOnRight;
    }
    return false;
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
