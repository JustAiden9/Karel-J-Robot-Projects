
/**
 * This FiveRobotsTT class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;
public class FiveRobotsTT implements Directions
{
    private static String world = "Blank";
    private static int delay = 3;
    public static void main(String args[])
    {
        FiveRobotsTTBot a = new FiveRobotsTTBot(3, 2, North, infinity, Color.red);
        a.zeroMain();
        FiveRobotsTTBot b = new FiveRobotsTTBot(3, 7, North, infinity, Color.blue);
        b.nineMain();
        FiveRobotsTTBot c = new FiveRobotsTTBot(3, 12, North, infinity, Color.blue);
        c.midMain();
        FiveRobotsTTBot d = new FiveRobotsTTBot(3, 14, North, infinity, Color.red);
        d.fiveMain();
        FiveRobotsTTBot e = new FiveRobotsTTBot(3, 19, North, infinity, Color.red);
        e.twoMain();
    }
    static {
    World.reset();
    World.readWorld("Worlds",world + ".kwld"); 
    World.setDelay(15);
    World.setVisible(true);
    }
}