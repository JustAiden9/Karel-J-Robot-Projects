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
    }
    
    //METHOD TO TEST FOR BEEPERS
    public void beeperTestScript() {
    int beepersCollected = 0;
    for (int i = 1; i <= 14; i++) {
        if (nextToABeeper()) {
            pickBeeper();
            beepersCollected++;
        }
        move();
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


