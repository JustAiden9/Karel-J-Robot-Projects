
/**
 * This ClimbTheMountain class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;

public class ClimbTheMountain implements Directions
{
    private static String world = "ClimbTheMountain";
    private static int delay = 3;
    
    
    public static void main(String args[])
    {
        UrRobot a = new UrRobot(1, 2, East, 1);
        a.move();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.putBeeper();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.turnOff();
    } 

    static {
        World.reset();
        World.setBeeperColor(Color.red);
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}

