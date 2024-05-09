
/**
 * This MazeWalker class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class MazeWalker extends MazeWalkerBot
{

    public MazeWalker(int street, int avenue, Direction direction, int beepers) 
    {
        super(street, avenue, direction, beepers);
}
    private static String world = "maze";
    private static int delay = 3;
    public static void main(String[] args) 
    {
        MazeWalkerBot robot1 = new MazeWalkerBot(1, 1, North, 100);
        robot1.mazeWalker();
        robot1.turnOff();
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
