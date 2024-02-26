
/**
 * This RearrangeTheBeepers class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;

public class RearrangeTheBeepers implements Directions
{
    private static String world = "RearrangeTheBeepers";
    private static int delay = 3;
    
    
    public static void main(String args[])
    {
        MyBot a = new MyBot(1, 2, East, 0);
        a.move3();
        a.turnLeft();
        a.move();
        a.pickBeeper();
        a.pmove();
        a.pmove();
        a.pmove();
        a.pmove();
        a.turnLeft();
        a.move();
        a.move();
        a.turnLeft();
        a.move();
        a.move();
        a.fancy();
        a.turnRight();
        a.move();
        a.move();
        a.turnRight();
        a.move3();
        a.turnRight();
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
