
/**
 * This BuildAHouse class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;

public class BuildAHouse implements Directions
{
    private static String world = "Blank";
    private static int delay = 3;
    public static void main(String args[]) {
        Contractor contractor = new Contractor (1, 3, North, infinity, Color.red);
        contractor.performTask();
    }
    static {
    World.reset();
    World.readWorld("Worlds",world + ".kwld"); 
    World.setDelay(delay);
    World.setVisible(true);
    }
}
