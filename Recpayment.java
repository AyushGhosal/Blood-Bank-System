import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Recpayment extends JFrame implements ActionListener {
    String c,i;
    JLabel rid,co,a,t;
    JTextField card,cv,pass;
    JButton s;
    Random ran=new Random();
    int n=ran.nextInt(999999);
    Recpayment(String c , String i)
    {
      this.c=c;
      this.i=i;
      
      setSize(800,400);
        setLocation(450,200);
        setLayout(null);
        getContentPane().setBackground(new Color(255,255,204));
        
        JLabel text=new JLabel("Payment Portal");
        text.setBounds(290, 0, 600, 40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Raleway",Font.BOLD,29));
        add(text);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/download (10).jfif")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(255, 196, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(500 , 80 , 250 ,200); // direct we cant print image so use jlabel
        add(image);
        
        rid=new JLabel(i);
       rid.setBounds(100, 40, 150, 20);
       rid.setForeground(Color.RED);
       rid.setFont(new Font("Raleway",Font.BOLD,16));
       add(rid);
        
       co=new JLabel("Code: "+c);
       co.setBounds(100, 70, 150, 20);
       co.setForeground(Color.RED);
       co.setFont(new Font("Raleway",Font.BOLD,16));
       add(co);
       
             if(c.equals("1"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
          a=new JLabel("1250");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,29));
        add(a);  
       }
       else if(c.equals("2"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa); 
         a=new JLabel("1050");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("3"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1250");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("4"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1050");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("5"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1250");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("6"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1050");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("7"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1250");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("8"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1050");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("9"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1550");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("10"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1250");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("11"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1550");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("12"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1250");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("13"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1550");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("14"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1250");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else if(c.equals("15"))
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
         a=new JLabel("1550");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);   
       }
       else
       {
           JLabel aa=new JLabel("Amount = RS ");
           aa.setBounds(100, 100, 150, 20);
        aa.setForeground(Color.RED);
        aa.setFont(new Font("Raleway",Font.BOLD,16));
        add(aa);
          a=new JLabel("1250");
        a.setBounds(210, 100, 150, 20);
        a.setForeground(Color.RED);
        a.setFont(new Font("Raleway",Font.BOLD,16));
        add(a);  
       }
             
             JLabel cc=new JLabel("  Enter Card Details");
             cc.setBounds(290, 120, 600, 40);
        cc.setForeground(Color.blue);
        cc.setFont(new Font("Raleway",Font.BOLD,20));
        add(cc);
        
        JLabel cn=new JLabel("Card Number ");
             cn.setBounds(100, 150, 600, 40);
        cn.setForeground(Color.BLACK);
        cn.setFont(new Font("Raleway",Font.BOLD,16));
        add(cn);
        
        card=new JTextField();
        card.setBounds(220,160,130,20);
        add(card);
        
        JLabel ccv=new JLabel("CVV  ");
             ccv.setBounds(100, 180, 600, 40);
        ccv.setForeground(Color.BLACK);
        ccv.setFont(new Font("Raleway",Font.BOLD,16));
        add(ccv);
        cv=new JTextField();
        cv.setBounds(220,190,70,20);
        add(cv);
        
        JLabel pp=new JLabel("Password ");
             pp.setBounds(100, 210, 600, 40);
        pp.setForeground(Color.BLACK);
        pp.setFont(new Font("Raleway",Font.BOLD,16));
        add(pp);
        pass=new JTextField();
        pass.setBounds(220,220,100,20);
        add(pass);
        
        s=new JButton("SUBMIT"); // button 
        s.setBounds(250,260,100,20);
       s.setBackground(Color.WHITE);
        s.setForeground(Color.RED);
        s.addActionListener(this);
        add(s);
        
        JLabel leid=new JLabel("Transaction ID : ");
        leid.setBounds(50, 300,160 ,30);
        leid.setFont(new Font("TAHOMA", Font.BOLD,15));
        add(leid);
        t=new JLabel("  "+n);
        t.setBounds(200,300,150,30);
        add(t);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==s)
      {
          String tran_id=t.getText();
          String ref_id=rid.getText();
          String sample_code=co.getText();
          String amount=a.getText();
          String query="insert into payment values('"+tran_id+"','"+ref_id+"','"+sample_code+"','"+amount+"')";
          try{
              Link obj=new Link();
              obj.s.executeUpdate(query);
             
              //JOptionPane.showMessageDialog(null, "RECORD CREATED SUCCESFULLY !!");
              
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
          setVisible(false);
        new Paymentload();
      }
      
    }
    
    
    public static void main(String args[])
   {
       new Recpayment("","");
   }
}

