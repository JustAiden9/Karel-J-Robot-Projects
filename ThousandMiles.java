
/**
 * This ThousandMiles class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */

import kareltherobot.*;

public class ThousandMiles implements Directions
{
    private static String world = "Blank";
    private static int delay = 3;
public static void main(String args[])
    {
        MyBot a = new MyBot(2, 4, North, 0);
        a.moveMile();
        a.moveBackward();
        a.moveKiloMile();
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
