
/**
 * This Gardener class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.Color;

public class Gardener implements Directions
{
    private static String world = "Gardener";
    private static int delay = 5;
public static void main(String args[])
    {
        GardenerBot a = new GardenerBot (1, 1, North, 200);
        a.goToStart();
        a.plantQuadrant();
        a.plantQuadrant();
        a.plantQuadrant();
        a.plantQuadrant();
        a.goHome();
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
