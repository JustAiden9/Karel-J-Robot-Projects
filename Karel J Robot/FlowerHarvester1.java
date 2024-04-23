/**
   ;p - aiden
   
  */
import kareltherobot.*;
public class FlowerHarvester1 extends FlowerHarvestBot 
{
    public FlowerHarvester1(int street, int avenue, Direction direction, int beepers) 
    {
        super(street, avenue, direction, beepers);
}
    private static String world = "FlowerHarvest1";
    private static int delay = 3;
    public static void main(String[] args) 
    {
        FlowerHarvester1 bot = new FlowerHarvester1(1, 1, East, 0);
        bot.harvestFlowers();
        bot.turnOff();
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
