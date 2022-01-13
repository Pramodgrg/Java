import javax.swing.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
	JFrame frame = new JFrame();
	JLabel label1, label2, label3;
	JTextField textField1, textField2, textField3;
	JButton button1, button2;
	
	public Calculator()
	{	
		label1 = new JLabel("First Number");
		label2 = new JLabel("Second Number");
		label3 = new JLabel("Result");

		textField1 = new JTextField();
		textField2 = new JTextField();
		textField3 = new JTextField();

		button1 = new JButton("Add");
		button2 = new JButton("Sub");

		label1.setBounds(50,100,100,20);
		label2.setBounds(50,140,100,20);
		label3.setBounds(50,180,100,20);

		textField1.setBounds(200,100,100,30);
		textField2.setBounds(200,140,100,30);
		textField3.setBounds(200,180,100,30);

		button1.setBounds(50,250,80,50);
		button2.setBounds(140,250,80,50);

		frame.add(label1);
		frame.add(label2);
		frame.add(label3);

		frame.add(textField1);
		frame.add(textField2);
		frame.add(textField3);

		frame.add(button1);
		frame.add(button2);
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(400,350);
		button1.addActionListener(this);
        button2.addActionListener(this);
	}
	public void actionPerformed (ActionEvent event)
	{
	    double number1 = Double.parseDouble(textField1.getText());
        double number2 = Double.parseDouble(textField2.getText());

		if(event.getSource()==button1)
	        {
	            textField3.setText(String.valueOf(number1 + number2));
	        }
	        if(event.getSource()==button2)
	        {
	            textField3.setText(String.valueOf(number1 - number2));
	        }
	     	
	    
	}

		
	public static void main(String[] args)
	{
		new Calculator();
	}
}