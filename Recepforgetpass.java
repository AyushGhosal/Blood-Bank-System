
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Recepforgetpass extends JFrame implements ActionListener {
    JTextField rf,rfn,rfq,rfa,rfp;
    JButton rs,rr,rb;
    Recepforgetpass()
    {
        setBounds(350,200,850,380);
       setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JPanel p1=new JPanel();//to divide frame into parts and use layouts
        p1.setBackground(new Color(51,204,255));//prusian blue
        p1.setBounds(30, 30, 500, 280);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/delete.png")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580 , 40 , 200 ,200); // direct we cant print image so use jlabel
        add(image);
        
        JLabel userforget = new JLabel("USERNAME");
        userforget.setBounds(40,20,100,30);
        p1.add(userforget);
        rf=new JTextField();
        rf.setBounds(220,20,100,25);
        rf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(rf);
       rs=new JButton("SEARCH");
       rs.setBounds(380,20,100,20);
       rs.setBackground(Color.white);
        rs.setForeground(Color.black);
       rs.addActionListener(this);
       p1.add(rs);
       
       JLabel nameforget = new JLabel("NAME");
        nameforget.setBounds(40,60,100,30);
        p1.add(nameforget);
        rfn=new JTextField();
        rfn.setBounds(220,60,150,30);
        rfn.setBorder(BorderFactory.createEmptyBorder());
        p1.add(rfn);
       
        JLabel qforget = new JLabel("SAFETY QUESTION");
        qforget.setBounds(40,100,150,25);
        p1.add(qforget);
        rfq=new JTextField();
        rfq.setBounds(220,100,150,25);
        rfq.setBorder(BorderFactory.createEmptyBorder());
        p1.add(rfq);
        
        JLabel aforget = new JLabel("SAFETY ANSWER");
        aforget.setBounds(40,140,150,25);
        p1.add(aforget);
        rfa=new JTextField();
        rfa.setBounds(220,140,150,30);
        rfa.setBorder(BorderFactory.createEmptyBorder());
        p1.add(rfa);
        
        rr=new JButton("RETRIEVE");
       rr.setBounds(380,145,100,20);
       rr.setBackground(Color.white);
        rr.setForeground(Color.black);
        rr.addActionListener(this);
       p1.add(rr);
       
       JLabel pforget = new JLabel("PASSWORD");
        pforget.setBounds(40,180,150,25);
        p1.add(pforget);
        rfp=new JTextField();
        rfp.setBounds(220,180,150,25);
        rfp.setBorder(BorderFactory.createEmptyBorder());
        p1.add(rfp);
        
        rb=new JButton("BACK");
       rb.setBounds(150,235,100,20);
       rb.setBackground(Color.white);
        rb.setForeground(Color.black);
        rb.addActionListener(this);
       p1.add(rb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rs)
        {
            try{
                String query="select *from recepientsignup where username='"+rf.getText()+"'";
                Link obj=new Link();
                ResultSet r=obj.s.executeQuery(query);
                while(r.next())
                {
                    rfn.setText(r.getString("name"));
                    rfq.setText(r.getString("security"));
                    
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }else if(ae.getSource()==rr)
        {
           try{
               String query="select *from recepientsignup where answer='"+rfa.getText()+"' AND username='"+rf.getText()+"'";
               Link obj=new Link();
               ResultSet r=obj.s.executeQuery(query);
               while(r.next())
               {
                   rfp.setText(r.getString("password"));
               }
           } catch(Exception e)
           {
               e.printStackTrace();
           }
        }else{
            setVisible(false);
            new Receplogin();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[])
    {
        new Recepforgetpass();
    }
}
