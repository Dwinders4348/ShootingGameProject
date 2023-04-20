import java.awt.*;
import java.awt.event.*;


public class myKeyListener implements KeyListener {

    // Fields---------------------------------

    private ShootingGamePanel panel;


    //Constructor------------------------------
    public myKeyListener(ShootingGamePanel panel) {
        
        this.panel = panel;
    }

    //Methods-------------------------------------

    public void keyTyped(KeyEvent e){
        if (e.getKeyChar() == 'x') {
            panel.addShipX();
        }

    }

        
        public void keyPressed(){

        }
        public void keyReleased(){

        }
    

}