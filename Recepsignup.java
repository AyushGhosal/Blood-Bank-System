import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Recepsignup extends JFrame implements ActionListener {
   JTextField ruser,rname,rpass,rans;
   Choice sec;
   JButton create,back;
    Recepsignup()
    {
       
        
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JPanel p1=new JPanel();//to divide frame into parts and use layouts
        p1.setBackground(new Color(131,193,233));//gold colour 131,193,233
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/receps.png")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580 , 50 , 250 ,200); // direct we cant print image so use jlabel
        add(image);
        
        JLabel user = new JLabel("USERNAME");
        user.setBounds(50,20,125,25);
        p1.add(user);
        ruser=new JTextField();
        ruser.setBounds(190,20,125,25);
        ruser.setBorder(BorderFactory.createEmptyBorder());
        p1.add(ruser);
        
        JLabel name = new JLabel("NAME");
        name.setBounds(50,60,125,25);
        p1.add(name);
        rname=new JTextField();
        rname.setBounds(190,60,180,25);
        rname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(rname);
        
        JLabel pass = new JLabel("PASSWORD");
        pass.setBounds(50,100,125,25);
        p1.add(pass);
        rpass=new JTextField();
        rpass.setBounds(190,100,180,25);
        rpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(rpass);
        
        JLabel security = new JLabel("SAFETY QUESTION");
        security.setBounds(50,140,125,25);
        p1.add(security);
        sec=new Choice();
        sec.add("NONE");
        sec.add("YOUR SCHOOL LOCATION");
        sec.add("FAVOURITE BOOK");
        sec.add("LUCKY NUMBER");
        sec.setBounds(190,140,180,25);
        p1.add(sec);
        
        JLabel secans = new JLabel("SAFETY ANSWER");
        secans.setBounds(50,180,125,25);
        p1.add(secans);
        rans=new JTextField();
        rans.setBounds(190,180,180,25);
        rans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(rans);
        
        create=new JButton("CREATE"); // button 
        create.setBounds(80,250,100,30);
        create.setBackground(Color.white);
        create.setForeground(Color.BLACK);
        create.addActionListener(this);
        p1.add(create);
        
        back=new JButton("BACK"); // button 
        back.setBounds(250,250,100,30);
        back.setBackground(Color.white);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        p1.add(back);
       
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==create) 
       {
          String username= ruser.getText();
          String name=rname.getText();
          String password=rpass.getText();
          String security=sec.getSelectedItem();
          String answer=rans.getText();
          
          String query="insert into recepientsignup values('"+username+"', '"+name+"', '"+password+"' , '"+security+"' , '"+answer+"')";
          try{
              
              Link obj=new Link();
              obj.s.executeUpdate(query);
              
              JOptionPane.showMessageDialog(null, "ACCOUNT CREATED SUCCESFULLY !!");
              setVisible(false);
              new Receplogin();
          }catch(Exception e)
          {
              e.printStackTrace();
          }
       } else {
           setVisible(false);
         new Receplogin();
       }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[])
    {
        new Recepsignup();
    }
    
}
