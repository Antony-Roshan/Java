import java.applet.*;
import java.awt.*;
public class Banner extends Applet implements Runnable {
String text = " MCA 3A";
Thread t;
public void init()
{
setBackground(Color.white);
}
public void start()
{
t = new Thread(this);
t.start();
}
public void run()
{
while(true)
{
try
{
repaint();
Thread.sleep(1000);
text = text.substring(1) + text.charAt(0);
}
catch(Exception e)
{
}
}
}
public void paint(Graphics g)
{
g.setFont(new Font("TimesRoman",Font.BOLD,15));
g.drawString(text,200,200); 
}

}
/*
<applet code = Banner.class width=600 height=600>
</applet>
*/