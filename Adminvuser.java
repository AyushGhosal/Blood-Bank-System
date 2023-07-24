import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class Adminvuser extends JFrame implements ActionListener{
   JTable table;
  Choice cd;
  JButton search,print,back;
    Adminvuser()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel searchlbl=new JLabel("Total Details of Users Of the Application ");
        searchlbl.setBounds(200,10,600,30);
        searchlbl.setFont(new Font("serif", Font.BOLD,30));
        searchlbl.setForeground(Color.BLACK);
        add(searchlbl);
        table =new JTable();
        
        try{
            Link obj=new Link();
            ResultSet rs=obj.s.executeQuery("select * from recepientsignup ");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
        
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
        /*if(ae.getSource()==search)
        {
            String query="select * from donaradd where barid='"+cd.getSelectedItem()+"'";
            try{
                Link obj=new Link();
                ResultSet rs=obj.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e)
            {
                e.printStackTrace();
            }*/
         if(ae.getSource()==print){
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
        new Adminvuser();
    }
}
