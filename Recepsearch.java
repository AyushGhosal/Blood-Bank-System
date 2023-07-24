import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
public class Recepsearch extends JFrame implements ActionListener {
    JTable table;
    JTextField t,p;
    JComboBox g;
    JButton search,next;
   Recepsearch()
   {
       
       getContentPane().setBackground(new Color(255,255,204));
        setLayout(null);
        
        JLabel tag=new JLabel("SEARCH YOUR REQUIREMENTS");
        tag.setBounds(250,0,300,20);
        add(tag);
        JLabel searchlbl=new JLabel("Search for State ");
        searchlbl.setBounds(20,30,150,20);
        add(searchlbl);
      
        JLabel searchdis=new JLabel("Search for District ");
        searchdis.setBounds(350,30,150,20);
        add(searchdis);
        
        /*JLabel searchblood=new JLabel("Search for Blood Group ");
        searchblood.setBounds(20,60,150,20);
        add(searchblood);*/
        String course[]={"CHOOSE","A+","A-","B+","B-","O+","O-","AB+","AB-"};
        JLabel led=new JLabel("Search for Blood Group");
        led.setBounds(20, 60,150 ,20);
        //led.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(led);
        
       t=new JTextField();
        t.setBounds(150,30,150,20);
        add(t);
       
        p=new JTextField();
        p.setBounds(500,30,150,20);
        add(p);
       
       /* g=new JTextField();
        g.setBounds(180,60,150,20);
        add(g);
        */
       g=new JComboBox(course);
        g.setBounds(180,60,150,20);
        add(g);
       search=new JButton("SEARCH"); // button 
        search.setBounds(200,100,100,20);
        search.addActionListener(this);
        add(search);
       
       next=new JButton("PROCEED"); // button 
        next.setBounds(350,100,100,20);
        next.addActionListener(this);
        add(next);
       
  JLabel head=new JLabel("NOTE THE BARID THAT IS REQUIRED FOR CONFIRMING THE REQUEST");
        head.setBounds(130,140,500,10);
        add(head);
       setSize(700,500);
      setLocation(500,150);
      setVisible(true);
   }
    
   
    public void actionPerformed(ActionEvent ae)
    {
        table =new JTable();
        if(ae.getSource()==search)
        {
            String state=t.getText();
            String district=p.getText();
            String bgroup=(String)g.getSelectedItem();
        
            String query="select * from recepsearch where state='"+state+"'and district='"+district+"'and bgroup='"+bgroup+"'";
            try{
                Link obj=new Link();
                ResultSet rs=obj.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0, 200, 700, 600);
        add(jsp);
        
        }else{
            setVisible(false);
            new Receproceed();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[])
    {
        new Recepsearch();
    }
}
