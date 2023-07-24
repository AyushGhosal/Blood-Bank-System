import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class Adminvpayment extends JFrame implements ActionListener {
   JTable table;
  Choice cd;
  JButton search,print,back;
    Adminvpayment()
    {
       getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel lbl=new JLabel("Total User Payment Details ");
        lbl.setBounds(280,0,600,30);
        lbl.setFont(new Font("serif", Font.BOLD,30));
        lbl.setForeground(Color.BLACK);
        add(lbl);
        JLabel searchlbl=new JLabel("Search for Transaction ID");
        searchlbl.setBounds(20,40,150,20);
        add(searchlbl);
        
        cd=new Choice();
        cd.setBounds(180,40,150,20);
        add(cd);
        
        try{
            Link obj=new Link();
            ResultSet rs=obj.s.executeQuery("select * from payment");
            while(rs.next())
            {
                cd.add(rs.getString("tran_id"));
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        table =new JTable();
        
        try{
            Link obj=new Link();
            ResultSet rs=obj.s.executeQuery("select * from payment");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
        
        search=new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);
        
        print=new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);
        
        back=new JButton("Back");
        back.setBounds(220,70,80,20);
        back.addActionListener(this);
        add(back);
        
        
        
    
      setSize(900,600);
      setLocation(300,100);
      setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==search)
        {
            String query="select * from payment where tran_id='"+cd.getSelectedItem()+"'";
            try{
                Link obj=new Link();
                ResultSet rs=obj.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }else if(ae.getSource()==print){
            try{
                table.print();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Ahome();
        }
    } 
   
    
    public static void main(String args[])
    {
      new Adminvpayment();  
    }
}
