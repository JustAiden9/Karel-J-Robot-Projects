
/**
 * This DesignMaker class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;
public class DesignMaker implements Directions 
{
    private static String world = "Blank";
    private static int delay = 5;
    public static void main(String args[]) 
    {
        FirstDesignMakerBot bot1 = new FirstDesignMakerBot(5, 5, East, 200);
        bot1.makeDesign();
        SecondDesignMakerBot bot2 = new SecondDesignMakerBot(5, 5, East, 200);
        bot2.makeDesign();
    }
    static {
        World.reset();
        World.readWorld("Worlds",world + ".kwld");
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}


