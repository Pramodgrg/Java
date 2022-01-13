import java.awt.Graphics;
    class LifeCycle extends Applet{
        public void init(){
            System.out.println("Initiating Applet");
        }
        public void start(){
            System.out.println("Starting of the applet");
        }
        public void paint(Graphics graphics){
            graphics.drawString("hello world", 500, 400);
        }
        public void stop(){
            System.out.println("Stopping the applet program");
        }

        public void destory(){
            System.out.println("Destroying the initiated program");
        }
    }