
/**
 * This FlowerPlanterBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class FlowerPlanterBot extends Robot {

    public FlowerPlanterBot(int s, int a, Direction d, int b) {
        super(s,a,d,b);
    }
    
     public void harvestFlowers() 
    {
        repeatROWS();
        beeperTestScript();
    }
    
    //METHOD TO TEST FOR BEEPERS
    public void beeperTestScript() {
    int cornersChecked = 0;
    while (cornersChecked < 14) {
        if (nextToABeeper()) {
            move();
        } else {
            putBeeper();
            move();
        }
        cornersChecked++;
    }
    
    // Check if the robot is not on the last corner of the row
    if (!nextToABeeper()) {
        putBeeper();
    }
}


    
    
    
    //ROW CODE
    public void leftRow()
    {
        beeperTestScript();
        leftUP();
    }
    public void rightRow()
    {
        beeperTestScript();
        rightUP();
    }
    public void repeatROWS()
    {
        leftRow();
        rightRow();
        leftRow();
        rightRow();
    }
    
    //EXTRA CODE
    public void placeFive()
    {
        leftUP();
        for (int i = 0; i < 5; i++) {
            putMove();
        }
    }
    public void turnRight()
    {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }
    public void leftUP()
    {
        turnLeft();
        move();
        turnLeft();
    }
    public void rightUP()
    {
        turnRight();
        move();
        turnRight();
    }
    public void putMove()
    {
        putBeeper();
        move();
    }
}

