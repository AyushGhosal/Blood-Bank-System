
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;


public class Receplast extends JFrame
{
    
   Receplast()
   {
     setBounds(500,200,650,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel text=new JLabel("Your Request Is Confirmed !!");
        text.setBounds(120, 20, 600, 40);
        text.setForeground(Color.GREEN);
        text.setFont(new Font("DIALOG",Font.BOLD,29));
        add(text);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/TICK.jfif")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(200 , 5 , 250 ,250); // direct we cant print image so use jlabel
        add(image);
        JLabel t=new JLabel("Thankyou for using our services.....");
        t.setBounds(100, 200, 600, 40);
        t.setForeground(Color.RED);
        t.setFont(new Font("DIALOG",Font.BOLD,29));
        add(t);
        JLabel te=new JLabel("Contact Us (24x7)");
        te.setBounds(20, 320, 600, 40);
        te.setForeground(Color.BLUE);
        te.setFont(new Font("Raleway",Font.BOLD,16));
        add(te);
        JLabel tee=new JLabel("+91-8240619995");
        tee.setBounds(20, 350, 600, 40);
        tee.setForeground(Color.BLUE);
        tee.setFont(new Font("Raleway",Font.BOLD,12));
        add(tee);
        JLabel tex=new JLabel("Email us at : lifelinebloodservice@gmail.com");
        tex.setBounds(20, 370, 600, 40);
        tex.setForeground(Color.BLUE);
        tex.setFont(new Font("Raleway",Font.BOLD,12));
        add(tex);
        setVisible(true);
   }
    
    
    
    
    
    
    
    
    
    public static void main(String args[])
    {
        new Receplast();
    }
}
