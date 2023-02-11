import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Mouse extends Applet implements MouseListener,MouseMotionListener 
{
    Label tt;
    public Mouse()
    {
        tt=new Label();
        tt.setBounds(50,50,200,200);
        addMouseListener(this);
        addMouseMotionListener(this);
        add(tt);
    }

public void mouseClicked(MouseEvent e)
{
    tt.setText("Mouse CLICKED: "+e.getX()+","+e.getY());
}

public void mouseEntered(MouseEvent e)
{
    tt.setText("Mouse ENTERED: "+e.getX()+","+e.getY()); 
    for(int i=0;i<100000;i++);
}

public void mouseExited(MouseEvent e)
{
    tt.setText("Mouse EXITED: "+e.getX()+","+e.getY());
}

public void mousePressed(MouseEvent e)
{
    tt.setText("Mouse PPRESSED: "+e.getX()+","+e.getY());
}
public void mouseReleased(MouseEvent e)
{
    tt.setText("Mouse RELEASED: "+e.getX()+","+e.getY());
}

public void mouseMoved(MouseEvent e)
{
    tt.setText("Mouse MOVED: "+e.getX()+","+e.getY());
}

public void mouseDragged(MouseEvent e)
{
    tt.setText("Mouse DRAGGED: "+e.getX()+","+e.getY());
}

public static void main(String args[])
{
    Mouse obj=new Mouse();
}
}

/*
<applet code = "Mouse.class" height = 600 width=600>
</applet>
*/
