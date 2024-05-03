
import kareltherobot.*;
public class Replanter extends ReplanterBot 
{
    public Replanter(int street, int avenue, Direction direction, int beepers) 
    {
        super(street, avenue, direction, beepers);
}
    private static String world = "Replanter0";
    private static int delay = 3;

public static void main(String[] args) 
    {

        ReplanterBot replanter0 = new ReplanterBot(1, 1,East, -1);
        replanter0.replant();

        ReplanterBot replanter1 = new ReplanterBot(1, 1,East, -1);
        replanter1.replant();
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

