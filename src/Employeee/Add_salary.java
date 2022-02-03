package Employeee;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Add_salary extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2;
    
    Add_salary(){
        
        super("Set Salary");
       
        setLayout(new GridLayout(8,2,20,20));
        c2 = new Choice();
       
        try{
           conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
      
            while(rs.next()){
                c2.add(rs.getString("emp_id"));    
            }
        }catch(Exception e){ }
       
        add(new JLabel("     Employee Id"));
        add(c2);
       
        
        l1 = new JLabel("     HRA (House Rent Allowance)");
        t1 = new JTextField(15);
       
        
        add(l1);
        add(t1);
       
        l3 = new JLabel("     DA (Dearness Allowance)");
        t3 = new JTextField(15);
        add(l3);
        add(t3);
        
        l4 = new JLabel("     MA (Medical Allowance)");
        t4 = new JTextField(15);
        add(l4);
        add(t4); 
       
        l5 = new JLabel("     PF (Provident Fund)");
        t5 = new JTextField(15);
        add(l5);
        add(t5);
        
        l6 = new JLabel("     Basic Salary");
        t6 = new JTextField(15);
        add(l6);
        add(t6);
       
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        

        add(b1);
        add(b2);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        setSize(450,550);
        setLocation(400,200);
        setVisible(true);
       
        
        getContentPane().setBackground(new Color(240, 244, 195));
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
       if(ae.getSource()==b1){
        String hra = t1.getText();
        String id = c2.getSelectedItem();
        String da = t3.getText();
        String med = t4.getText();
        String pf = t5.getText();
        String basic = t6.getText();
        String qry = "insert into salary values("+ id +","+hra+","+da+","+med+","+pf+","+basic+")";
        // salary table
        try{
              conn c1 = new conn();
              c1.s.executeUpdate(qry);
              JOptionPane.showMessageDialog(null,"Salary updated");
             this.setVisible(false);
              new salarybox();
          }catch(Exception ee){
               ee.printStackTrace();
          }
       }
      if(ae.getSource()==b2){
            this.setVisible(false);
            new salarybox();
        }
    }
    
    
    public static void main(String[] args){
        new Add_salary();
    }
}


