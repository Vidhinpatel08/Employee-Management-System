package Employeee;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Attendanceview extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"Emp id","First Half","Second Half","Date Time"};
    String d[][]=new String[500][4];  
    int i=0,j=0;
    
    Attendanceview(){
        super("View Employees Attendence");
        setSize(800,300);
        setLocation(450,150);

        try{
            String q="select * from attendance";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("emp_id");
                d[i][j++]=rs.getString("first");
                d[i][j++]=rs.getString("second");
                d[i][j++]=rs.getString("Date");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);

        }catch(Exception e){}
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new Attendanceview().setVisible(true);
    }
}
