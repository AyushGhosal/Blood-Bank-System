import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.sql.SQLException;
public class Receproceed extends JFrame implements ActionListener{
    Random ran=new Random();
    int n=ran.nextInt(999999);
    JButton add,back;
    JTextField laname,fad,fphn,fem,bid,fidproof,date,mode,gid;
    JLabel rid;
    JDateChooser dc;
    JComboBox cb;
    Receproceed()
    {
        getContentPane().setBackground(new Color(255,250,102));
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/images1.png")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(255, 196, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(440 , 110 , 200 ,200); // direct we cant print image so use jlabel
        add(image);
        
      JLabel heading = new JLabel("ADD YOUR DETAILS"); // component
        heading.setBounds(200 , 20, 500 , 30); 
        heading.setFont(new Font("serif", Font.BOLD,30));
        heading.setForeground(Color.BLACK);
        add(heading);  
        
        JLabel lname=new JLabel("NAME");
        lname.setBounds(50,100,150 ,30);
        lname.setFont(new Font("TAHOMA", Font.BOLD,20));
        add(lname);
        laname=new JTextField();
        laname.setBounds(200,100,150,30);
        add(laname);
        JLabel faname=new JLabel("BAR ID");
        faname.setBounds(50, 150,150 ,30);
        faname.setFont(new Font("TAHOMA", Font.BOLD,20));
        add(faname);
        bid=new JTextField();
        bid.setBounds(200,150,150,30);
        add(bid);
        
        JLabel lsal=new JLabel("ADDRESS");
        lsal.setBounds(50, 200,150 ,30);
        lsal.setFont(new Font("TAHOMA", Font.BOLD,20));
        add(lsal);
        fad=new JTextField();
        fad.setBounds(200,200,150,30);
        add(fad);
        
        JLabel lad=new JLabel("CONTACT");
        lad.setBounds(50, 250,150 ,30);
        lad.setFont(new Font("TAHOMA", Font.BOLD,20));
        add(lad);
        fphn=new JTextField();
        fphn.setBounds(200,250,150,30);
        add(fphn);
        
        JLabel lphn=new JLabel("EMAIL");
        lphn.setBounds(50, 300,150 ,30);
        lphn.setFont(new Font("TAHOMA", Font.BOLD,20));
        add(lphn);
        fem=new JTextField();
        fem.setBounds(200,300,150,30);
        add(fem);
        
        JLabel lem=new JLabel("ID PROOF");
        lem.setBounds(50, 350,150 ,30);
        lem.setFont(new Font("TAHOMA", Font.BOLD,20));
        add(lem);
        gid=new JTextField();
        gid.setBounds(200,350,150,30);
        add(gid);
        
        String course[]={"CHOOSE","COLLECT FROM BLOODBANK","DELIVER TO GIVEN ADDRESS"};
        JLabel led=new JLabel("MODE OF DELIVERY");
        led.setBounds(50, 400,250 ,30);
        led.setFont(new Font("TAHOMA", Font.BOLD,20));
        add(led);
        cb=new JComboBox(course);
        cb.setBounds(260,400,200,30);
        add(cb);
        
        JLabel ldob=new JLabel("REGISTRATION DATE");
        ldob.setBounds(50, 450,350 ,30);
        ldob.setFont(new Font("TAHOMA", Font.BOLD,20));
        add(ldob);
        dc=new JDateChooser();
        dc.setBounds(270, 450, 150, 30);
        add(dc);
        
        JLabel leid=new JLabel("REF ID : ");
        leid.setBounds(50, 500,160 ,40);
        leid.setFont(new Font("TAHOMA", Font.BOLD,15));
        add(leid);
         rid=new JLabel("  "+n);
        rid.setBounds(150,500,150,40);
        add(rid);
        
        add=new JButton("SUBMIT"); // button 
        add.setBounds(150,600,150,20);
        add.setBackground(Color.WHITE);
        add.setForeground(Color.RED);
        add.addActionListener(this);
        add(add);
        
         back=new JButton("BACK"); // button 
        back.setBounds(350,600,150,20);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);
        
        setSize(700 ,700); // frame size
       setVisible(true); // display frame by default from left side
       setLocation(500 , 50);  
    }
    
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==add)
      {
          String refid=rid.getText();
          String barid=bid.getText();
          String name=laname.getText();
          String contact=fphn.getText();
          String email=fem.getText();
          String address=fad.getText();
          String id=gid.getText();
          String date=((JTextField) dc.getDateEditor().getUiComponent()).getText();
          String deliverymode=(String)cb.getSelectedItem();
          String q="insert into recepdetails values('"+refid+"','"+barid+"','"+name+"','"+contact+"','"+email+"','"+address+"','"+id+"','"+date+"','"+deliverymode+"')";
          String q2=" DELETE from donaradd where barid="+barid;
          String q3=" DELETE from recepsearch where barid="+barid;
          try{
              Link obj=new Link();
              int temp=obj.s.executeUpdate(q);
              temp=obj.s.executeUpdate(q2);
              temp=obj.s.executeUpdate(q3);
              JOptionPane.showMessageDialog(null, "REQUESTED ACCEPTED !!");
              setVisible(false);
              new Bloodpricetable(refid);
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
      } else{
          setVisible(false);
          new Recepsearch();
      }
    }
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[])
    {
        new Receproceed();
    }
}
