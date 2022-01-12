import javax.swing.*;    
import java.awt.event.*;    
public class MenuExample extends PopupMenuExample implements ActionListener 
{    
    
    JFrame frame;    
    JMenuBar menuBar;    
    JMenu file,edit,view,open;    
    JMenuItem new1, save, close, text, folder, window, panel;     
    
    MenuExample(){    
        frame=new JFrame();    
        
        new1=new JMenuItem("New");    
        save=new JMenuItem("Save");    
        close=new JMenuItem("close");    
        
        text=new JMenuItem("Text");
        folder=new JMenuItem("Folder");
        
        window=new JMenuItem("Window");
        panel=new JMenuItem("Panel");
           
        menuBar=new JMenuBar();    
        file=new JMenu("File");    
        edit=new JMenu("Edit");    
        view=new JMenu("View");
        open=new JMenu("Open");

        file.add(new1);
        file.add(save);
        file.add(close);

        edit.add(text);
        edit.add(folder);

        view.add(window);
        view.add(panel);

        frame.add(menuBar);    
        frame.setJMenuBar(menuBar);  
        frame.setLayout(null);    
        frame.setSize(400,400);    
        frame.setVisible(true);  

}     
PopupMenuExample(){  
         final JFrame f= new JFrame("PopupMenu Example");  
         final JPopupMenu popupmenu = new JPopupMenu("Edit");   
         JMenuItem cut = new JMenuItem("Cut");  
         JMenuItem copy = new JMenuItem("Copy");  
         JMenuItem paste = new JMenuItem("Paste");  
         popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);        
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
         });  
         f.add(popupmenu);   
         f.setSize(300,300);  
         f.setLayout(null);  
         f.setVisible(true);  
     }  
public void actionPerformed(ActionEvent e) {    
if(e.getSource()==open)    

public static void main(String[] args) {    
    new MenuExample();
    new PopupMenuExample();    
}    
}    