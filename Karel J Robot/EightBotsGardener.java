
/**
 * This EightBotsGardener class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;
public class EightBotsGardener implements Directions
{
    private static String world = "Gardener";
    private static int delay = 3;
    public static void main(String args[])
    {
        EightBotsGardenerBot a = new EightBotsGardenerBot(5, 5, West, infinity, Color.red);
        a.fivefive();
        EightBotsGardenerBot b = new EightBotsGardenerBot(5, 5, South, infinity, Color.blue);
        b.fivefive();
        EightBotsGardenerBot d = new EightBotsGardenerBot(5, 6, South, infinity, Color.red);
        d.fivefive();
        EightBotsGardenerBot e = new EightBotsGardenerBot(5, 6, East, infinity, Color.red);
        e.fivefive();
        EightBotsGardenerBot f = new EightBotsGardenerBot(6, 5, North, infinity, Color.red);
        f.fivefive();
        EightBotsGardenerBot g = new EightBotsGardenerBot(6, 5, West, infinity, Color.red);
        g.fivefive();
        EightBotsGardenerBot c = new EightBotsGardenerBot(6, 6, East, infinity, Color.blue);
        c.fivefive();
        EightBotsGardenerBot h = new EightBotsGardenerBot(6, 6, North, infinity, Color.red);
        h.fivefive();
    }
    static {
    World.reset();
    World.readWorld("Worlds",world + ".kwld"); 
    World.setDelay(delay);
    World.setVisible(true);
    }
}
