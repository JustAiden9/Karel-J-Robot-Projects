/**
   @Author: (put your name here)
      Date: (put the date here)
  */

import kareltherobot.*;

public class MyFirstRobot implements Directions
{
    private static String world = "MyFirstRobot";
    private static int delay = 50;
    
    public static void main(String args[])  {
        UrRobot karel = new UrRobot(2, 2, East, 0);  
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.putBeeper();
        karel.move();
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}