import javax.swing.*;
import java.awt.event.*;
class AssociationOutside
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame();
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

		AssociationOutside()
	{
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
		

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,350);

		b1.addActionListener(OutsideClass(this));
		b2.addActionListener(OutsideClass(this));
		b3.addActionListener(OutsideClass(this));
		b4.addActionListener(OutsideClass(this));
		b1.setBorder(null);
		b2.setBorder(null);
		b3.setBorder(null);
		b4.setBorder(null);
	}
	public static void main(String[] args)
	{
		new AssociationWithin();
	}

	class OutsideClass implements ActionListener{
		AssociationOutside obj;
		public OutsideClass(AssociationOutside obj){
			this.obj = obj;
		}
	}
	public void actionPerformed(ActionEvent event)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		try{

		if(event.getSource()==b1)
		{
			t3.setText(String.valueOf(n1+n2));
		}
		if(event.getSource()==b2)
		{
			t3.setText(String.valueOf(n1-n2));
		}
		if(event.getSource()==b3)
		{
			t3.setText(String.valueOf(n1*n2));
		}
			if(event.getSource()==b4)
		{
			t3.setText(String.valueOf(n1/n2));
		}
		 } catch (Exception e) {
            t3.setText("Invalid"+" "+e.getMessage());
        }
	}
		
}