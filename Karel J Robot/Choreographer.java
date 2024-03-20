
/**
 * This Choreographer class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;
public class Choreographer implements Directions
{
    private static String world = "Gardener";
    private static int delay = 3;
    public static void main(String args[])
    {
        ChoreographerBot a = new ChoreographerBot(5, 5, West, infinity, Color.red);
        a.fivefive();
        a.letsGo();
        
    }
    static {
    World.reset();
    World.readWorld("Worlds",world + ".kwld"); 
    World.setDelay(delay);
    World.setVisible(true);
    }
}
