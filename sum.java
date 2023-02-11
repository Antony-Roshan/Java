import java.awt.event.*;
import javax.swing.*;
public class sum extends JFrame implements ActionListener
{
    JFrame f;
    JTextField t1,t2;
    JLabel l1,l2;
    JButton b;
    
    sum()
    {
     f=new JFrame();
     l1=new JLabel("Sum of Numbers");
     l2=new JLabel();
     t1=new JTextField(10);
     t2=new JTextField(10);
     b=new JButton("ADD");

     l1.setBounds(20,20,80,30);
     t1.setBounds(20,70,80,30);
     t2.setBounds(20,120,80,30);
     b.setBounds(20,160,80,30);
     l2.setBounds(20,190,80,30);
    
     b.addActionListener(this);
     f.add(b);
     f.add(l1);
     f.add(l2);
     f.add(t1);
     f.add(t2);
     f.setSize(400,400);
     f.setLayout(null);
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
}
public void actionPerformed(ActionEvent e) 
{
try
{
    int num1=Integer.parseInt(t1.getText());
    int num2=Integer.parseInt(t2.getText());
    int sum=num1+num2;
    l2.setText("Sum is:"+sum);
}
catch(Exception ex)
{
System.out.println(e);
}
}
public static void main(String[] args)
{
new sum();
}
}
