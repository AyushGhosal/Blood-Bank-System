import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class Receplogin extends JFrame implements ActionListener {
    JTextField ru,rp;
    JButton rlog,rsign,rfor;
    Receplogin()
    {
       setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JPanel p1=new JPanel();//to divide frame into parts and use layouts
        p1.setBackground(new Color(0,255,251));//prusian blue 102-255-102
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        JLabel u = new JLabel("RECEIPENT PAGE");
        u.setBounds(140,20,250,30);
        p1.add(u);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/recep.jfif")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(90 , 70 , 200 ,200); // direct we cant print image so use jlabel
        p1.add(image);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel user = new JLabel("USERNAME");
        user.setBounds(60,20,100,30);
        p2.add(user);
        ru=new JTextField();
        ru.setBounds(60,60,300,30);
        ru.setBorder(BorderFactory.createEmptyBorder());
        p2.add(ru);
        
        JLabel pass = new JLabel("PASSWORD");
        pass.setBounds(60,110,100,30);
        p2.add(pass);
        rp=new JTextField();
        rp.setBounds(60,150,300,30);
        rp.setBorder(BorderFactory.createEmptyBorder());
        p2.add(rp);
        
        rlog=new JButton("LOGIN"); // button 
        rlog.setBounds(60,200,100,20);
        rlog.setBackground(new Color(133,193,233));
        rlog.setForeground(Color.BLACK);
        rlog.setBorder(new LineBorder(new Color(133,193,233)));
        rlog.addActionListener(this);
        p2.add(rlog);
        
        rsign=new JButton("SIGNUP"); // button 
        rsign.setBounds(230,200,100,20);
        rsign.setBackground(new Color(133,193,233));
        rsign.setForeground(Color.BLACK);
        rsign.setBorder(new LineBorder(new Color(133,193,233)));
        rsign.addActionListener(this);
        p2.add(rsign);
        
        rfor=new JButton("FORGET PASSWORD"); // button 
        rfor.setBounds(130,250,130,20);
        rfor.setBackground(new Color(133,193,233));
        rfor.setForeground(Color.BLACK);
        rfor.setBorder(new LineBorder(new Color(133,193,233)));
        rfor.addActionListener(this);
        p2.add(rfor);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rlog)
        {
          try{
               String username=ru.getText();
               String password=rp.getText();
               
               String query="select * from recepientsignup where username='"+username+"' AND password = '"+password+"'";
               Link obj=new Link();
               ResultSet r=obj.s.executeQuery(query);
               if(r.next())
               {
                   setVisible(false);
                   new Recepload();
               }else{
                   JOptionPane.showMessageDialog(null,"INCORRECT USERNAME OR PASSWORD");
               }
           }catch(Exception e){
               e.printStackTrace();
           }
        }else if(ae.getSource()==rsign)
        {
            setVisible(false);
            new Recepsignup();
        }else{
            setVisible(false);
            new Recepforgetpass();
          
        }
    }
    
    
    
    
   
    
    public static void main(String args[])
    {
        new Receplogin();
    }
    
}

