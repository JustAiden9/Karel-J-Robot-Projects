/**
 * This RobotSaysHello class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
import kareltherobot.*;
import java.awt.*;
public class RobotsSayHello implements Directions
{
    private static String world = "Blank";
    private static int delay = 1;
    public static void main(String args[])
    {
        Robot1 a = new Robot1(3, 2, North, infinity, Color.red);
        a.start1();
        Robot2 b = new Robot2(3, 3, North, infinity, Color.blue);
        b.start2();
        Robot2 c = new Robot2(3, 4, North, infinity, Color.blue);
        c.start2();
        Robot1 d = new Robot1(3, 5, North, infinity, Color.red);
        d.start1();
        Robot1 e = new Robot1(3, 7, North, infinity, Color.red);
        e.start1();
        Robot3 f = new Robot3(3, 8, North, infinity, Color.orange);
        f.start3();
        Robot3 g = new Robot3(3, 9, North, infinity, Color.orange);
        g.start3();
        Robot1 h = new Robot1(3, 11, North, infinity, Color.red);
        h.start1();
        Robot4 i = new Robot4(3, 12, North, infinity, Color.yellow);
        i.start4();
        Robot4 j = new Robot4(3, 13, North, infinity, Color.yellow);
        j.start4();
        Robot1 k = new Robot1(3, 15, North, infinity, Color.red);
        k.start1();
        Robot4 l = new Robot4(3, 16, North, infinity, Color.yellow);
        l.start4();
        Robot4 m = new Robot4(3, 17, North, infinity, Color.yellow);
        m.start4();
        Robot1 n = new Robot1(3, 19, North, infinity, Color.red);
        n.start1();
        Robot5 o = new Robot5(3, 20, North, infinity, Color.green);
        o.start5();
        Robot5 p = new Robot5(3, 21, North, infinity, Color.green);
        p.start5();
        Robot1 q = new Robot1(3, 22, North, infinity, Color.red);
        q.start1();
    }
    static {
    World.reset();
    World.readWorld("Worlds",world + ".kwld"); 
    World.setDelay(15);
    World.setVisible(true);
    }
}