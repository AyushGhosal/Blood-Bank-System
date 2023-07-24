
import javax.swing.*;
import java.awt.*;
public class Recepload extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    public void run() //multithread concept
    {
        try{
            for(int i=1;i<=101;i++)
            {
                int max=bar.getMaximum();//100
                int value=bar.getValue();
                if(value<max)
                {
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                    new Recepsearch();
                }
                Thread.sleep(60);//loading progress speed
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    Recepload()
    {
        t=new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel text=new JLabel("    Redirecting to Recepient Portal.....");
        text.setBounds(60, 20, 600, 40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Raleway",Font.BOLD,29));
        add(text);
         bar=new JProgressBar();
        bar.setBounds(180,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel load=new JLabel("Loading , please wait..");
        load.setBounds(240, 180, 300, 30);
        load.setForeground(Color.red);
        load.setFont(new Font("Raleway",Font.BOLD,16));
        add(load);
        
        JLabel dusername=new JLabel(" YOUR LITTLE EFFORT CAN SAVES ONE'S LIFE !!!");
        dusername.setBounds(20, 310, 400, 40);
        dusername.setForeground(Color.blue);
        dusername.setFont(new Font("Raleway",Font.BOLD,12));
        add(dusername);
        t.start();
        setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[])
    {
      new Recepload();  
    }
}
