
/**
 * This Time class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;

public class Time implements Directions
{
    private static String world = "Blank";
    private static int delay = 5;
public static void main(String args[])
    {
        TimeBot a = new TimeBot (5, 5, North, 100, Color.blue);
        a.displayOne();
        a.displayZero();
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

