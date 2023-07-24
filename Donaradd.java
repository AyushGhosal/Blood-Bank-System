
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;


public class Donaradd extends JFrame implements ActionListener {
 Random ran=new Random();
    int n=ran.nextInt(999999);
    JButton add,back;
    JTextField laname,fename,fad,fphn,fem,fstate,fid,fdis,fdise;
    JLabel bid;
    JDateChooser dc;
    JComboBox cb,ge;
   Donaradd()
   {
       getContentPane().setBackground(new Color(255,255,204));
        setLayout(null);
        
        JLabel heading = new JLabel("ADD DONAR DETAILS"); // component
        heading.setBounds(295 , 30 , 500 , 50); 
        heading.setFont(new Font("serif", Font.BOLD,30));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel lname=new JLabel("NAME");
        lname.setBounds(50, 150,150 ,30);
        lname.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(lname);
        laname=new JTextField();
        laname.setBounds(200,150,150,30);
        add(laname);
        
        JLabel faname=new JLabel("FATHER'S NAME");
        faname.setBounds(400, 150,150 ,30);
        faname.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(faname);
        fename=new JTextField();
        fename.setBounds(600,150,150,30);
        add(fename);
        
        JLabel ldob=new JLabel("Date of Birth");
        ldob.setBounds(48, 200,150 ,30);
        ldob.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(ldob);
        dc=new JDateChooser();
        dc.setBounds(200, 200, 150, 30);
        add(dc);
        
        JLabel lsal=new JLabel("ADDRESS");
        lsal.setBounds(400, 200,150 ,30);
        lsal.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(lsal);
        fad=new JTextField();
        fad.setBounds(600,200,150,30);
        add(fad);
        
        JLabel lad=new JLabel("CONTACT");
        lad.setBounds(50, 250,150 ,30);
        lad.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(lad);
        fphn=new JTextField();
        fphn.setBounds(200,250,150,30);
        add(fphn);
        
        JLabel lphn=new JLabel("EMAIL");
        lphn.setBounds(400, 250,150 ,30);
        lphn.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(lphn);
        fem=new JTextField();
        fem.setBounds(600,250,150,30);
        add(fem);
        
        JLabel lem=new JLabel("ID PROOF");
        lem.setBounds(50, 300,150 ,30);
        lem.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(lem);
        fid=new JTextField();
        fid.setBounds(200,300,150,30);
        add(fid);
        
        String course[]={"CHOOSE","A+","A-","B+","B-","O+","O-","AB+","AB-"};
        JLabel led=new JLabel("BLOOD GROUP");
        led.setBounds(400, 300,150 ,30);
        led.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(led);
        cb=new JComboBox(course);
        cb.setBounds(600,300,150,30);
        add(cb);
        
        JLabel ldeg=new JLabel("STATE");
        ldeg.setBounds(50,350,150 ,30);
        ldeg.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(ldeg);
        fstate=new JTextField();
        fstate.setBounds(200,350,150,30);
        add(fstate);
        
        JLabel dis=new JLabel("DISTRICT");
        dis.setBounds(400,350,150,30);
        dis.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(dis);
        fdis=new JTextField();
        fdis.setBounds(600,350,150,30);
        add(fdis);
        
        JLabel dise=new JLabel("DISEASE(if any)");
        dise.setBounds(50, 400,150 ,30);
        dise.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(dise);
        fdise=new JTextField();
        fdise.setBounds(200,400,150,30);
        add(fdise);
        
        String gender[]={"CHOOSE","Male","Female","Others"};
        JLabel gen=new JLabel("GENDER");
        gen.setBounds(400, 400,150 ,30);
        gen.setFont(new Font("TAHOMA", Font.ITALIC,20));
        add(gen);
        ge=new JComboBox(gender);
        ge.setBounds(600,400,150,30);
        add(ge);
        
        JLabel leid=new JLabel("DONAR BARCODE ID : ");
        leid.setBounds(50, 450,160 ,30);
        leid.setFont(new Font("TAHOMA", Font.ITALIC,15));
        add(leid);
         bid=new JLabel("  "+n);
        bid.setBounds(200,450,150,30);
        add(bid);
        
        add=new JButton("SUBMIT"); // button 
        add.setBounds(450,550,150,20);
        add.setBackground(Color.WHITE);
        add.setForeground(Color.RED);
        add.addActionListener(this);
        add(add);
        
         back=new JButton("BACK"); // button 
        back.setBounds(650,550,150,20);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);
        
        
         setSize(900 ,700); // frame size
       setVisible(true); // display frame by default from left side
       setLocation(300 , 50); 
   }
    
   public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==add)
      {
          String barid=bid.getText();
          String name=laname.getText();
          String fname=fename.getText();
          String dob=((JTextField) dc.getDateEditor().getUiComponent()).getText();
          String address=fad.getText();
          String contact=fphn.getText();
          String email=fem.getText();
          String idproof=fid.getText();
          String bgroup=(String)cb.getSelectedItem();
          String state=fstate.getText();
          String district=fdis.getText();
          String disease=fdise.getText();
          String gender=(String)ge.getSelectedItem();
          String query="insert into donaradd values('"+barid+"', '"+name+"', '"+fname+"','"+dob+"','"+address+"','"+contact+"','"+email+"','"+idproof+"','"+bgroup+"','"+state+"','"+district+"','"+disease+"','"+gender+"')";
          String q2="insert into recepsearch values('"+barid+"','"+bgroup+"','"+state+"','"+district+"','"+disease+"')";
          try{
              Link obj=new Link();
              obj.s.executeUpdate(query);
              obj.s.executeUpdate(q2);
              JOptionPane.showMessageDialog(null, "RECORD CREATED SUCCESFULLY !!");
              
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
       setVisible(false);
        new Bloodadminchoose();}
      else{
          setVisible(false);
          new Bloodadminchoose();
      }
    }
    
    
    public static void main(String args[])
 {
     new Donaradd();
 }
}
