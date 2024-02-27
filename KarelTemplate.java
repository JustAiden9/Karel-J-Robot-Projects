/**
   @Author: (put your name here)
      Date: (put the date here)
  */

import kareltherobot.*;

public class KarelTemplate implements Directions
{
    private static String world = ""; // insert the world name between the quotes
    private static int delay = 3;
    
    public static void main(String args[])  {
        // put your robot instructions here
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}