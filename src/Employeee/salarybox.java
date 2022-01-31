

package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class salarybox implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b5,b6;

    salarybox(){
        f=new JFrame(" Salary Management ");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/details.jpg"));
        l1.setIcon(i1);
        f.add(l1);
        
        
        b1=new JButton("Add salary");
        b1.setBounds( 420,30,210,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);
        
        b2=new JButton("Update salary");
        b2.setBounds( 420,80, 210,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        l1.add(b2);
      
        b3=new JButton("Generate Payment slip");
        b3.setBounds( 420,130, 210,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        l1.add(b3);
      
        b5=new JButton(" BACK ");
        b5.setBounds(420,200,100,40);
        b5.setFont(new Font("serif",Font.BOLD,15));
        b5.addActionListener(this);
        l1.add(b5);


        b6=new JButton(" EXIT ");
        b6.setBounds(530,200,100,40);
        b6.setFont(new Font("serif",Font.BOLD,15));
        b6.addActionListener(this);
        b6.setForeground(Color.red);
        l1.add(b6);
        
        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(375,175);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_salary();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
           new Update_salary();
        } 
        
        if(ae.getSource()==b3){
            f.setVisible(false);
          new pay_slip().setVisible(true);
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
         new salarybox();
    }
}