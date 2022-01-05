import javax.swing.*;
import java.awt.event.*;
class InheritanceAnonymous extends JFrame
{
	public static void main(String[] args)
	{
		InheritanceFrame fw = new InheritanceFrame();
		JLabel l1=new JLabel("First Number");
		JLabel l2=new JLabel("Second Number");
		JLabel l3=new JLabel("Result");
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		JButton b1=new JButton("Additon");
		JButton b2=new JButton("Subtraction");
		JButton b3=new JButton("Multiply");
		JButton b4=new JButton("Divide");

		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,140,100,20);
		t3.setBounds(200,180,100,20);
		b1.setBounds(50,250,50,20);
		b2.setBounds(110,250,50,20);
		b3.setBounds(170,250,50,20);
		b4.setBounds(230,250,50,20);

		fw.add(l1);
		fw.add(l2);
		fw.add(l3);
		fw.add(t1);
		fw.add(t2);
		fw.add(t3);
		fw.add(b1);
		fw.add(b2);
		fw.add(b3);
		fw.add(b4);


		fw.setLayout(null);
		fw.setVisible(true);
		fw.setSize(400,350);
		b1.setBorder(null);
		b2.setBorder(null);
		b3.setBorder(null);
		b4.setBorder(null);
b3.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
                double t1 = Double.parseDouble(t1.getText());
                double t2 = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(t1*t2));
                
                
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double t1 = Double.parseDouble(t1.getText());
                double t2 = Double.parseDouble(t2.getText());
                try {
                    if(e.getSource()==b4)
                    {
                    t3.setText(String.valueOf(t1/t2));
                    }
                    
                } catch (Exception error) {
                    t3.setText("Invalid"+" "+error.getMessage());
                }
                
                
                
            }
        });
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double t1 = Double.parseDouble(t1.getText());
                double t2 = Double.parseDouble(t2.getText());
            
                t3.setText(String.valueOf(t1+t2));
                
                
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double t1 = Double.parseDouble(t1.getText());
                double t2 = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(t1-t2));
                
                
            }
        });
        
    }
    
    public static void main(String[] args) {
        new AssociationAnonymous();
    }
}
		