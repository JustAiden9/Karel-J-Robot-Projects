import kareltherobot.*;
import java.awt.Color;
public class FlowerHarvester1 extends Robot 
{
    public FlowerHarvester1(int street, int avenue, Direction direction, int beepers, Color color) 
    {
        super(street, avenue, direction, beepers, color);
    }
    private static String world = "FlowerHarvest2";
    private static int delay = 3;
    public static void main(String args[]) {
        FlowerHarvester1 bot = new FlowerHarvester1(1, 1, East, 0, Color.blue);
        bot.harvestFlowers();
        bot.turnOff();
    }
    public void harvestFlowers() {
    int beepersCollected = 0;
    while (frontIsClear()) {
        while (nextToABeeper()) {
            pickBeeper();
            beepersCollected++;
        }
        if (beepersCollected == 5) {
            break; 
        }
        move();
    }
    while (nextToABeeper()) {
        pickBeeper();
        beepersCollected++;
    }
    if (beepersCollected == 5) {
        turnOff();
    }
}
static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
        }
}
