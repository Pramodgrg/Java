import java.awt.*;
import java.awt.event.*;
 
class AssociationAnonymous implements ActionListener extends Frame
	{
		Label l1=new Label("First Number");
		Label l2=new Label("Second Number");
		Label l3=new Label("Result");
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		Button b1=new Button("Add");
		Button b2=new Button("Sub");
		Button b3=new Button("Mul");
		Button b4=new Button("Div");
	
	AssociationAnonymous()
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
		

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		

		
		setLayout(null);
		setVisible(true);
		setSize(400,350);

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
		