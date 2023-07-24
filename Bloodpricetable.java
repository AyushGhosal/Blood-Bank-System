
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Bloodpricetable extends JFrame implements ActionListener{
    JButton p;
    JLabel id,lsal,a;
    String refid;
    JTextField code;
    JFrame f;
    String c,i;
   Bloodpricetable(String refid)
   {
      this.refid=refid;
        String[][] data={{"1","A+","Yes","1200"},{"2","A+","No","1000"},{"3","A-","Yes","1200"},{"4","A-","No","1000"},{"5","B+","Yes","1200"},{"6","B+","No","1000"},{"7","B-","Yes","1200"},{"8","B-","No","1000"},{"9","O+","Yes","1500"},{"10","O+","No","1200"},{"11","O-","Yes","1500"},{"12","O-","No","1200"},{"13","AB+","Yes","1500"},{"14","AB+","No","1200"},{"15","AB-","Yes","1500"},{"16","AB-","No","1200"}

        };
       
       String[] columname={"Code","Sample Type","Plasma","Price"};
       JTable table=new JTable(data,columname);
        f=new JFrame("Blood Sample Price List");
       
       id=new JLabel("Ref-ID: "+refid);
       id.setBounds(50, 300, 150, 20);
       id.setForeground(Color.RED);
       id.setFont(new Font("Raleway",Font.BOLD,16));
       f.add(id);
       
        lsal=new JLabel("Code ");
        lsal.setBounds(300, 300,140 ,16);
        lsal.setFont(new Font("TAHOMA", Font.BOLD,16));
        f.add(lsal);
        code=new JTextField();
        code.setBounds(350,300,150,20);
        f.add(code);
       
       p=new JButton("PAY"); // button 
        p.setBounds(600,300,100,20);
       p.setBackground(Color.WHITE);
        p.setForeground(Color.RED);
        p.addActionListener(this);
        f.add(p);
       
       f.add(new JScrollPane(table));
       f.setSize(800, 400);
       f.setLocation(300, 100);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       
             
   }
    public void actionPerformed(ActionEvent ae)
    {
        c=code.getText();
       
        i=id.getText();
        f.setVisible(false);
        new Recpayment(c,i);
    }
    
   public static void main(String args[])
   {
       new Bloodpricetable("");
   }
}
