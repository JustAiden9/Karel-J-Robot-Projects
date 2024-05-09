
import kareltherobot.*;
public class ACI extends ACIBot
{

    public ACI(int street, int avenue, Direction direction, int beepers) 
    {
        super(street, avenue, direction, beepers);
}
    private static String world = "ExtraLargeCarpet0"; //LargeCarpet0, SmallCarpet0, ExtraLargeCarpet0
    private static int delay = 3;
    public static void main(String[] args) 
    {
        ACIBot robot1 = new ACIBot(1, 1, North, 100);
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
