import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;
public class Bloodbankadminlogin extends JFrame implements ActionListener {
  JTextField t,p;
 JButton alog;
    Bloodbankadminlogin()
    {
      setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JPanel p1=new JPanel();//to divide frame into parts and use layouts
        p1.setBackground(new Color(255,204,0));//prusian blue
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/admin.png")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(90 , 70 , 200 ,200); // direct we cant print image so use jlabel
        p1.add(image);
        
         JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
      
        //for username box
        JLabel user = new JLabel("USERNAME");
        user.setBounds(60,20,100,30);
        p2.add(user);
        t=new JTextField();
        t.setBounds(60,60,300,30);
        t.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t);
        // for password box
       JLabel pass = new JLabel("PASSWORD");
        pass.setBounds(60,110,100,30);
        p2.add(pass);
        p=new JTextField();
        p.setBounds(60,150,300,30);
        p.setBorder(BorderFactory.createEmptyBorder());
        p2.add(p);
        //for button
       alog=new JButton("LOGIN"); // button 
        alog.setBounds(60,200,100,20);
        alog.setBackground(new Color(133,193,233));//133,193,233
        alog.setForeground(Color.BLACK);
        alog.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(alog);
        alog.addActionListener(this);
        
       setVisible(true);
          
    }
    
    public void actionPerformed(ActionEvent ae)
    {
      try{
          String username=t.getText();
          String pass=p.getText();
          Link obj=new Link();
          String query="select * from bloodbankadminlogin where username = '"+username+"'and password = '"+pass+"'";
          ResultSet rs=obj.s.executeQuery(query);
          
          if(rs.next())
          {
              setVisible(false);
              new Bloodadminchoose();
          } else {
              JOptionPane.showMessageDialog(null, "Invalid Credentials");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
     
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[])
   {
       new Bloodbankadminlogin();
   }
}
