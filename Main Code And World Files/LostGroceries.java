
/**
 * This LostGroceries class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;

public class LostGroceries implements Directions
{
    private static String world = "LostGroceries";
    private static int delay = 3;
    
    
    public static void main(String args[])
    {
        UrRobot a = new UrRobot(4, 5, East, 0);
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.pickBeeper();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.pickBeeper();
        a.turnLeft();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.pickBeeper();
        a.move();
        a.pickBeeper();
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
        a.move();
        a.turnLeft();
        a.move();
        a.putBeeper();
        a.move();
        a.putBeeper();
        a.move();
        a.putBeeper();
        a.move();
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


