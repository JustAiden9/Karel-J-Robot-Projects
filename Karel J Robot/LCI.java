
import kareltherobot.*;
public class LCI extends LCIBot
{

    public LCI(int street, int avenue, Direction direction, int beepers) 
    {
        super(street, avenue, direction, beepers);
}
    private static String world = "LargeCarpet1";
    private static int delay = 3;
    public static void main(String[] args) 
    {
        LCIBot robot1 = new LCIBot(1, 1, North, 100);
        robot1.turnRight();
        robot1.exploreWorld();
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
