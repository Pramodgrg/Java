import javax.swing.*;
import java.awt.*;
class Triangle extends JPanel {
	public void paintComponent(Graphics g) {
        int [] x = {50,100,0};
        int [] y = {0,100,100};
      g.setColor(Color.green);
      g.fillPolygon(x, y, 3);
     
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        Triangle panel = new Triangle();
        frame.add(panel);
        frame.setVisible(true);
    }
}

