import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class myKeyListener implements KeyListener {

    // Fields---------------------------------

    private ShootingGamePanel panel;


    //Constructor------------------------------
    public KeyListener(ShootingGamePanel panel) {
        
        this.panel = panel;
    }

    //Methods-------------------------------------

    public void keyTyped(KeyEvent e){
        if (e.getKeyChar() =='x') {
            panel.shoot();
            panel.flashBackgroundColor(Color.RED);
        }

    }

        
        public void keyPressed(){

        }
        public void keyReleased(){

        }
    

}