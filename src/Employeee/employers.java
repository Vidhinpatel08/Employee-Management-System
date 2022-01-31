

package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class employers  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6;

    employers(){
        f=new JFrame("Employee Management");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/details.jpg"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("Employee Details");
        l2.setBounds(410,20,240,40);
        l2.setFont(new Font("serif",Font.BOLD,30));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Add");
        b1.setBounds(420,80,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("View");
        b2.setBounds(530,80,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Update");
        b3.setBounds(420,140,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Remove");
        b4.setBounds(530,140,100,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        l1.add(b4);
        
        b5=new JButton(" BACK ");
        b5.setBounds(420,210,100,40);
        b5.setFont(new Font("serif",Font.BOLD,15));
        b5.addActionListener(this);
        l1.add(b5);


        b6=new JButton(" EXIT ");
        b6.setBounds(530,210,100,40);
        b6.setFont(new Font("serif",Font.BOLD,15));
        b6.addActionListener(this);
        b6.setForeground(Color.red);
        l1.add(b6);

        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(400,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Search_Employee();
        }
        
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Remove_Employee();
        }
        
        if(ae.getSource()==b5){
            f.setVisible(false);
             new Home(); 
        }
        
        if(ae.getSource()==b6){
            f.setVisible(false);
           System.exit(0);
        }
        
    }

    public static void main(String[ ] arg){
        new employers();
    }
}