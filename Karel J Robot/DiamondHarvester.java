
/**
 * This DiamondHarvester class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;

public class DiamondHarvester implements Directions
{
    private static String world = "DiamondHarvester";
    private static int delay = 3;
public static void main(String args[])
    {
        DiaHBot a = new DiaHBot(1, 5, North, 0);
        a.movePick();
        a.leftExtra();
        a.moveRight();
        a.midOneExtra();
        a.movePick();
        a.moveLeft();
        a.midTwoExtra();
        a.movePickRight();
        a.lastStrechExtra();
        a.GETBACK();
        a.turnOff();
    } 

    static {
        World.reset();
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
