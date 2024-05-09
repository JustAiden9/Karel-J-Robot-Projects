
/**
 * This WallWalker class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class WallWalker extends WallWalkerBot
{

    public WallWalker(int street, int avenue, Direction direction, int beepers) 
    {
        super(street, avenue, direction, beepers);
}
    private static String world = "Walls0";
    private static int delay = 3;
    public static void main(String[] args) 
    {
        WallWalkerBot robot1 = new WallWalkerBot(2, 7, North, 0);
        WallWalkerBot robot2 = new WallWalkerBot(2, 2, North, 0);
        WallWalkerBot robot3 = new WallWalkerBot(7, 2, North, 0);
        WallWalkerBot robot4 = new WallWalkerBot(7, 7, North, 0);
            robot1.followWallRight();
            robot2.followWallRight();
            robot3.followWallRight();
            robot4.followWallRight();
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
