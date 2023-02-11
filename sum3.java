import java.awt.event.*;
import javax.swing.*;
public class sum3 extends JFrame implements ActionListener
{
JTextField t,t1;
JLabel t2,t3;
JButton b,b1;
JFrame f;
sum()
{
f=new JFrame();
t=new JTextField();
t1=new JTextField();
t2=new JLabel();
t3=new JLabel();
b=new JButton("ADD");
b1=new JButton("AVG");
t.setBounds(20,20, 80,30);
t1.setBounds(20,75, 80,30);
t2.setBounds(350,150, 150,30);
t3.setBounds(350,150, 150,30);
b.setBounds(100,120, 80,30);
b1.setBounds(200,170, 100,50);
b.addActionListener(this);
b1.addActionListener(this);
f.add(b);
f.add(b1);
f.add(t);
f.add(t1);
f.add(t2);
f.add(t3);
f.setSize(600,600);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e) 
{
try
{
t2.setText("Sum="+Integer.toString(Integer.valueOf(t1.getText())+Integer.valueOf(t.getText())));
}
catch(Exception ex)
{
System.out.println(ex);
}
try
{
t3.setText(Avg="+Integer.toString(Integer.valueOf((t1.getText())+Integer.valueOf(t.getText())/2));
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public static void main(String[] args)
{
new sum();
}
}
