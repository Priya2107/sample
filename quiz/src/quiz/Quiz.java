
package quiz;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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



public class Quiz { 
    public static void main(String[] args) {
       Game ob=new Game();
    }
    
}
class Game extends JFrame implements ActionListener{
        JRadioButton r1,r2,r3,r4,r5;
        JButton b;
        
    Game() {
        JPanel p=new JPanel(new GridLayout(10,0,8,8));
        JLabel t=new JLabel("  WELCOME  TO  QUIZ  GAME  ");
        p.setBorder(BorderFactory.createLineBorder(Color.BLACK, 20)); //set the border of panel
        p.setPreferredSize(new Dimension(200, 100));
        t.setBackground(Color.pink);
        t.setOpaque(true);   //to paint background of label 
        t.setFont(new Font("Italic",Font.BOLD,30));   //setting Font Style
        t.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(t);
        add(p);
        
        
        JPanel p1=new JPanel(new FlowLayout());
        p.add(p1);
        p1.setBackground(Color.WHITE);
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 8));
        JLabel t1=new JLabel("  Select  To  Play  The  Quiz  Of  Your  Own  Choice  "); 
        t1.setFont(new Font(null, Font.ITALIC, 20));
        t1.setSize(10,20);
        t1.setLayout(new FlowLayout(FlowLayout.CENTER));
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setOpaque(true); 
        p1.add(t1);
        
        r1=new JRadioButton(" Computer ");
        r2=new JRadioButton(" English ");
        r3=new JRadioButton(" Science ");
        r4=new JRadioButton(" G.K. ");
        r5=new JRadioButton(" Mathematics ");
        p.add(r1);
        p.add(r2);
        p.add(r3);
        p.add(r4);
        p.add(r5);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);
       
       
        
       
        JButton b=new JButton(" START ");
        b.setBackground(Color.LIGHT_GRAY);
        b.setPreferredSize(new Dimension(80,60));
        b.setForeground(Color.RED);
        b.setOpaque(true);
        b.setContentAreaFilled(false);
        b.setLayout(new BorderLayout());
        add(b,BorderLayout.PAGE_END);
        b.addActionListener(this);
        add(b,BorderLayout.PAGE_END);
       
        setVisible(true);
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
    }

   
    public void actionPerformed(ActionEvent e) {
        
      if(r1.isSelected()==false&&r2.isSelected()==false&&r3.isSelected()==false&&r4.isSelected()==false&&r5.isSelected()==false){
          if(e.getSource()==b){
              JOptionPane.showMessageDialog(new JFrame()," Select one for quiz .  ");}
          /*else{
              JOptionPane.showMessageDialog(new JFrame()," YOU have not selected to quiz .  ");} */}
          
               
      
      if(r1.isSelected()){
      new Game1();
      dispose();       }
      
      if(r2.isSelected()){
      new Game2();
      dispose();       }
      
      if(r3.isSelected()){
      new Game3();
      dispose();       }
      
      if(r4.isSelected()){
      new Game4();
      dispose();       }
      
      if(r5.isSelected()){
      new Game5();
      dispose();       }
        
    }
    
    
}