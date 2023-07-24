import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class Bloodadminchoose extends JFrame implements ActionListener{
   JButton donar,show;
    Bloodadminchoose()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ico/download.png")); //geting image from system
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); // scale it and returns object so store in image icon
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0 , 10 , 200 ,200); // direct we cant print image so use jlabel
        add(image);
        
         JLabel heading = new JLabel("-- MODE OF USE --"); // component
        heading.setBounds(350 , 20 , 200 , 30); 
        heading.setFont(new Font("TAHOMA", Font.BOLD,15));
        add(heading);
       
        
       donar=new JButton("ADD DONAR"); // donar add physically 
        donar.setBounds(350,80,150,20);
        donar.setBackground(new Color(133,193,233));
        donar.setForeground(Color.BLACK);
        donar.setBorder(new LineBorder(new Color(133,193,233)));
        donar.addActionListener(this);
        add(donar);
        
         show=new JButton("VIEW STOCK"); // blood stock
        show.setBounds(350,120,150,20);
        show.setBackground(new Color(133,193,233));
        show.setForeground(Color.BLACK);
        show.setBorder(new LineBorder(new Color(133,193,233)));
        show.addActionListener(this);
        add(show);
        
         
        
      
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==donar)
        {
            setVisible(false);
            new Donaradd();
        } 
        else{
            setVisible(false);
            new Bloodbankviewstock();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[])
   {
       new Bloodadminchoose();
   }
}
