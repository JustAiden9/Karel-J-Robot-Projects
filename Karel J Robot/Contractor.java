
/**
 * This Contractor class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import java.awt.Color;
import kareltherobot.*;

class Contractor extends UrRobot{
    public Contractor(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    private Mason mason = new Mason (1, 2, North, infinity, Color.red);
    private Carpenter carpenter = new Carpenter (1, 8, North, infinity, Color.red);
    private Roofer roofer = new Roofer(1, 9, North, infinity, Color.blue);
    public void performTask() 
    {
        carpenter.carpenter();
        mason.mason();
        roofer.roofer();
    }
}