
package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class quiz5 {
    public static void main(String[] args) {
        Game5 ob=new Game5();
    }
}
class Game5 extends JFrame implements ActionListener{
     JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,s1,s2,s3,s4,s5,s6,s7,s8;
     JButton b1, b;
    
    Game5(){
     JPanel p=new JPanel(new BorderLayout());
         p.setBorder(BorderFactory.createLineBorder(Color.WHITE, 20)); //set the border of panel
         add(p);
       
         JLabel t=new JLabel("  MATHEMATICS  QUIZ   ");
         t.setLayout(new BorderLayout());
         add(t,BorderLayout.NORTH);
         t.setFont(new Font("Italic",Font.BOLD,30)); 
         
         JPanel p1=new JPanel(new GridLayout(30, 0));
         p1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 10));
         p.add(p1);
         JLabel l1=new JLabel(" 1. What is the next prime number after 7 ?   ");
         r1=new JRadioButton(" 11 ");
         r2=new JRadioButton(" 9 ");
         r3=new JRadioButton(" 7 ");
         r4=new JRadioButton(" 13 ");
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
        
       
       
        JLabel l2=new JLabel(" 2.  How many sides does a nonagon have?  ");
        r5=new JRadioButton(" 12  ");
        r6=new JRadioButton(" 9 ");
        r7=new JRadioButton(" 3 ");
        r8=new JRadioButton(" 19 ");
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
        
        JLabel l3=new JLabel(" 3. (5) to the power of 0 equals what?  ");
        r9=new JRadioButton(" 0 ");
        r10=new JRadioButton(" 25 ");
        r11=new JRadioButton(" 1 ");
        r12=new JRadioButton(" 5 ");
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
        
        JLabel l4=new JLabel(" 4. In statistics, the middle value of an ordered set of values is called what ?  ");
        s1=new JRadioButton(" deviation ");
        s2=new JRadioButton(" mean ");
        s3=new JRadioButton(" mode  ");
        s4=new JRadioButton(" median ");
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
        
        JLabel l5=new JLabel(" 5. What is the next number in the Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ?  ");
        s5=new JRadioButton(" 55 ");
        s6=new JRadioButton(" 63 ");
        s7=new JRadioButton(" 47 ");
        s8=new JRadioButton(" 53  ");
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