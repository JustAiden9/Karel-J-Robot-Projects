import kareltherobot.*;
import java.awt.Color;
public class ChoreographerBot extends MyBot
{
    public ChoreographerBot(int s, int a, Direction d, int b, Color c)
    {
        super(s,a,d,b,c);
    }
    public void letsGo() {
        ChoreographerBot bot2 = new ChoreographerBot(5, 6, South, infinity, Color.red);
        ChoreographerBot bot3 = new ChoreographerBot(6, 5, North, infinity, Color.red);
        ChoreographerBot bot4 = new ChoreographerBot(6, 6, East, infinity, Color.blue);
        fivefive();
        bot2.fivefive();
        bot3.fivefive();
        bot4.fivefive();
    }
    public void fivefive()
    {
        laneOne();
        laneTwo();
        move3();
        goHome();
    }
}
