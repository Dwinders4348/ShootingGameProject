import java.awt.*;
import java.awt.event.*;

/**
 * @author Damion Winders
 *  This is the keylistener for my bit blitz game
 * a
*/
public class myKeyListener implements KeyListener {

    // Fields---------------------------------
    boolean gameRunning = false;

    private ShootingGamePanel panel;


    //Constructor------------------------------
    public myKeyListener(ShootingGamePanel panel) {
        
        this.panel = panel;
    }




    //Methods-------------------------------------

    /**
     * takes a key event and move the 
     * player's ship based off of the input
     * @param KeyEvent e
     * 
     */
    public void keyTyped(KeyEvent e) {

        // if(panel.gameRunning){
        //     if(e.getKeyChar() == ' '){
        //         //panel.shoot();
        //     }
            
            if(e.getKeyChar() == 'a'){
                if(panel.shipX > 410){
                    panel.shipX -= 15;
                    panel.repaint();
                }
            }

            if(e.getKeyChar() == 'd'){
                if(panel.shipX < 550){
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