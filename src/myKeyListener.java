import java.awt.*;
import java.awt.event.*;


public class myKeyListener implements KeyListener {

    // Fields---------------------------------
    boolean gameRunning = false;

    private ShootingGamePanel panel;


    //Constructor------------------------------
    public myKeyListener(ShootingGamePanel panel) {
        
        this.panel = panel;
    }




    //Methods-------------------------------------

    public void keyTyped(KeyEvent e) {

        // if(panel.gameRunning){
        //     if(e.getKeyChar() == ' '){
        //         //panel.shoot();
        //     }
            
            if(e.getKeyChar() == 'a'){
                if(panel.shipX > 435){
                    panel.shipX -= 15;
                    panel.repaint();
                }
            }

            if(e.getKeyChar() == 'd'){
                if(panel.shipX < 565){
                    this.panel.shipX += 15;
                    panel.repaint();
                }
            }

            if(e.getKeyChar() == 'w'){
                if(panel.shipY > 330){
                    this.panel.shipY -= 15;
                    panel.repaint();
                }
            }

            if(e.getKeyChar() == 's'){
                if(panel.shipY < 485){
                    this.panel.shipY += 15;
                    panel.repaint();
                }
            }
        //}
    
    }

    //These methods do nothing
    public void keyPressed(KeyEvent e){
    }
    public void keyReleased(KeyEvent e){
    }
    

}