

package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Home  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6;

    Home(){
        f=new JFrame("HOME PAGE");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,700,400);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/Home.jpg"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("HOME ICONE");
        l2.setBounds(400,20,240,40);
        l2.setFont(new Font("serif",Font.BOLD,30));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Employee");
        b1.setBounds(380,80,120,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setForeground(new Color(0,0,0));
    	b1.setBackground(new Color(255,255,255));
        l1.add(b1);


        b2=new JButton("Salary");
        b2.setBounds(530,80,120,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        b2.setForeground(new Color(0,0,0));
    	b2.setBackground(new Color(255,255,255));
        l1.add(b2);

        b3=new JButton("Attendance");
        b3.setBounds(380,140,120,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        b3.setForeground(new Color(0,0,0));
    	b3.setBackground(new Color(255,255,255));
        l1.add(b3);

        b4=new JButton("About");
        b4.setBounds(530,140,120,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        b4.setForeground(new Color(0,0,0));
    	b4.setBackground(new Color(255,255,255));
        l1.add(b4);
        
       /* b5=new JButton(" Contact-Us ");
        b5.setBounds(420,200,100,40);
        b5.setFont(new Font("serif",Font.BOLD,15));
        b5.addActionListener(this);
        l1.add(b5);*/


        b6=new JButton(" EXIT ");
        b6.setBounds(440,200,150,40);
        b6.setFont(new Font("serif",Font.BOLD,15));
        b6.addActionListener(this);
        b6.setForeground(Color.red);
    	b6.setBackground(new Color(255,255,255));
        l1.add(b6);

        f.setVisible(true);
        f.setSize(700,400);
        f.setLocation(400,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
           new employers();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new salarybox();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new attendancebox();
        }
        
        if(ae.getSource()==b4){
            f.setVisible(false);
            new AboutUs().setVisible(true);	
        }
        
       /* if(ae.getSource()==b5){
            f.setVisible(false);
             new contact(); 
        }*/
        
        if(ae.getSource()==b6){
            f.setVisible(false);
           System.exit(0);
        }
        
    }

    public static void main(String[ ] arg){
        new Home();
    }
}
