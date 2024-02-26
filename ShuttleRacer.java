
/**
 * This ShuttleRacer class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */

import kareltherobot.*;

public class ShuttleRacer implements Directions
{
    private static String world = "ShuttleRacer";
    private static int delay = 15;
public static void main(String args[])
    {
        MyBot a = new MyBot(2, 4, North, 0);
        a.turnRight();
        a.move();
        a.t2();
        a.better();
        a.turnLeft();
        a.move2();
        a.turnLeft();
        a.move();
        a.turnLeft();
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
