import kareltherobot.*;
import java.awt.*;
public class Choreographer implements Directions
{
    private static String world = "Gardener";
    private static int delay = 3;
    public static void main(String args[]) {
        ChoreographerBot bot = new ChoreographerBot(5, 5, West, infinity, Color.blue);
        bot.letsGo();
    }
    static {
    World.reset();
    World.readWorld("Worlds",world + ".kwld"); 
    World.setDelay(delay);
    World.setVisible(true);
    }
}
