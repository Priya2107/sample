
package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DB {
    public static void main(String args[]){
        DB1 ob=new DB1();
    }
}
class DB1{
    public static Connection getCon(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizz","root","");
        }
        catch(Exception e){
                    System.out.println(e);
                    }
        return con;
    }
    public static boolean validate(String name,String password){
        boolean status=false;
        try{
            Connection con=getCon();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM user WHERE username=? AND password=?");
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
        }
        catch(Exception e){System.out.println(e);}
        return status;
    }
    public static int register(String name,String password){
        int status=0;boolean s=false;
        try{
        Connection con=getCon();
        PreparedStatement p=con.prepareStatement("SELECT username FROM user WHERE username=?");
        p.setString(1, name);
        ResultSet r=p.executeQuery();
        s=r.next();
        if(s==true){
            JOptionPane.showMessageDialog(new JFrame(),"Username is already taken.Please choose another username.");
        }
        else{
        PreparedStatement ps=con.prepareStatement("INSERT INTO user(username,password)values(?,?)");
        ps.setString(1,name);
        ps.setString(2,password);
        status=ps.executeUpdate();
        con.close();
        }
        }
        catch(Exception e){System.out.println(e);}
        return status;
    }
}
