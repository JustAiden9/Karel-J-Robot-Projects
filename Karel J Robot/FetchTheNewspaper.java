/**
   @Author: (put your name here)
      Date: (put the date here)
  */

import kareltherobot.*;

public class FetchTheNewspaper implements Directions
{
    private static String world = "FetchTheNewspaper";
    private static int delay = 3;
    
    public static void main(String args[])  {
        UrRobot a = new UrRobot(3, 4, West, 0);
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.pickBeeper();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.putBeeper();
        a.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}