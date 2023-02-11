import java.awt.event.*;
import java.applet.*;
import java.awt.*;

public class test4 extends Applet implements ActionListener
{
    int h=0;
    Button b;
    public test4()
    {
        b=new Button("Click for smiley");
        add(b);
        b.addActionListener(this);  
    }

    public void actionPerformed(ActionEvent e)
    {
        h=1;
        repaint();
    }

    public void paint(Graphics g)
    {
        if(h==1)
        {
            g.drawOval(80, 70, 150, 150);
            g.fillOval(120, 120, 15, 15);
            g.fillOval(170, 120, 15, 15);
            g.drawArc(130, 180, 50, 20, 180, 180);
        }
    }
}

/*
<applet code="test4" height=600 width=600>
</applet>
*/