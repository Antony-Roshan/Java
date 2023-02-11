import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class smiley extends Applet implements ActionListener
{
    int h = 0;
    Button button1;
    public smiley()
    {
        button1 = new Button("Click for SMILEY");
        add(button1);
        button1.addActionListener(this);
   }

public void actionPerformed(ActionEvent e) {
h=1;
repaint();
}

public void paint(Graphics g)
{
if(h == 1)
{
g.drawOval(80, 70, 150, 150);
g.setColor(Color.BLACK);
g.fillOval(120, 120, 15, 15);
g.fillOval(170, 120, 15, 15);
g.drawArc(130, 180, 50, 20, 180, 180);
}
}
}

/* <body>
<applet code = "smiley" height = 600 width=600>
</applet>
</body> */
