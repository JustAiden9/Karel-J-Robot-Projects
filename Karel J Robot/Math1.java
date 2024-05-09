
/**
 * This Math1 class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
public class Math1 extends AddBot
{

    public Math1(int street, int avenue, Direction direction, int beepers) 
    {
        super(street, avenue, direction, beepers);
}
    private static String world = "Math1";
    private static int delay = 3;
    public static void main(String[] args) 
    {
        AddBot robot1 = new AddBot(1, 1, North, 100);
        robot1.addColumn();
        robot1.findColumnSum();
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
