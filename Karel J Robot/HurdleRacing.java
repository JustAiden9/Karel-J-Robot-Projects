
/**
 * This HurdleRacing class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class HurdleRacing extends HurdleRacingBot 
{
    public HurdleRacing(int street, int avenue, Direction direction, int beepers) 
    {
        super(street, avenue, direction, beepers);
}
    private static String world = "Hurdler1";
    private static int delay = 3;
    public static void main(String[] args) 
    {
        HurdleRacing bot = new HurdleRacing(1, 1, East, 200);
        bot.hurdleRace();
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
