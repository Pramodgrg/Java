import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
class Flag extends JFrame{
    Flag(){
        setSize(1000,900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g){
        
		g.setColor(Color.BLACK);
		g.fillRect(10,20,10,400);
		
		int x[]={20,200,100,240,20,20};
		int y[]={20,150,150,300,300,20};
		g.setColor(Color.BLUE);
		g.fillPolygon(x,y,6);
		
		int xx[]={30,170,75,215,30,30};
		int yy[]={40,140,140,290,290,35};
		g.setColor(Color.red);
		g.fillPolygon(xx,yy,6);
		
		g.setColor(Color.WHITE);
		g.fillArc(50,80,40,40,0,-180);
		
		g.fillOval(50,200,50,50);
		}
    public static void main(String[] args){
        new Flag();
        
    }
}