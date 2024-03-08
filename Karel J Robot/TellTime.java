
/**
 * This TellTime class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;

public class TellTime implements Directions
{
    private static String world = "blank";
    private static int delay = 1;
public static void main(String args[])
    {
        TellTimeBot a = new TellTimeBot (3, 3, North, 200);
        a.start();
        a.one();
        a.one();
        a.mid();
        a.one();
        a.one();
        a.mid();
        a.six();
        a.nine();
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

