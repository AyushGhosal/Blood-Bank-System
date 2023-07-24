import javax.swing.*; // swing from extend java pakage so javax 
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
public class Bloodbankstart extends JFrame implements ActionListener{
    
   Bloodbankstart()
   {
     setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        getContentPane().setBackground(new Color(255,255,204));
        
        JLabel heading = new JLabel("WELCOME TO LIFELINE BLOODBANK"); // component
        heading.setBounds(190 , 150 , 1200 , 60); 
        heading.setFont(new Font("Raleway", Font.BOLD,30));
        heading.setForeground(Color.red);
        add(heading);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/life.png")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(255, 196, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350 , -50 , 200 ,200); // direct we cant print image so use jlabel
        add(image);
        
        JButton c=new JButton("CLICK HERE TO PROCEED"); // button 
        c.setBounds(350,250,200,30);
        c.setBackground(new Color(133,193,233));
        c.setForeground(Color.BLACK);
        c.setBorder(new LineBorder(new Color(133,193,233)));
        c.addActionListener(this);
        add(c);
        
        setVisible(true);
  
        /*while(true) // for making blink of the heading
        {
            heading.setVisible(false);
            try {
                Thread.sleep(800);
            }
            catch (Exception e){
                
            }
           heading.setVisible(true);
            try {
                Thread.sleep(600);
            }
            catch (Exception e){ }
        }  */
    }
   public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Bloodbankadminlogin();
    }
    
  
    public static void main(String args[])
    {
      new Bloodbankstart();  
    }
}
