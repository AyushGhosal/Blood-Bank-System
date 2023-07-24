
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class Ahome extends JFrame implements ActionListener{
   JButton vstock,vrequest,vpayment,vuser;
   Ahome()
   {
       getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/aa.jfif")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0 , 10 , 200 ,200); // direct we cant print image so use jlabel
        add(image);
     
    JLabel heading = new JLabel("-- MODE OF USE --"); // component
        heading.setBounds(350 , 20 , 200 , 30); 
        heading.setFont(new Font("TAHOMA", Font.BOLD,15));
        add(heading);
        
               vstock=new JButton("VIEW STOCK"); // donar add physically 
        vstock.setBounds(350,80,150,20);
        vstock.setBackground(new Color(133,193,233));
        vstock.setForeground(Color.BLACK);
        vstock.setBorder(new LineBorder(new Color(133,193,233)));
        vstock.addActionListener(this);
        add(vstock);
        
         vrequest=new JButton("VIEW REQUEST"); // blood stock
        vrequest.setBounds(350,120,150,20);
        vrequest.setBackground(new Color(133,193,233));
        vrequest.setForeground(Color.BLACK);
        vrequest.setBorder(new LineBorder(new Color(133,193,233)));
        vrequest.addActionListener(this);
        add(vrequest);
        
          vpayment=new JButton("VIEW PAYMENT"); // blood stock
        vpayment.setBounds(350,160,150,20);
        vpayment.setBackground(new Color(133,193,233));
        vpayment.setForeground(Color.BLACK);
        vpayment.setBorder(new LineBorder(new Color(133,193,233)));
        vpayment.addActionListener(this);
        add(vpayment);
        
       vuser=new JButton("VIEW USERS"); // blood stock
        vuser.setBounds(350,200,150,20);
        vuser.setBackground(new Color(133,193,233));
        vuser.setForeground(Color.BLACK);
        vuser.setBorder(new LineBorder(new Color(133,193,233)));
        vuser.addActionListener(this);
        add(vuser);
        
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
   }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==vstock)
        {
            setVisible(false);
            new Adminvstock();
        } 
        else if(ae.getSource()==vrequest){
            setVisible(false);
            new Adminvrequest();
        }
        else if(ae.getSource()==vpayment)
        {
            setVisible(false);
            new Adminvpayment();
        }
        else
        {
            setVisible(false);
            new Adminvuser();
        }
    }
    
    public static void main(String args[])
    {
        new Ahome();
    }
    
}
