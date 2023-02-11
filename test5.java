import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class test5 extends JFrame implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b;

    test5()
    {
        f=new JFrame();
        l1=new JLabel("First No");
        t1=new JTextField(10);
        l2=new JLabel("Second No");
        t2=new JTextField(10);
        l3=new JLabel("Result");
        b=new JButton("ok");
        
        l1.setBounds(20,20,100,30);
        t1.setBounds(20,70,100,30);
        l2.setBounds(20,120,100,30);
        t2.setBounds(20,110,100,30);
        b.setBounds(20,160,100,30);
        l3.setBounds(20,190,100,30);

        b.addActionListener(this);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(b);

        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e)
    {
    
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int s=num1+num2;
        l3.setText("Sum is:"+s);
       
    }

    public static void main(String args[])
    {
        new test5();
    }
}