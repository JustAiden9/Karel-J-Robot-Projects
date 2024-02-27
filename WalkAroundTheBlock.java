/**
   @Author: (put your name here)
      Date: (put the date here)
  */

import kareltherobot.*;

public class WalkAroundTheBlock implements Directions
{
    private static String world = "WATB";
    private static int delay = 10;
    
    public static void main(String args[])  {
        UrRobot sarah = new UrRobot(3, 2, East, 0);
        sarah.move();
        sarah.move();
        sarah.move();
        sarah.move();
        sarah.turnLeft();
        sarah.move();
        sarah.move();
        sarah.move();
        sarah.turnLeft();
        sarah.move();
        sarah.move();
        sarah.move();
        sarah.move();
        sarah.turnLeft();
        sarah.move();
        sarah.move();
        sarah.move();
        sarah.turnLeft();
        sarah.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}