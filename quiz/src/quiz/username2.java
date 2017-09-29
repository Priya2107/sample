
package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class username2 {
    public static void main(String[] args) {
        Main2 ob=new Main2();
    }
}
class Main2 extends JFrame implements ActionListener{
    JButton b1;JTextField t; JPasswordField pf;
    JLabel l,l1,l2;JPanel p,p1;
    Main2(){
        
        p=new JPanel();
        p.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20)); //set the border of panel
        add(p);
       
        l=new JLabel("  USER  REGISTER  PAGE   ");
        l.setLayout(new BorderLayout());
        l.setFont(new Font(null, Font.BOLD, 40));
        l.setBackground(Color.LIGHT_GRAY);
        l.setOpaque(true); 
        add(l,BorderLayout.NORTH);
        
        p1=new JPanel(new GridLayout(3, 2));
        p1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5)); //set the border of panel
        p.add(p1);
        
        l1= new JLabel(" Username ");
        l1.setFont(new Font(null, Font.ITALIC, 20));
        t=new JTextField(25);
        p1.add(l1);
        p1.add(t);
        
        l2= new JLabel(" Password ");
        l2.setFont(new Font(null, Font.ITALIC, 20));
        pf=new JPasswordField(25);
        p1.add(l2);
        p1.add(pf);
        
        
       
        
        b1=new JButton(" Register ");
        b1.setLayout(new BorderLayout());
        p.add(b1,BorderLayout.SOUTH);
        b1.addActionListener(this);
        
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String name=t.getText();
       String password=String.valueOf(pf.getPassword());
       int status=0;
       if(name.equals("")&&password.equals("")){
           JOptionPane.showMessageDialog(new JFrame(),"PLEASE ENTER THE DETAILS.");
       }
       else{
       status=DB1.register(name, password);
       if(status==1){
           JOptionPane.showMessageDialog(new JFrame(),"You are sucessfully registered.Now login to begin the quiz.");
           new Main();
           dispose();
       }
       }
    }
}

    