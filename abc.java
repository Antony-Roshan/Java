import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class abc extends JFrame implements ActionListener 
{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;

    public abc()
    {
        setLayout(new FlowLayout());

        l1=new JLabel("No");
        t1=new JTextField(20);
        l2=new JLabel("Previous No");
        t2=new JTextField(20);
        l3=new JLabel("Next No");
        t3=new JTextField(20);
        b1=new JButton("Enter");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);

        b1.addActionListener(this);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

public void actionPerformed(ActionEvent e)
{
    int num1=Integer.parseInt(t1.getText());
    int p=num1-1;
    int n=num1+1;
    t2.setText(""+p);
    t3.setText(""+n);
}    

public static void main(String args[])
{
    abc obj=new abc();
}
}