
/**
 * This SCI class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class SCI extends SCIBot
{

    public SCI(int street, int avenue, Direction direction, int beepers) 
    {
        super(street, avenue, direction, beepers);
}
    private static String world = "SmallCarpet1";
    private static int delay = 3;
    public static void main(String[] args) 
    {
        SCIBot robot1 = new SCIBot(1, 1, North, 100);
        robot1.turnRight();
        robot1.exploreWorld();
}
static 
        {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
