import java.sql.*;
public class Link {
    Connection c;
    Statement s;
    public Link()
    {
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           c=DriverManager.getConnection("jdbc:mysql:///bloodbank","root","Ayush@2002");
           s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

