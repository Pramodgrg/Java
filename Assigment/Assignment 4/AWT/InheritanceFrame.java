import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
class InheritanceFrame extends Frame
{
	public static void main(String[] args)
	{
		InheritanceFrame fw = new InheritanceFrame();
		Label l1=new Label("First Number");
		Label l2=new Label("Second Number");
		Label l3=new Label("Result");
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		Button b1=new Button("Additon");
		Button b2=new Button("Subtraction");
		Button b3=new Button("Multiply");
		Button b4=new Button("Divide");

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

	}	

}