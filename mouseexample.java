import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class mouseexample extends Applet implements MouseListener,MouseMotionListener 
{
    JLabel l1;

    public mouseexample()
    {
        l1=new JLabel();
        l1.setBounds(20,50,100,30);
        addMouseListener(this);
        addMouseMotionListener(this);
        add(l1);
    }

   public void mouseClicked(MouseEvent e)
{
    l1.setText("Mouse CLICKED: "+e.getX()+","+e.getY());
}

public void mouseEntered(MouseEvent e)
{
    l1.setText("Mouse ENTERED: "+e.getX()+","+e.getY()); 
    for(int i=0;i<100000;i++);
}

public void mouseExited(MouseEvent e)
{
    l1.setText("Mouse EXITED: "+e.getX()+","+e.getY());
}

public void mousePressed(MouseEvent e)
{
    l1.setText("Mouse PPRESSED: "+e.getX()+","+e.getY());
}
public void mouseReleased(MouseEvent e)
{
    l1.setText("Mouse RELEASED: "+e.getX()+","+e.getY());
}

public void mouseMoved(MouseEvent e)
{
    l1.setText("Mouse MOVED: "+e.getX()+","+e.getY());
}

public void mouseDragged(MouseEvent e)
{
    l1.setText("Mouse DRAGGED: "+e.getX()+","+e.getY());
}

public static void main(String args[])
{
    new mouseexample();
}
}

/*
<applet code = "mouseexample.class" height = 600 width=600>
</applet>
*/
