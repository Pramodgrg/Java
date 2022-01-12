import java.awt.Button;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
  
import javax.swing.*;  
public class GridbagLayoutDemo extends JFrame{  
    public static void main(String[] args) {  
            GridbagLayoutDemo a = new GridbagLayoutDemo();  
        }  
        public GridbagLayoutDemo() {  
    GridBagLayout grid = new GridBagLayout();  
            GridBagConstraints gridbag = new GridBagConstraints();  
            setLayout(grid);  
            setTitle("GridBag Layout Example");  
            GridBagLayout layout = new GridBagLayout();  
    this.setLayout(layout);  
    gridbag.fill = GridBagConstraints.HORIZONTAL;  
    gridbag.gridx = 0;  
    gridbag.gridy = 0;  
    this.add(new Button("Button One"), gridbag);  
    gridbag.gridx = 1;  
    gridbag.gridy = 0;  
    this.add(new Button("Button two"), gridbag);  
    gridbag.fill = GridBagConstraints.HORIZONTAL;  
    gridbag.ipady = 20;  
    gridbag.gridx = 0;  
    gridbag.gridy = 1;  
    this.add(new Button("Button Three"), gridbag);  
    gridbag.gridx = 1;  
    gridbag.gridy = 1;  
    this.add(new Button("Button Four"), gridbag);  
    gridbag.gridx = 0;  
    gridbag.gridy = 2;  
    gridbag.fill = GridBagConstraints.HORIZONTAL;  
    gridbag.gridwidth = 2;  
    this.add(new Button("Button Five"), gridbag);  
            setSize(300, 300);  
            setPreferredSize(getSize());  
            setVisible(true);  
            setDefaultCloseOperation(EXIT_ON_CLOSE);  
      
        }  
      
}  