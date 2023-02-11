import java.applet.*;
import java.awt.*;

public class micky extends Applet
{
    public void paint(Graphics g)
    {
        g.drawOval(100,100,150,150);
        g.setColor(Color.red);

        g.fillOval(130,130,40,40);
        g.fillOval(190,130,40,40);
        g.setColor(Color.green);

        g.drawArc(150,160,50,50,180,180);
        g.drawArc(160,195,30,20,180,180);

        int xpoints[]={20,100,70};
        int ypoints[]={20,150,30};
        int num=3;
        g.drawPolygon(xpoints,ypoints,num);
    }
}

/*
<applet code="micky.class" height="400" width="400">
</applet>
*/