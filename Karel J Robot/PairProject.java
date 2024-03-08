
/**
 * This PairProject class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;

public class PairProject implements Directions
{
    private static String world = "Star1";
    private static int delay = 5;
public static void main(String args[])
    {
        PairBot a = new PairBot (1, 5, North, 0, Color.blue);
        a.middle();
        a.center();
        a.turnLeft();
        a.sides();
        a.place();
        a.home();
        a.turnOff();
    } 

    static {
        World.reset();
        World.readWorld("Worlds",world + ".kwld"); 
        World.setBeeperColor(Color.yellow);
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
