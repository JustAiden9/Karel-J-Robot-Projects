/**
   ;p - aiden
   
  */
import kareltherobot.*;
public class FlowerHarvestBot extends Robot 

{
    public FlowerHarvestBot(int s, int a, Direction d, int b)
    {
        super(s,a,d,b);
    }
    
    //MAIN START METHOD
    public void harvestFlowers() 
    {
        repeatROWS();
        beeperTestScript();
        placeFive();
    }
    
    //METHOD TO TEST FOR BEEPERS
    public void beeperTestScript()
    {
        int beepersCollected = 0;
        while (frontIsClear()) {
        while (nextToABeeper()) {
            pickBeeper();
            beepersCollected++;
        }
        if (beepersCollected == 5) {
            break; 
        }
        move();
        }
        while (nextToABeeper()) {
        pickBeeper();
        beepersCollected++;
        }
    }
    
    //EXTRA CODE
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
    public void placeFive()
    {
        leftUP();
        for (int i = 0; i < 5; i++) {
            putMove();
        }
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
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
    public void repeatROWS()
    {
        leftRow();
        rightRow();
        leftRow();
        rightRow();
    }
}


