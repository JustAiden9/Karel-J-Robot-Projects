
/**
 * This pinsetter class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;

public class pinsetter implements Directions
{
    private static String world = "Blank";
    private static int delay = 3;
public static void main(String args[])
    {
        MyBot a = new MyBot(1, 5, North, 10);
        a.move();
        a.putBeeper();
        a.lsidex();
        a.turnRight();
        a.move2();
        a.turnRight();
        a.insidex();
        a.updown();
        a.turnAround();
        a.move2();
        a.putBeeper();
        a.home();
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

