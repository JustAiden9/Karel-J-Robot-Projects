
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
        EightBotsGardenerBot d = new EightBotsGardenerBot(5, 6, North, infinity, Color.red);
        EightBotsGardenerBot e = new EightBotsGardenerBot(5, 6, North, infinity, Color.red);
        EightBotsGardenerBot f = new EightBotsGardenerBot(6, 5, North, infinity, Color.red);
        EightBotsGardenerBot g = new EightBotsGardenerBot(6, 5, North, infinity, Color.red);
        EightBotsGardenerBot c = new EightBotsGardenerBot(6, 6, North, infinity, Color.blue);
        EightBotsGardenerBot h = new EightBotsGardenerBot(6, 6, North, infinity, Color.red);
    }
    static {
    World.reset();
    World.readWorld("Worlds",world + ".kwld"); 
    World.setDelay(15);
    World.setVisible(true);
    }
}
