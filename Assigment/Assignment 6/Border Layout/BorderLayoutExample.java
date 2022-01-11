import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
class BorderLayoutExample extends JFrame{
    public JLabel number1 = new JLabel();
    public JTextField number1Text = new JTextField();
    public JLabel number2 = new JLabel();
    public JTextField number2Text = new JTextField();
    public JLabel result = new JLabel();
    public JTextField resultText = new JTextField();
    public JButton addition = new JButton("ADD");
    public JButton subtract = new JButton("Subtract");
    public JButton multiply = new JButton("Multiply");
    public JButton divide = new JButton("Divide");
    BorderLayoutExample()
    {
        number1.setText("Number 1:");
        number1.setBounds(10,50,80,25);
        number1Text.setBounds(100,50,165,25);
        add(number1);
        add(number1Text);

        number2.setText("Number 2:");
        number2.setBounds(10,100,80,25);
        number2Text.setBounds(100,100,165,25);
        add(number2);
        add(number2Text);

        result.setText("Result:");
        result.setBounds(10,150,80,25);
        resultText.setBounds(100,150,165,25);
        add(result);
        add(resultText);

        addition.setBounds(10,200,50,35);
        add(addition);

        subtract.setBounds(80,200,50,35);
        add(subtract);

        multiply.setBounds(150,200,50,35);
        add(multiply);

        divide.setBounds(220,200,50,35);
        add(divide);

        divide.setBorder(null);
        multiply.setBorder(null);
        addition.setBorder(null);
        subtract.setBorder(null);

        setSize(300,400);
        setLayout(new BorderLayout(20,15));
        setVisible(true);
        multiply.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Text.getText());
                double num2 = Double.parseDouble(number2Text.getText());
                resultText.setText(String.valueOf(num1*num2));
                
                
            }
        });
        divide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Text.getText());
                double num2 = Double.parseDouble(number2Text.getText());
                try {
                    if(e.getSource()==divide)
                    {
                    resultText.setText(String.valueOf(num1/num2));
                    }
                    
                } catch (Exception error) {
                    resultText.setText("Invalid"+" "+error.getMessage());
                }
                
                
                
            }
        });
        addition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Text.getText());
                double num2 = Double.parseDouble(number2Text.getText());
            
                resultText.setText(String.valueOf(num1+num2));
                
                
            }
        });
        subtract.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Text.getText());
                double num2 = Double.parseDouble(number2Text.getText());
                resultText.setText(String.valueOf(num1-num2));
                
                
            }
        });
        
    }
    
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
