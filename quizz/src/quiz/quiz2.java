
package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class quiz2 {
    public static void main(String[] args) {
        Game2 ob=new Game2();
    }
}
class Game2 extends JFrame implements ActionListener{
     JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,s1,s2,s3,s4,s5,s6,s7,s8;
     JButton b1, b;
    
    Game2(){
         JPanel p=new JPanel(new BorderLayout());
         p.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20)); //set the border of panel
         add(p);
       
         JLabel t=new JLabel("  ENGLISH  QUIZ   ");
         t.setLayout(new BorderLayout());
         add(t,BorderLayout.NORTH);
         t.setFont(new Font("Italic",Font.BOLD,30)); 
         
         JPanel p1=new JPanel(new GridLayout(30, 0));
         p1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 10));
         p.add(p1);
         JLabel l1=new JLabel(" 1.  Let us play ----- chess    ");
         r1=new JRadioButton(" no article ");
         r2=new JRadioButton(" a ");
         r3=new JRadioButton(" an ");
         r4=new JRadioButton(" the ");
        p1.add(l1);
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);
        p1.add(r4);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        
       
       
        JLabel l2=new JLabel(" 2. He hopes to join ----- university soon  ");
        r5=new JRadioButton("  an ");
        r6=new JRadioButton(" a ");
        r7=new JRadioButton(" the ");
        r8=new JRadioButton(" no article ");
        p1.add(l2);
        p1.add(r5);
        p1.add(r6);
        p1.add(r7);
        p1.add(r8);
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(r5);
        bg1.add(r6);
        bg1.add(r7);
        bg1.add(r8);
        
        JLabel l3=new JLabel(" 3. Noun of a Layer  :-   ");
        r9=new JRadioButton(" lie ");
        r10=new JRadioButton(" liar ");
        r11=new JRadioButton(" lay ");
        r12=new JRadioButton(" layering ");
        p1.add(l3);
        p1.add(r9);
        p1.add(r10);
        p1.add(r11);
        p1.add(r12);
        ButtonGroup bg2=new ButtonGroup();
        bg2.add(r9);
        bg2.add(r10);
        bg2.add(r11);
        bg2.add(r12);
        
        JLabel l4=new JLabel(" 4. I shall meet you ----- 6 o’clock.  ");
        s1=new JRadioButton(" by ");
        s2=new JRadioButton(" in ");
        s3=new JRadioButton(" during  ");
        s4=new JRadioButton(" at ");
        p1.add(l4);
        p1.add(s1);
        p1.add(s2);
        p1.add(s3);
        p1.add(s4);
        ButtonGroup bg3=new ButtonGroup();
        bg3.add(s1);
        bg3.add(s2);
        bg3.add(s3);
        bg3.add(s4);
        
        JLabel l5=new JLabel(" 5.  My father will retire from service ----- a year.  ");
        s5=new JRadioButton(" in ");
        s6=new JRadioButton(" on ");
        s7=new JRadioButton(" by ");
        s8=new JRadioButton(" of  ");
        p1.add(l5);
        p1.add(s5);
        p1.add(s6);
        p1.add(s7);
        p1.add(s8);
        ButtonGroup bg4=new ButtonGroup();
        bg4.add(s5);
        bg4.add(s6);
        bg4.add(s7);
        bg4.add(s8);
        
        
        
        JPanel p2=new JPanel();
        p2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));   
        b=new JButton(" Submit ");
        b.addActionListener(this);
        b1=new JButton(" Exit ");
        b1.addActionListener(this);
          p.add(p2,BorderLayout.SOUTH);
          p2.add(b);
          p2.add(b1);
        
      
        
       
        setVisible(true);
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
     
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b)
        if(r1.isSelected()&&r6.isSelected()&&r11.isSelected()&&s4.isSelected()&&s5.isSelected())
            JOptionPane.showMessageDialog(new JFrame(),"YOU  WON ! ");
        else
            JOptionPane.showMessageDialog(new JFrame(),"YOU  LOSE ! ");
       
       if(e.getSource()==b1){
           System.exit(0);
          }
    }
         
}
       

