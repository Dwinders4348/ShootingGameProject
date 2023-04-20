import javax.swing.*;
import java.awt.*;
public class ShootingGamePanel extends JPanel {

    //fields------------------------------
   
    int WIDTH = 1000;
    int HEIGHT = 800;
   
    //Size of player's ship
    int SHIP_WIDTH = 20;
    int SHIP_HEIGHT = 25;
   
    int shipX = 500;
    int shipY = 700;
   
   
   
   
    //constructor---------------------------
    public ShootingGamePanel(){
        setSize(WIDTH, HEIGHT);
        
    }
       

    //methods--------------------------------

    public void flashBackgroundColor(Color color){

        this.setBackground(color);
        this.setBackground(Color.BLACK);
    }
    public void shoot(){


    }

    public void destroy(){

    }

    public void addShipX(){
        shipX += 200;
    }




    //Run the program
    public void run() throws InterruptedException {
       
        setBackground(Color.BLACK);
       
        repaint();
        //Draw player avatar (hopefully a triangle

       
       
       
       
       
       
       
    }
        //Draw player and bullet
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawLine(shipX, shipY, (shipX + SHIP_WIDTH), (shipY + SHIP_HEIGHT));
            g.drawLine((shipX), (shipY), (shipX - SHIP_WIDTH), shipY + SHIP_HEIGHT);
            g.drawLine((shipX - SHIP_WIDTH), (shipY + SHIP_HEIGHT), (shipX + SHIP_WIDTH), shipY + SHIP_HEIGHT);


        }
   
   
}
