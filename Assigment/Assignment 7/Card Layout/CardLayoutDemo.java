import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;    
  
public class CardLayoutDemo extends JFrame implements ActionListener  
{    
  
CardLayout card;     
JButton button1, button2, button3;    
Container panel;   
    
CardLayoutDemo()  
{    
  
panel = getContentPane();    
  
card = new CardLayout();    
  
panel.setLayout(card);    
  
button1 = new JButton("Annapurna");    
button2 = new JButton("Manaslu");    
button3 = new JButton("lotse");    
  
 
button1.addActionListener(this);    
button2.addActionListener(this);    
button3.addActionListener(this);    

panel.add("a", button1); 
panel.add("b", button2);   
panel.add("c", button3);    
            
}    
public void actionPerformed(ActionEvent e)   
{    
card.next(panel);    
}    
  

public static void main(String argvs[])   
{      
CardLayoutDemo cardlout = new CardLayoutDemo();   
           
cardlout.setSize(300, 300);    
cardlout.setVisible(true);    
cardlout.setDefaultCloseOperation(EXIT_ON_CLOSE);    
}    
}    