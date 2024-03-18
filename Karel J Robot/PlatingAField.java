
/**
 * This PlantingFieldBot class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;

public class PlatingAField implements Directions
{
    private static String world = "Blank";
    private static int delay = 5;
public static void main(String args[])
    {
        BeeperRowLayer a = new ThreeBeeperRowLayer (1, 1, East, 200, Color.blue);
        a.layBeepers();
        BeeperRowLayer b = new TwoBeeperRowLayer (2, 1, East, 200, Color.blue);
        b.layBeepers();
        BeeperRowLayer c = new ThreeBeeperRowLayer (3, 1, East, 200, Color.blue);
        c.layBeepers();
        BeeperRowLayer d = new TwoBeeperRowLayer (4, 1, East, 200, Color.blue);
        d.layBeepers();
        BeeperRowLayer e = new ThreeBeeperRowLayer (5, 1, East, 200, Color.blue);
        e.layBeepers();
    }
    
    static {
        World.reset();
        World.readWorld("Worlds",world + ".kwld");
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}